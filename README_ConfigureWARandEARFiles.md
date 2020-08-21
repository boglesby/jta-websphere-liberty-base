#Configure WAR and EAR Files
##WAR File
I built the Spring Boot war file initially using:

```
./gradlew clean bootWar
```
This generated a war file containing these jars in the WEB-INF/lib/ directory:

```
spring-boot-starter-data-jpa-2.3.0.RELEASE.jar
spring-geode-starter-1.3.0.RELEASE.jar
spring-boot-starter-json-2.3.0.RELEASE.jar
spring-boot-starter-aop-2.3.0.RELEASE.jar
spring-boot-starter-jdbc-2.3.0.RELEASE.jar
spring-geode-autoconfigure-1.3.0.RELEASE.jar
spring-geode-1.3.0.RELEASE.jar
spring-boot-starter-2.3.0.RELEASE.jar
spring-boot-starter-tomcat-2.3.0.RELEASE.jar
spring-boot-autoconfigure-2.3.0.RELEASE.jar
spring-boot-2.3.0.RELEASE.jar
spring-boot-starter-logging-2.3.0.RELEASE.jar
spring-boot-starter-web-2.3.0.RELEASE.jar
h2-1.4.200.jar
spring-webmvc-5.2.6.RELEASE.jar
spring-data-geode-2.3.0.RELEASE.jar
apache-geode-extensions-1.3.0.RELEASE.jar
geode-cq-1.12.0.jar
geode-lucene-1.12.0.jar
geode-wan-1.12.0.jar
geode-gfsh-1.12.0.jar
geode-core-1.12.0.jar
geode-management-1.12.0.jar
spring-web-5.2.6.RELEASE.jar
jakarta.transaction-api-1.3.3.jar
jakarta.persistence-api-2.2.3.jar
hibernate-core-5.4.15.Final.jar
spring-data-jpa-2.3.0.RELEASE.jar
spring-aspects-5.2.6.RELEASE.jar
spring-shell-1.2.0.RELEASE.jar
jackson-datatype-jsr310-2.11.0.jar
jackson-annotations-2.11.0.jar
jackson-datatype-jdk8-2.11.0.jar
jackson-module-parameter-names-2.11.0.jar
jackson-core-2.11.0.jar
geode-membership-1.12.0.jar
geode-tcp-server-1.12.0.jar
geode-logging-1.12.0.jar
geode-serialization-1.12.0.jar
geode-common-1.12.0.jar
jackson-databind-2.11.0.jar
log4j-to-slf4j-2.13.2.jar
log4j-api-2.13.2.jar
micrometer-core-1.5.1.jar
spring-data-commons-2.3.0.RELEASE.jar
spring-context-support-5.2.6.RELEASE.jar
spring-context-5.2.6.RELEASE.jar
spring-aop-5.2.6.RELEASE.jar
spring-orm-5.2.6.RELEASE.jar
spring-jdbc-5.2.6.RELEASE.jar
spring-tx-5.2.6.RELEASE.jar
spring-beans-5.2.6.RELEASE.jar
spring-expression-5.2.6.RELEASE.jar
spring-core-5.2.6.RELEASE.jar
spring-jcl-5.2.6.RELEASE.jar
antlr-2.7.7.jar
aspectjweaver-1.9.5.jar
byte-buddy-1.10.10.jar
classmate-1.5.1.jar
lucene-analyzers-phonetic-6.6.6.jar
httpclient-4.5.12.jar
commons-codec-1.14.jar
commons-lang3-3.10.jar
jakarta.el-3.0.3.jar
jaxb-runtime-2.3.3.jar
txw2-2.3.3.jar
HikariCP-3.4.5.jar
httpcore-4.4.13.jar
jakarta.activation-1.2.2.jar
jakarta.annotation-api-1.3.5.jar
jakarta.xml.bind-api-2.3.3.jar
jaxb-api-2.3.1.jar
javax.activation-api-1.2.0.jar
javax.resource-api-1.7.1.jar
javax.transaction-api-1.3.jar
hibernate-commons-annotations-5.1.0.Final.jar
jboss-logging-3.4.1.Final.jar
logback-classic-1.2.3.jar
logback-core-1.2.3.jar
jul-to-slf4j-1.7.30.jar
shiro-spring-1.4.1.jar
shiro-web-1.4.1.jar
shiro-core-1.4.1.jar
shiro-cache-1.4.1.jar
shiro-crypto-hash-1.4.1.jar
shiro-crypto-cipher-1.4.1.jar
shiro-config-ogdl-1.4.1.jar
shiro-config-core-1.4.1.jar
shiro-event-1.4.1.jar
shiro-crypto-core-1.4.1.jar
shiro-lang-1.4.1.jar
slf4j-api-1.7.30.jar
snakeyaml-1.26.jar
tomcat-embed-websocket-9.0.35.jar
tomcat-embed-core-9.0.35.jar
javassist-3.24.0-GA.jar
jandex-2.1.3.Final.jar
dom4j-2.1.3.jar
guava-17.0.jar
jline-2.12.jar
commons-io-2.6.jar
istack-commons-runtime-3.0.11.jar
jgroups-3.6.14.Final.jar
commons-validator-1.6.jar
jaxb-impl-2.3.2.jar
fastutil-8.3.0.jar
jna-platform-5.5.0.jar
jna-5.5.0.jar
jopt-simple-5.0.4.jar
classgraph-4.8.52.jar
rmiio-2.1.2.jar
geode-unsafe-1.12.0.jar
javax.activation-1.2.0.jar
lucene-analyzers-common-6.6.6.jar
lucene-queryparser-6.6.6.jar
lucene-core-6.6.6.jar
mx4j-3.0.2.jar
commons-beanutils-1.9.3.jar
commons-digester-1.8.1.jar
commons-logging-1.2.jar
commons-collections-3.2.2.jar
findbugs-annotations-1.3.9-1.jar
HdrHistogram-2.1.12.jar
LatencyUtils-2.0.3.jar
lucene-queries-6.6.6.jar
```
Based on this link, I removed all of the jars referenced in the `geode-dependencies.jar` MANIFEST from the war file.

<https://stackoverflow.com/questions/60956397/classloader-issues-gemfire-jca-resource-adapter-in-ibm-websphere-libertybase>

I did this by script in the unpacked-war directory like:

```
jar -xvf ../jta-websphere-liberty/build/libs/jta-websphere-liberty-0.0.1-SNAPSHOT.war
cd WEB-INF/lib
rm geode-common-1.12.0.jar geode-connectors-1.12.0.jar geode-core-1.12.0.jar geode-cq-1.12.0.jar geode-gfsh-1.12.0.jar geode-log4j-1.12.0.jar geode-logging-1.12.0.jar geode-lucene-1.12.0.jar geode-management-1.12.0.jar geode-memcached-1.12.0.jar geode-old-client-support-1.12.0.jar geode-protobuf-1.12.0.jar geode-protobuf-messages-1.12.0.jar geode-rebalancer-1.12.0.jar geode-redis-1.12.0.jar geode-serialization-1.12.0.jar geode-tcp-server-1.12.0.jar geode-wan-1.12.0.jar jackson-databind-2.10.0.jar jackson-annotations-2.10.0.jar jackson-core-2.10.0.jar geode-membership-1.12.0.jar geode-http-service-1.12.0.jar geode-unsafe-1.12.0.jar HikariCP-3.4.5.jar commons-lang3-3.9.jar jaxb-api-2.3.1.jar log4j-jcl-2.12.1.jar log4j-api-2.12.1.jar spring-shell-1.2.0.RELEASE.jar rmiio-2.1.2.jar jaxb-impl-2.3.2.jar antlr-2.7.7.jar javax.activation-1.2.0.jar istack-commons-runtime-3.0.9.jar commons-validator-1.6.jar shiro-core-1.4.1.jar shiro-config-ogdl-1.4.1.jar commons-beanutils-1.9.4.jar commons-collections-3.2.2.jar commonsslf4j-impl-2.12.1.jar log4j-core-2.12.1.jar log4j-jul-2.12.1.jar lucene-analyzers-phonetic-6.6.6.jar lucene-analyzers-common-6.6.6.jar lucene-queryparser-6.6.6.jar lucene-core-6.6.6.jar lucene-queries-6.6.6.jar protobuf-java-3.10.0.jar geo-0.7.1.jar netty-all-4.1.42.Final.jar grumpy-core-0.2.2.jar commons-math3-3.2.jar
rm jul-to-slf4j-1.7.30.jar log4j-api-2.13.2.jar log4j-to-slf4j-2.13.2.jar logback-classic-1.2.3.jar logback-core-1.2.3.jar slf4j-api-1.7.30.jar
cd ../..
jar -cvf jta-websphere-liberty.war .
```
Note: See [Troubleshooting](README_Troubleshooting.md) for the exception that caused me to remove the logging jars.

##EAR File
The ear file contains:

- the geode-jca-9.10.2.rar file
- the jta-websphere-liberty.war file
- lib directory containing all the jars referenced in the `geode-dependencies.jar` MANIFEST
- META-INF/application.xml file

I created it by script in the ear directory like:

```
cp ../unpacked-war/jta-websphere-liberty.war .
jar -cvf jta-websphere-liberty.ear .
```
###geode-jca-9.10.2.rar
The rar file contains the Resource Adapter which defines the Geode JCA classes.

The WebSphere Liberty `ra.xml` file should look like:

```
<?xml version="1.0" encoding="UTF-8"?>

<connector xmlns="http://java.sun.com/xml/ns/j2ee"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee
  http://java.sun.com/xml/ns/j2ee/connector_1_5.xsd"
  version="1.5">

  <display-name>GFE JCA Adaptor</display-name>
  <vendor-name></vendor-name>
  <spec-version>1.5</spec-version>
  <eis-type>GFE JCA</eis-type>
  <version>1.5</version>
  <resourceadapter>
    <config-property>
      <config-property-name>ProductName</config-property-name>
      <config-property-type>java.lang.String</config-property-type>
      <config-property-value>GemFire</config-property-value>
    </config-property>
    <config-property>
      <config-property-name>UserName</config-property-name>
      <config-property-type>java.lang.String</config-property-type>
      <config-property-value/>
    </config-property>
    <config-property>
      <config-property-name>Version</config-property-name>
      <config-property-type>java.lang.String</config-property-type>
      <config-property-value>8.0</config-property-value>
    </config-property>
      
    <outbound-resourceadapter>
      <connection-definition>
        <managedconnectionfactory-class>org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory</managedconnectionfactory-class>
        <connectionfactory-interface>org.apache.geode.ra.GFConnectionFactory</connectionfactory-interface>
        <connectionfactory-impl-class>org.apache.geode.internal.ra.GFConnectionFactoryImpl</connectionfactory-impl-class>
        <connection-interface>org.apache.geode.ra.GFConnection</connection-interface>
        <connection-impl-class>org.apache.geode.internal.ra.GFConnectionImpl</connection-impl-class>
      </connection-definition>
      <transaction-support>LocalTransaction</transaction-support>
      <reauthentication-support>false</reauthentication-support>
    </outbound-resourceadapter>
  </resourceadapter>
</connector>
```
Note: See [Troubleshooting](README_Troubleshooting.md) for the exception that occurred attempting to deploy the `geode-jca-9.10.2.rar` file contained in the Geode product lib directory.

###lib Directory
The lib directory contains all the jars referenced in the geode-dependencies.jar MANIFEST:

```
HdrHistogram-2.1.11.jar
LatencyUtils-2.0.3.jar
antlr-2.7.7.jar
classgraph-4.8.52.jar
commons-beanutils-1.9.4.jar
commons-codec-1.11.jar
commons-collections-3.2.2.jar
commons-io-2.6.jar
commons-lang3-3.9.jar
commons-logging-1.2.jar
commons-math3-3.2.jar
commons-validator-1.6.jar
fastutil-8.3.0.jar
geo-0.7.1.jar
geode-common-1.12.0.jar
geode-connectors-1.12.0.jar
geode-core-1.12.0.jar
geode-cq-1.12.0.jar
geode-gfsh-1.12.0.jar
geode-http-service-1.12.0.jar
geode-log4j-1.12.0.jar
geode-logging-1.12.0.jar
geode-lucene-1.12.0.jar
geode-management-1.12.0.jar
geode-membership-1.12.0.jar
geode-memcached-1.12.0.jar
geode-old-client-support-1.12.0.jar
geode-protobuf-1.12.0.jar
geode-protobuf-messages-1.12.0.jar
geode-rebalancer-1.12.0.jar
geode-redis-1.12.0.jar
geode-serialization-1.12.0.jar
geode-tcp-server-1.12.0.jar
geode-unsafe-1.12.0.jar
geode-wan-1.12.0.jar
grumpy-core-0.2.2.jar
httpclient-4.5.10.jar
httpcore-4.4.12.jar
istack-commons-runtime-3.0.9.jar
jackson-annotations-2.10.0.jar
jackson-core-2.10.0.jar
jackson-databind-2.10.0.jar
javax.activation-1.2.0.jar
javax.activation-api-1.2.0.jar
javax.resource-api-1.7.1.jar
javax.servlet-api-3.1.0.jar
javax.transaction-api-1.3.jar
jaxb-api-2.3.1.jar
jaxb-impl-2.3.2.jar
jetty-http-9.4.21.v20190926.jar
jetty-io-9.4.21.v20190926.jar
jetty-security-9.4.21.v20190926.jar
jetty-server-9.4.21.v20190926.jar
jetty-servlet-9.4.21.v20190926.jar
jetty-util-9.4.21.v20190926.jar
jetty-webapp-9.4.21.v20190926.jar
jetty-xml-9.4.21.v20190926.jar
jgroups-3.6.14.Final.jar
jline-2.12.jar
jna-5.5.0.jar
jna-platform-5.5.0.jar
jopt-simple-5.0.4.jar
log4j-api-2.12.1.jar
log4j-core-2.12.1.jar
log4j-jcl-2.12.1.jar
log4j-jul-2.12.1.jar
log4j-slf4j-impl-2.12.1.jar
lucene-analyzers-common-6.6.6.jar
lucene-analyzers-phonetic-6.6.6.jar
lucene-core-6.6.6.jar
lucene-queries-6.6.6.jar
lucene-queryparser-6.6.6.jar
micrometer-core-1.2.1.jar
netty-all-4.1.42.Final.jar
protobuf-java-3.10.0.jar
rmiio-2.1.2.jar
shiro-cache-1.4.1.jar
shiro-config-core-1.4.1.jar
shiro-config-ogdl-1.4.1.jar
shiro-core-1.4.1.jar
shiro-crypto-cipher-1.4.1.jar
shiro-crypto-core-1.4.1.jar
shiro-crypto-hash-1.4.1.jar
shiro-event-1.4.1.jar
shiro-lang-1.4.1.jar
slf4j-api-1.7.28.jar
snappy-0.4.jar
spring-core-5.2.1.RELEASE.jar
spring-jcl-5.2.1.RELEASE.jar
spring-shell-1.2.0.RELEASE.jar
swagger-annotations-1.5.23.jar
```
I am not at all sure if all of these jars need to be in the ear lib directory. This is what I did, though.

###application.xml
I used this `application.xml` file:

```
<?xml version="1.0" encoding="UTF-8"?>
<application xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/application_7.xsd" version="7">
  <description>EAR for The security and entitlements module.</description>
  <display-name>jta-websphere-liberty-ear</display-name>
  <module>
    <web>
      <web-uri>/jta-websphere-liberty.war</web-uri>
      <context-root>/jta-websphere-liberty</context-root>
    </web>
  </module>
  <module>
    <connector>/geode-jca-9.10.2.rar</connector>
  </module>
  <library-directory>lib</library-directory>
</application>
```