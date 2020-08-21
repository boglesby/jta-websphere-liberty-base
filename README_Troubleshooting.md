#Troubleshooting
##Logging
Originally, the war file contained these logging jars:

```
jul-to-slf4j-1.7.30.jar
log4j-api-2.13.2.jar
log4j-to-slf4j-2.13.2.jar
slf4j-api-1.7.30.jar
```
And the ear file contained these logging jars:

```
log4j-api-2.12.1.jar
log4j-core-2.12.1.jar
log4j-jcl-2.12.1.jar
log4j-jul-2.12.1.jar
log4j-slf4j-impl-2.12.1.jar
slf4j-api-1.7.28.jar
```
The `console.log` showed these messages:

```
[8/12/20 18:03:42:368 UTC] 000005c7 com.ibm.ws.logging.internal.impl.IncidentImpl                I FFDC1015I: An FFDC Incident has been created: "java.util.ServiceConfigurationError: Error instantiating :org.springframework.data.gemfire.repository.cdi.GemfireRepositoryExtension com.ibm.ws.container.service.state.internal.ApplicationStateManager 54" at ffdc_20.08.12_18.03.42.2.log
[8/12/20 18:03:42:445 UTC] 000005c7 com.ibm.ws.logging.internal.impl.IncidentImpl                I FFDC1015I: An FFDC Incident has been created: "com.ibm.ws.container.service.state.StateChangeException: java.util.ServiceConfigurationError: Error instantiating :org.springframework.data.gemfire.repository.cdi.GemfireRepositoryExtension com.ibm.ws.app.manager.module.internal.SimpleDeployedAppInfoBase 548" at ffdc_20.08.12_18.03.42.3.log
[8/12/20 18:03:42:450 UTC] 000005c7 ws.app.manager.connector.internal.ConnectorModuleHandlerImpl A J2CA7009I: The resource adapter jta-websphere-liberty.geode-jca-9.10.2 has uninstalled successfully.
[8/12/20 18:03:42:452 UTC] 000005c7 om.ibm.ws.app.manager.ear.internal.EARApplicationHandlerImpl E CWWKZ0106E: Could not start web application jta-websphere-liberty.
[8/12/20 18:03:42:452 UTC] 000005c7 com.ibm.ws.app.manager.AppMessageHelper                      E CWWKZ0002E: An exception occurred while starting the application jta-websphere-liberty. The exception message was: com.ibm.ws.container.service.state.StateChangeException: java.util.ServiceConfigurationError: Error instantiating :org.springframework.data.gemfire.repository.cdi.GemfireRepositoryExtension
```
The IncidentImpl logs above show where the ffdc log is generated.

In this case, the /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/logs/ffdc/ffdc_20.08.12_18.03.42.3.log showed:

```
Stack Dump = com.ibm.ws.container.service.state.StateChangeException: java.util.ServiceConfigurationError: Error instantiating :org.springframework.data.gemfire.repository.cdi.GemfireRepositoryExtension
	at com.ibm.ws.container.service.state.internal.ApplicationStateManager.fireStarting(ApplicationStateManager.java:55)
	at com.ibm.ws.container.service.state.internal.StateChangeServiceImpl.fireApplicationStarting(StateChangeServiceImpl.java:50)
	at com.ibm.ws.app.manager.module.internal.SimpleDeployedAppInfoBase.preDeployApp(SimpleDeployedAppInfoBase.java:547)
	at com.ibm.ws.app.manager.module.internal.SimpleDeployedAppInfoBase.installApp(SimpleDeployedAppInfoBase.java:508)
	at com.ibm.ws.app.manager.module.internal.DeployedAppInfoBase.deployApp(DeployedAppInfoBase.java:347)
	at com.ibm.ws.app.manager.ear.internal.EARApplicationHandlerImpl.install(EARApplicationHandlerImpl.java:76)
	at com.ibm.ws.app.manager.internal.statemachine.StartAction.execute(StartAction.java:144)
	at com.ibm.ws.app.manager.internal.statemachine.ApplicationStateMachineImpl.enterState(ApplicationStateMachineImpl.java:1295)
	at com.ibm.ws.app.manager.internal.statemachine.ApplicationStateMachineImpl.performAction(ApplicationStateMachineImpl.java:1142)
	at com.ibm.ws.app.manager.internal.statemachine.ApplicationStateMachineImpl.run(ApplicationStateMachineImpl.java:894)
	at com.ibm.ws.threading.internal.ExecutorServiceImpl$RunnableWrapper.run(ExecutorServiceImpl.java:239)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.ServiceConfigurationError: Error instantiating :org.springframework.data.gemfire.repository.cdi.GemfireRepositoryExtension
	at org.jboss.weld.util.ServiceLoader.createInstance(ServiceLoader.java:315)
	at org.jboss.weld.util.ServiceLoader.prepareInstance(ServiceLoader.java:247)
	at org.jboss.weld.util.ServiceLoader.loadService(ServiceLoader.java:215)
	at org.jboss.weld.util.ServiceLoader.loadServiceFile(ServiceLoader.java:185)
	at org.jboss.weld.util.ServiceLoader.reload(ServiceLoader.java:165)
	at org.jboss.weld.util.ServiceLoader.iterator(ServiceLoader.java:289)
	at com.ibm.ws.cdi.impl.weld.WebSphereCDIDeploymentImpl.getExtensions(WebSphereCDIDeploymentImpl.java:469)
	at com.ibm.ws.cdi.impl.CDIContainerImpl.startInitialization(CDIContainerImpl.java:144)
	at com.ibm.ws.cdi.liberty.CDIRuntimeImpl.applicationStarting(CDIRuntimeImpl.java:453)
	at com.ibm.ws.container.service.state.internal.ApplicationStateManager.fireStarting(ApplicationStateManager.java:51)
	... 13 more
Caused by: java.lang.ExceptionInInitializerError
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.jboss.weld.util.ServiceLoader.createInstance(ServiceLoader.java:313)
	... 22 more
Caused by: org.apache.logging.log4j.LoggingException: log4j-slf4j-impl cannot be present with log4j-to-slf4j
	at org.apache.logging.slf4j.Log4jLoggerFactory.validateContext(Log4jLoggerFactory.java:49)
	at org.apache.logging.slf4j.Log4jLoggerFactory.newLogger(Log4jLoggerFactory.java:39)
	at org.apache.logging.slf4j.Log4jLoggerFactory.newLogger(Log4jLoggerFactory.java:30)
	at org.apache.logging.log4j.spi.AbstractLoggerAdapter.getLogger(AbstractLoggerAdapter.java:54)
	at org.apache.logging.slf4j.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:30)
	at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:358)
	at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:383)
	at org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport.<clinit>(CdiRepositoryExtensionSupport.java:54)
	... 27 more
```
I tried these things:

- Remove logging jars from the ear
- Remove just the log4j-slf4j-impl-2.12.1.jar from the ear
- Remove just the log4j-to-slf4j-2.13.2.jar from the war
- Remove all logging jars from the war

###Remove logging jars from the ear

No Geode logging appeared with this change.

It also caused:

```
Caused by: java.lang.NoClassDefFoundError: Could not initialize class org.apache.geode.internal.cache.GemFireCacheImpl
	at org.apache.geode.cache.client.ClientCacheFactory.getInternalClientCache(ClientCacheFactory.java:221) ~[geode-core-1.12.0.jar:na]
	at org.apache.geode.cache.client.ClientCacheFactory.getAnyInstance(ClientCacheFactory.java:668) ~[geode-core-1.12.0.jar:na]
	at org.springframework.data.gemfire.util.CacheUtils.getClientCache(CacheUtils.java:165) ~[spring-data-geode-2.3.0.RELEASE.jar:2.3.0.RELEASE]
	at org.springframework.data.gemfire.util.CacheUtils.resolveGemFireCache(CacheUtils.java:173) ~[spring-data-geode-2.3.0.RELEASE.jar:2.3.0.RELEASE]
	at org.springframework.geode.boot.autoconfigure.RegionTemplateAutoConfiguration.handlePrematureCacheCreation(RegionTemplateAutoConfiguration.java:269) ~[spring-geode-autoconfigure-1.3.0.RELEASE.jar:1.3.0.RELEASE]
	at org.springframework.geode.boot.autoconfigure.RegionTemplateAutoConfiguration.regionTemplateBeanPostProcessor(RegionTemplateAutoConfiguration.java:222) ~[spring-geode-autoconfigure-1.3.0.RELEASE.jar:1.3.0.RELEASE]
	at org.springframework.geode.boot.autoconfigure.RegionTemplateAutoConfiguration$$EnhancerBySpringCGLIB$$5fe09191.CGLIB$regionTemplateBeanPostProcessor$1(<generated>) ~[spring-geode-autoconfigure-1.3.0.RELEASE.jar:1.3.0.RELEASE]
	at org.springframework.geode.boot.autoconfigure.RegionTemplateAutoConfiguration$$EnhancerBySpringCGLIB$$5fe09191$$FastClassBySpringCGLIB$$a818a27c.invoke(<generated>) ~[spring-geode-autoconfigure-1.3.0.RELEASE.jar:1.3.0.RELEASE]
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:244) ~[spring-core-5.2.6.RELEASE.jar:5.2.6.RELEASE]
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:331) ~[spring-context-5.2.6.RELEASE.jar:5.2.6.RELEASE]
	at org.springframework.geode.boot.autoconfigure.RegionTemplateAutoConfiguration$$EnhancerBySpringCGLIB$$5fe09191.regionTemplateBeanPostProcessor(<generated>) ~[spring-geode-autoconfigure-1.3.0.RELEASE.jar:1.3.0.RELEASE]
```
###Remove just the log4j-slf4j-impl-2.12.1.jar from the ear:

This caused:

```
Caused by: java.lang.ClassCastException: org.apache.logging.slf4j.SLF4JLogger cannot be cast to org.apache.logging.log4j.core.Logger
	at org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider.getRootLoggerContext(Log4jLoggingProvider.java:105)
	at org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider.getConfiguration(Log4jLoggingProvider.java:109)
	at org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider.isUsingGemFireDefaultConfig(Log4jLoggingProvider.java:94)
	at org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider.shouldUpdateLogLevels(Log4jLoggingProvider.java:143)
	at org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider.configure(Log4jLoggingProvider.java:121)
	at org.apache.geode.logging.internal.Configuration.configChanged(Configuration.java:143)
	at org.apache.geode.logging.internal.Configuration.initialize(Configuration.java:132)
	at org.apache.geode.logging.internal.LoggingSession.createSession(LoggingSession.java:69)
	at org.apache.geode.distributed.internal.InternalDistributedSystem.initialize(InternalDistributedSystem.java:704)
	at org.apache.geode.distributed.internal.InternalDistributedSystem.access$200(InternalDistributedSystem.java:135)
	at org.apache.geode.distributed.internal.InternalDistributedSystem$Builder.build(InternalDistributedSystem.java:3036)
	at org.apache.geode.distributed.internal.InternalDistributedSystem.connectInternal(InternalDistributedSystem.java:290)
	at org.apache.geode.distributed.internal.InternalDistributedSystem.connectInternal(InternalDistributedSystem.java:216)
	at org.apache.geode.cache.client.ClientCacheFactory.connectInternalDistributedSystem(ClientCacheFactory.java:280)
	at org.apache.geode.cache.client.ClientCacheFactory.basicCreate(ClientCacheFactory.java:250)
	at org.apache.geode.cache.client.ClientCacheFactory.create(ClientCacheFactory.java:216)
	at org.springframework.data.gemfire.client.ClientCacheFactoryBean.createCache(ClientCacheFactoryBean.java:397)
	at org.springframework.data.gemfire.CacheFactoryBean.resolveCache(CacheFactoryBean.java:321)
	at org.springframework.data.gemfire.CacheFactoryBean.init(CacheFactoryBean.java:267)
```
###Remove just the log4j-to-slf4j-2.13.2.jar from the war:

This caused:

```
[8/12/20 21:57:03:136 UTC] 00000316 com.ibm.ws.logging.internal.impl.IncidentImpl                I FFDC1015I: An FFDC Incident has been created: "java.lang.IllegalArgumentException: LoggerFactory is not a Logback LoggerContext but Logback is on the classpath. Either remove Logback or the competing implementation (class org.apache.logging.slf4j.Log4jLoggerFactory loaded from file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/log4j-slf4j-impl-2.12.1.jar). If you are using WebLogic you will need to add 'org.slf4j' to prefer-application-packages in WEB-INF/weblogic.xml: org.apache.logging.slf4j.Log4jLoggerFactory com.ibm.ws.webcontainer.osgi.DynamicVirtualHost startWebApp" at ffdc_20.08.12_21.57.03.0.log
```
###Remove all logging jars from the war:

This worked, but it only shows Geode log messages and not SB log messages.

##Product geode-jca-1.12.0.rar file
The contents of the `ra.xml` in the `geode-jca-1.12.0.rar` contained in the Geode product tree is not formatted correctly.

That rar file looks like:

```
<?xml version="1.0" encoding="UTF-8"?>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->

<!DOCTYPE connector PUBLIC '-//Sun Microsystems, Inc.//DTD Connector 1.0//EN' 'http://java.sun.com/j2ee/dtds/connector_1_0.dtd'>

<connector>
    <display-name>GFE JCA Adaptor</display-name>
    <vendor-name></vendor-name>
    <spec-version>1.5</spec-version>
    <eis-type>GFE JCA</eis-type>
    <version>1.5</version>
    <resourceadapter>
        <managedconnectionfactory-class>org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory</managedconnectionfactory-class>
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
        
        <connectionfactory-interface>org.apache.geode.ra.GFConnectionFactory</connectionfactory-interface>
        <connectionfactory-impl-class>org.apache.geode.internal.ra.GFConnectionFactoryImpl</connectionfactory-impl-class>
        <connection-interface>org.apache.geode.ra.GFConnection</connection-interface>
        <connection-impl-class>org.apache.geode.internal.ra.GFConnectionImpl</connection-impl-class>
        <transaction-support>LocalTransaction</transaction-support>
        <reauthentication-support>false</reauthentication-support> 
    </resourceadapter>
</connector>
```
It produced this exception:

```
[ERROR   ] CWWKZ0114E: Application jta-websphere-liberty encountered an error when accessing the contents of module /geode-jca-9.10.2.rar of type connector: com.ibm.wsspi.adaptable.module.UnableToAdaptException: javax.xml.bind.UnmarshalException
 - with linked exception:
[org.xml.sax.SAXParseExceptionpublicId: -//Sun Microsystems, Inc.//DTD Connector 1.0//EN; systemId: http://www.oracle.com/webfolder/technetwork/jsc/j2ee/dtds/connector_1_0.dtd; lineNumber: 1; columnNumber: 1; The markup declarations contained or pointed to by the document type declaration must be well-formed.]
	at com.ibm.ws.jca.internal.ConnectorAdapter.adapt(ConnectorAdapter.java:107)
	at [internal classes]
Caused by: javax.xml.bind.UnmarshalException
 - with linked exception:
[org.xml.sax.SAXParseExceptionpublicId: -//Sun Microsystems, Inc.//DTD Connector 1.0//EN; systemId: http://www.oracle.com/webfolder/technetwork/jsc/j2ee/dtds/connector_1_0.dtd; lineNumber: 1; columnNumber: 1; The markup declarations contained or pointed to by the document type declaration must be well-formed.]
	at javax.xml.bind.helpers.AbstractUnmarshallerImpl.createUnmarshalException(AbstractUnmarshallerImpl.java:335)
	at com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallerImpl.createUnmarshalException(UnmarshallerImpl.java:563)
	at com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallerImpl.unmarshal0(UnmarshallerImpl.java:249)
	at com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallerImpl.unmarshal(UnmarshallerImpl.java:214)
	at javax.xml.bind.helpers.AbstractUnmarshallerImpl.unmarshal(AbstractUnmarshallerImpl.java:140)
	at javax.xml.bind.helpers.AbstractUnmarshallerImpl.unmarshal(AbstractUnmarshallerImpl.java:123)
	at com.ibm.ws.jca.utils.metagen.DeploymentDescriptorParser.parseResourceAdapterXml(DeploymentDescriptorParser.java:178)
	... 1 more
Caused by: org.xml.sax.SAXParseExceptionpublicId: -//Sun Microsystems, Inc.//DTD Connector 1.0//EN; systemId: http://www.oracle.com/webfolder/technetwork/jsc/j2ee/dtds/connector_1_0.dtd; lineNumber: 1; columnNumber: 1; The markup declarations contained or pointed to by the document type declaration must be well-formed.
	at com.sun.org.apache.xerces.internal.util.ErrorHandlerWrapper.createSAXParseException(ErrorHandlerWrapper.java:203)
	at com.sun.org.apache.xerces.internal.util.ErrorHandlerWrapper.fatalError(ErrorHandlerWrapper.java:177)
	at com.sun.org.apache.xerces.internal.impl.XMLErrorReporter.reportError(XMLErrorReporter.java:400)
	at com.sun.org.apache.xerces.internal.impl.XMLErrorReporter.reportError(XMLErrorReporter.java:327)
	at com.sun.org.apache.xerces.internal.impl.XMLScanner.reportFatalError(XMLScanner.java:1473)
	at com.sun.org.apache.xerces.internal.impl.XMLDTDScannerImpl.scanDecls(XMLDTDScannerImpl.java:2070)
	at com.sun.org.apache.xerces.internal.impl.XMLDTDScannerImpl.scanDTDExternalSubset(XMLDTDScannerImpl.java:307)
	at com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl$DTDDriver.dispatch(XMLDocumentScannerImpl.java:1174)
	at com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl$DTDDriver.next(XMLDocumentScannerImpl.java:1045)
	at com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl$PrologDriver.next(XMLDocumentScannerImpl.java:959)
	at com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl.next(XMLDocumentScannerImpl.java:602)
	at com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl.next(XMLNSDocumentScannerImpl.java:112)
	at com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl.scanDocument(XMLDocumentFragmentScannerImpl.java:505)
	at com.sun.org.apache.xerces.internal.parsers.XML11Configuration.parse(XML11Configuration.java:842)
	at com.sun.org.apache.xerces.internal.parsers.XML11Configuration.parse(XML11Configuration.java:771)
	at com.sun.org.apache.xerces.internal.parsers.XMLParser.parse(XMLParser.java:141)
	at com.sun.org.apache.xerces.internal.parsers.AbstractSAXParser.parse(AbstractSAXParser.java:1213)
	at com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl$JAXPSAXParser.parse(SAXParserImpl.java:643)
	at org.xml.sax.helpers.XMLFilterImpl.parse(XMLFilterImpl.java:357)
	at com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallerImpl.unmarshal0(UnmarshallerImpl.java:243)
	... 5 more
```
##LocalTransactionException
If the TransactionManager is not bound into JNDI, a LocalTransactionException like this will be thrown attempting to commit the transaction:

```
[ERROR   ] J2CA0024E: Method commit, within transaction branch ID {XidImpl: formatId(57415344), gtrid_length(36), bqual_length(40),
data(0000017403ca46c7000000010f2918d0e75a74f4d7c12d2d6d668ea90399a2e639a786050000017403ca46c7000000010f2918d0e75a74f4d7c12d2d6d668ea90399a2e639a7860500000001)} of resource pool gfe/jca/connectionManager, caught javax.resource.spi.LocalTransactionException: java.lang.IllegalStateException: Thread does not have an active transaction
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:116)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at [internal classes]
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:394)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.aspectj.AspectJAfterAdvice.invoke(AspectJAfterAdvice.java:47)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:175)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:95)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:691)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$2efb933.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:93)
	at example.jta.client.Client.loadEntries(Client.java:74)
	at example.jta.client.Client.loadGetEntries(Client.java:68)
	at example.jta.client.Client.lambda$runner$0(Client.java:63)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:786)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:776)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:322)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.run(SpringBootServletInitializer.java:191)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.createRootApplicationContext(SpringBootServletInitializer.java:171)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.onStartup(SpringBootServletInitializer.java:95)
	at org.springframework.web.SpringServletContainerInitializer.onStartup(SpringServletContainerInitializer.java:172)
	at com.ibm.ws.webcontainer.webapp.WebApp.initializeServletContainerInitializers(WebApp.java:2530)
	at [internal classes]
 and threw a XAException.
```
```
[error 2020/08/18 22:57:03.997 UTC <Default Executor-thread-4> tid=0x20] Application run failed
java.lang.IllegalStateException: Failed to execute ApplicationRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:789)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:776)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:322)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.run(SpringBootServletInitializer.java:191)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.createRootApplicationContext(SpringBootServletInitializer.java:171)
	at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.onStartup(SpringBootServletInitializer.java:95)
	at org.springframework.web.SpringServletContainerInitializer.onStartup(SpringServletContainerInitializer.java:172)
	at com.ibm.ws.webcontainer.webapp.WebApp.initializeServletContainerInitializers(WebApp.java:2530)
	at com.ibm.ws.webcontainer.webapp.WebApp.initialize(WebApp.java:1027)
	at com.ibm.ws.webcontainer.webapp.WebApp.initialize(WebApp.java:6647)
	at com.ibm.ws.webcontainer.osgi.DynamicVirtualHost.startWebApp(DynamicVirtualHost.java:467)
	at com.ibm.ws.webcontainer.osgi.DynamicVirtualHost.startWebApplication(DynamicVirtualHost.java:462)
	at com.ibm.ws.webcontainer.osgi.WebContainer.startWebApplication(WebContainer.java:1150)
	at com.ibm.ws.webcontainer.osgi.WebContainer.access$000(WebContainer.java:108)
	at com.ibm.ws.webcontainer.osgi.WebContainer$2.run(WebContainer.java:955)
	at com.ibm.ws.threading.internal.ExecutorServiceImpl$RunnableWrapper.run(ExecutorServiceImpl.java:239)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: org.springframework.transaction.TransactionSystemException: UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:313)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:394)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.aspectj.AspectJAfterAdvice.invoke(AspectJAfterAdvice.java:47)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:175)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:95)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:749)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:691)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$2efb933.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:93)
	at example.jta.client.Client.loadEntries(Client.java:74)
	at example.jta.client.Client.loadGetEntries(Client.java:68)
	at example.jta.client.Client.lambda$runner$0(Client.java:63)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:786)
	... 20 more
Caused by: com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:757)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	... 37 more
Caused by: javax.transaction.HeuristicMixedException
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:715)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
	... 39 more
Caused by: javax.transaction.xa.XAException
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:157)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
	... 44 more
Caused by: javax.resource.spi.LocalTransactionException: java.lang.IllegalStateException: Thread does not have an active transaction
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:116)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	... 50 more
```
Geode's `JNDIInvoker` class attempts to find the `TransactionManager` and store it in its `transactionManager` field. This is used during transaction begin in `JCALocalTransaction.begin`.

The JNDIInvoker looks up these keys to determine the TransactionManager:

- java:comp/TransactionManager
- java:appserver/TransactionManager
- java:comp/UserTransaction
- javax.transaction.TransactionManager

None of these names contain a TransactionManager in Liberty.

In that case, it attempts to get one using a `TransactionManagerFactory`. It looks for all these classes. None of them exist in Liberty.

- com.ibm.ws.Transaction.TransactionManagerFactory
- com.ibm.ejs.jts.jta.TransactionManagerFactory
- com.ibm.ejs.jts.jta.JTSXA

The Liberty TransactionManager is called `com.ibm.tx.jta.TransactionManagerFactory`.

I see this info message during startup of the cache:

```
[info 2020/08/18 22:14:16.361 UTC <Default Executor-thread-6> tid=0x2a] JNDIInvoker::mapTransactions::NamingException while binding TransactionManager/UserTransaction to GemFire JNDI Tree
```
This means no TransactionManager was found.

When `JCALocalTransaction.begin` is called, it short-circuits because there is no JTA Transaction Manager.

Here is some logging that shows that behavior:

```
[warn 2020/08/18 22:14:23.146 UTC <Default Executor-thread-6> tid=0x2a] JCALocalTransaction.begin identity=595080475
[warn 2020/08/18 22:14:23.148 UTC <Default Executor-thread-6> tid=0x2a] JCALocalTransaction.begin tm=null
[warn 2020/08/18 22:14:23.149 UTC <Default Executor-thread-6> tid=0x2a] JTA Transaction Manager does not exist
```
If I change JNDIInvoker to look for the com.ibm.tx.jta.TransactionManagerFactory class, the simple save transaction completes successfully.

```
[warn 2020/08/20 20:45:26.918 UTC <Default Executor-thread-3> tid=0x1f] JCALocalTransaction.begin identity=1588584017
[warn 2020/08/20 20:45:26.920 UTC <Default Executor-thread-3> tid=0x1f] JCALocalTransaction.begin tm=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@f7cfce1
[warn 2020/08/20 20:45:26.922 UTC <Default Executor-thread-3> tid=0x1f] JCALocalTransaction.begin about to begin gfTxMgr=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5
[warn 2020/08/20 20:45:26.925 UTC <Default Executor-thread-3> tid=0x1f] JCALocalTransaction.begin done begin tid=TXId: ip-172-31-13-92(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:1
```
There is another way to address this without changing Geode. See [Binding Liberty Transaction Manager to JNDI](README_BindingLibertyTransactionManagertoJNDI.md) for details.