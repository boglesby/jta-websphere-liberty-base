# Binding Liberty TransactionManager to JNDI
The Liberty TransactionManager is not bound into JNDI, but it needs to be for the Geode transaction to commit successfully. See [Troubleshooting](README-Troubleshooting.md) for details on the exception that occurs because of this.

This doc describes how to bind an arbitrary object to JNDI:

<https://www.ibm.com/support/knowledgecenter/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_dep_jndi_refentry.html>

Create a jar with an ObjectFactory like:

```
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import javax.transaction.TransactionManager;
import java.lang.reflect.Method;
import java.util.Hashtable;

public class TransactionManagerObjectFactory implements ObjectFactory {
  @Override
  public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?,?> environment) throws Exception {
    Class cl = Class.forName("com.ibm.tx.jta.TransactionManagerFactory");
    Method method = cl.getMethod("getTransactionManager", (Class[]) null);
    return (TransactionManager) method.invoke(null, (Object[]) null);
  }
}
```
Then add these elements in the `server.xml` file:

```
<library id="objectFactoryLib">
  <fileset dir="/path/to/lib" includes="objectfactory-0.0.1-SNAPSHOT.jar"/>
</library>

<jndiObjectFactory id="objectFactory" libraryRef="objectFactoryLib" className="example.jta.jndi.TransactionManagerObjectFactory" objectClassName="java.util.Properties"/>

<jndiReferenceEntry id="refEntry" jndiName="javax.transaction.TransactionManager" factoryRef="objectFactory"/>
```
When I ran the test with some added debugging in the JNDIInvoker, I saw:

```
[warn 2020/08/19 21:36:54.814 UTC <Default Executor-thread-6> tid=0x29] XXX JNDIInvoker.mapTransactions invoked
[warn 2020/08/19 21:36:54.823 UTC <Default Executor-thread-6> tid=0x29] XXX JNDIInvoker.doTransactionLookup jndiKey=javax.transaction.TransactionManager
[warn 2020/08/19 21:36:54.852 UTC <Default Executor-thread-6> tid=0x29] XXX JNDIInvoker.doTransactionLookup jndiKey=javax.transaction.TransactionManager; jndiObject=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@561526ec
```
Notes:

- no logging I added in the `TransactionManagerObjectFactory` showed up in the console.log
- I tried using one of the `java:` JNDI keys but none of them worked. I think maybe the key cannot be in the java namespace.
- there is an existing JIRA to modify JNDIInvoker to take an input TransactionManager: <https://issues.apache.org/jira/browse/GEODE-2302>