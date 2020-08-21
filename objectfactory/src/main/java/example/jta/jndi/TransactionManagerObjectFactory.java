package example.jta.jndi;

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