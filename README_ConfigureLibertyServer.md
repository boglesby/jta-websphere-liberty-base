# Configure Liberty Server

## server.xml File
The Liberty server is configured mainly through the `server.xml` file. It defines all the elements of the server and the applications deployed to it.

For the defaultServer server, it is located here:

```
/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/server.xml
```

The `server.xml` file for this application is:

```
<?xml version="1.0" encoding="UTF-8"?><server description="new server">

  <featureManager>
    <feature>webProfile-8.0</feature>
    <feature>jca-1.7</feature>
    <feature>jndi-1.0</feature>
  </featureManager>

  <httpEndpoint host="ec2-xxx.ca-central-1.compute.amazonaws.com" httpPort="9080" httpsPort="9443" id="defaultHttpEndpoint"/>

  <applicationManager autoExpand="true"/>

  <transaction recoverOnStartup="true" waitForRecovery="false" acceptHeuristicHazard="true" heuristicRetryInterval="0" heuristicRetryWait="0" lpsHeuristicCompletion="ROLLBACK"/>

  <library id="H2JDBCLib">
    <fileset dir="/home/midvision/deploy/lib" includes="h2-1.4.200.jar"/>
  </library>

  <library id="objectFactoryLib"> 
    <fileset dir="/home/midvision/deploy/lib" includes="objectfactory-0.0.1-SNAPSHOT.jar"/>   
  </library>

  <dataSource id="h2test" jndiName="jdbc/h2test" type="javax.sql.XADataSource">
    <jdbcDriver
      javax.sql.XADataSource="org.h2.jdbcx.JdbcDataSource"
      javax.sql.ConnectionPoolDataSource="org.h2.jdbcx.JdbcDataSource"
      javax.sql.DataSource="org.h2.jdbcx.JdbcDataSource"
      libraryRef="H2JDBCLib"/>
    <properties URL="jdbc:h2:mem:testdb"/>
  </dataSource>

  <jndiObjectFactory id="objectFactory" libraryRef="objectFactoryLib" className="example.jta.jndi.TransactionManagerObjectFactory" objectClassName="javax.transaction.TransactionManager"/>

  <jndiReferenceEntry id="refEntry" jndiName="javax.transaction.TransactionManager" factoryRef="objectFactory"/>

  <application location="/home/midvision/deploy/app/jta-websphere-liberty.ear" name="jta-websphere-liberty" id="jta-websphere-liberty">
    <resourceAdapter id="geode-jca-9.10.2" alias="gemfireJCA"/> 
  </application>

  <connectionFactory jndiName="gfe/jca" id="gemfire-jca">
    <properties.jta-websphere-liberty.gemfireJCA ProductName="GemFire" UserName="" Version="8.0"/>
  </connectionFactory>

  <logging traceSpecification="Transaction=all:WAS.j2c=all:com.ibm.ws.uow*=all:com.ibm.ejs*=all:com.ibm.tx*=all" traceFileName="trace_ws.log" maxFileSize="20" maxFiles="10" traceFormat="BASIC"/>

</server>
```
## server.xml Contents
### Feature Manager
The `featureManager` element describes the features enabled in the Liberty server.

I configured these features to configure JNDI, JCA and Web support:

```
<featureManager>
  <feature>webProfile-8.0</feature>
  <feature>jca-1.7</feature>
  <feature>jndi-1.0</feature>
</featureManager>
```
This installed these features:

```
[AUDIT   ] CWWKF0012I: The server installed the following features: [appSecurity-2.0, appSecurity-3.0, beanValidation-2.0, cdi-2.0, distributedMap-1.0, ejbLite-3.2, jaspic-1.1, jaxrs-2.1, jaxrsClient-2.1, jca-1.7, jdbc-4.2, jndi-1.0, jpa-2.2, jpaContainer-2.2, jsf-2.3, jsonb-1.0, jsonp-1.1, managedBeans-1.0, servlet-4.0, ssl-1.0, webProfile-8.0, websocket-1.1].
```
### Transaction
The `transaction` element configures the transaction manager.

```
<transaction recoverOnStartup="true" waitForRecovery="false" acceptHeuristicHazard="true" heuristicRetryInterval="0" heuristicRetryWait="0" lpsHeuristicCompletion="ROLLBACK"/>
```
The main setting in this configuration is `acceptHeuristicHazard="true"`. Without this, there is no last participant support (which is Geode in this case).

This doc sescribes the `acceptHeuristicHazard` property:

<https://www.ibm.com/support/knowledgecenter/en/SSAW57_8.5.5/com.ibm.websphere.nd.multiplatform.doc/ae/tjta_settlog.html>

```
Select this option to specify that all applications on this server accept the possibility of a heuristic hazard occurring in a two-phase transaction that contains a one-phase resource. This setting configures last participant support (LPS) for the server. If you do not select this option, you must configure applications individually to accept the heuristic hazard.
```

### Library
The `library` element defines shared libraries.

In this case, there are two, namely H2 and a customer ObjectFactory that maps the TransactionManager to JNDI for Geode's JNDIInvoker to find.

```
<library id="H2JDBCLib">
  <fileset dir="/home/midvision/deploy/lib" includes="h2-1.4.200.jar"/>
</library>

<library id="objectFactoryLib"> 
  <fileset dir="/home/midvision/deploy/lib" includes="objectfactory-0.0.1-SNAPSHOT.jar"/>   
</library>
```
### DataSource
The `dataSource` element configures the JDBC DataSource. Several databases have custom configuration, but depending on the docs I read (and code I looked at), I didn't see custom configuration for H2.

This doc describes configuring the `dataSource`:

<https://www.ibm.com/support/knowledgecenter/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_dep_configuring_ds.html>

```
<dataSource id="h2test" jndiName="jdbc/h2test" type="javax.sql.XADataSource">
  <jdbcDriver
    javax.sql.XADataSource="org.h2.jdbcx.JdbcDataSource"
    javax.sql.ConnectionPoolDataSource="org.h2.jdbcx.JdbcDataSource"
    javax.sql.DataSource="org.h2.jdbcx.JdbcDataSource"
    libraryRef="H2JDBCLib"/>
  <properties URL="jdbc:h2:mem:testdb"/>
</dataSource>
```
Since jdbc-4.2 was configured, the main setting is `type="javax.sql.XADataSource"`. The jdbc-4.3 feature requires JDK 11.

From the docs:

```
When the data source type is omitted, Liberty chooses the data source type in the following order, depending on which is available, if you are using the jdbc-4.3 feature or higher or if it is the default data source:

javax.sql.XADataSource
javax.sql.ConnectionPoolDataSource
javax.sql.DataSource

If you are using the jdbc-4.2 feature, the jdbc-4.1 feature, or the jdbc-4.0 feature and it is not the default data source, then Liberty chooses the data source type in the following order, depending on which is available:

javax.sql.ConnectionPoolDataSource
javax.sql.DataSource
javax.sql.XADataSource
```
### JNDI
The `jndiObjectFactory` element defines an ObjectFactory (in this case a `TransactionManagerObjectFactory`) that returns an object of a specific type. The `jndiReferenceEntry` binds the object returned from that ObjectFactory to a JNDI name (in this case `javax.transaction.TransactionManager`).

This doc describes configuring the `jndiObjectFactory` and `jndiReferenceEntry`:

<https://www.ibm.com/support/knowledgecenter/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_dep_jndi_refentry.html>

```
<jndiObjectFactory id="objectFactory" libraryRef="objectFactoryLib" className="example.jta.jndi.TransactionManagerObjectFactory" objectClassName="javax.transaction.TransactionManager"/>

<jndiReferenceEntry id="refEntry" jndiName="javax.transaction.TransactionManager" factoryRef="objectFactory"/>
```
### Application
The `application` element configures the application location (ear file) and name. When the ear file is dropped in that directory, it is automatically redeployed.

It also associates the Geode JCA Resource Adapter. This doc describes configuring the `resourceAdapter`:
 
<https://www.ibm.com/support/knowledgecenter/en/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_jca_config_resadapters.html>

```
<application location="/home/midvision/deploy/app/jta-websphere-liberty.ear" name="jta-websphere-liberty" id="jta-websphere-liberty">
  <resourceAdapter id="geode-jca-9.10.2" alias="gemfireJCA"/> 
</application>
```
### Connection Factory
The `connectionFactory` element binds the Geode JCA Resource Adapter with a JNDI name.

This doc describes configuring the `connectionFactory`:

<https://www.ibm.com/support/knowledgecenter/en/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_jca_config_confact.html>

```
<connectionFactory jndiName="gfe/jca" id="gemfire-jca">
  <properties.jta-websphere-liberty.gemfireJCA ProductName="GemFire" UserName="" Version="8.0"/>
</connectionFactory>
```
### Logging
The logging element configures `trace` logging. Some configuration is based on package/class structure (e.g. com.ibm.ejs). Some is custom.

```
<logging traceSpecification="Transaction=all:WAS.j2c=all:com.ibm.ws.uow*=all:com.ibm.ejs*=all:com.ibm.tx*=all" traceFileName="trace_ws.log" maxFileSize="20" maxFiles="10" traceFormat="BASIC"/>
```
Here are some examples of custom logging configuration:

```
public final class ConnectionEventListener implements javax.resource.spi.ConnectionEventListener {
  private static final TraceComponent tc = Tr.register(ConnectionEventListener.class, J2CConstants.traceSpec, J2CConstants.messageFile);

public class UserTransactionImpl implements UserTransaction {
  private static TraceComponent tc = Tr.register(com.ibm.tx.jta.impl.UserTransactionImpl.class, TranConstants.TRACE_GROUP, TranConstants.NLS_FILE);

public class TranManagerSet implements ExtendedTransactionManager, UOWCurrent {
  private static final TraceComponent tc=Tr.register(TranManagerSet.class, TranConstants.TRACE_GROUP, TranConstants.NLS_FILE);
```
Notes:

- `TranConstants.TRACE_GROUP = "Transaction"` (so to get all logging for any Transaction component add `Transaction=all` to the traceSpecification)
- `J2CConstants.traceSpec = "WAS.j2c"` (so to get all logging for any J2C component add `WAS.j2c=all` to the traceSpecification)
