#Console Log Output
Here is `console.log` output from several tests.

Note: All of the stacks below are from logging messages. They are not exceptions.

##Client Application
The `console.log` output below is from running the Client application which currently creates and saves a single Trade.

```
Launching defaultServer (WebSphere Application Server 20.0.0.5/wlp-1.0.40.cl200520200429-1655) on OpenJDK 64-Bit Server VM, version 1.8.0_262-b10 (en_US)
[AUDIT   ] CWWKE0001I: The server defaultServer has been launched.
[AUDIT   ] CWWKZ0058I: Monitoring dropins for applications.
[AUDIT   ] CWPKI0820A: The default keystore has been created using the 'keystore_password' environment variable.
[WARNING ] SRVE9967W: The manifest class path jaxb-runtime-2.3.2.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[WARNING ] SRVE9967W: The manifest class path txw2-2.3.2.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[WARNING ] SRVE9967W: The manifest class path istack-commons-runtime-3.0.8.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[WARNING ] SRVE9967W: The manifest class path stax-ex-1.8.1.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[WARNING ] SRVE9967W: The manifest class path FastInfoset-1.2.16.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[WARNING ] SRVE9967W: The manifest class path jakarta.activation-api-1.2.1.jar can not be found in jar file file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/jaxb-impl-2.3.2.jar or its parent.
[AUDIT   ] CWWKT0016I: Web application available (default_host): http://ip-xxx.ca-central-1.compute.internal:9080/helloworld/
[AUDIT   ] CWWKZ0001I: Application helloworld started in 1.384 seconds.
[WARNING ] CWNEN0047W: Resource annotations on the fields of the org.springframework.web.servlet.view.tiles3.TilesConfigurer$CompositeELResolverImpl class will be ignored. The annotations could not be obtained because of the exception : java.lang.NoClassDefFoundError: org/apache/tiles/el/ScopeELResolver
[WARNING ] CWNEN0049W: Resource annotations on the methods of the org.springframework.web.servlet.view.tiles3.TilesConfigurer$CompositeELResolverImpl class will be ignored. The annotations could not be obtained because of the exception : java.lang.NoClassDefFoundError: org/apache/tiles/el/ScopeELResolver
[info 2020/08/20 20:45:05.891 UTC <Default Executor-thread-2> tid=0x1d] Activating CDI extension for Spring Data GemFire Repositories

[info 2020/08/20 20:45:05.900 UTC <Default Executor-thread-2> tid=0x1d] Activating CDI extension for Spring Data JPA repositories.

[AUDIT   ] J2CA7001I: Resource adapter jta-websphere-liberty.gemfireJCA installed in 0.615 seconds.
[AUDIT   ] CWWKT0016I: Web application available (default_host): http://ip-xxx.ca-central-1.compute.internal:9080/jta-websphere-liberty/
[AUDIT   ] CWWKZ0001I: Application jta-websphere-liberty started in 15.732 seconds.
[AUDIT   ] CWWKF0012I: The server installed the following features: [appSecurity-2.0, appSecurity-3.0, beanValidation-2.0, cdi-2.0, distributedMap-1.0, ejbLite-3.2, el-3.0, jaspic-1.1, jaxrs-2.1, jaxrsClient-2.1, jca-1.7, jdbc-4.2, jndi-1.0, jpa-2.2, jpaContainer-2.2, jsf-2.3, jsonb-1.0, jsonp-1.1, jsp-2.3, managedBeans-1.0, servlet-4.0, ssl-1.0, webProfile-8.0, websocket-1.1].
[AUDIT   ] CWWKF0011I: The defaultServer server is ready to run a smarter planet. The defaultServer server started in 22.778 seconds.
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.0.RELEASE)
[info 2020/08/20 20:45:12.532 UTC <Default Executor-thread-3> tid=0x1f] Starting Client on ip-xxx.ca-central-1.compute.internal with PID 485141 (/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes started by root in /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer)

[info 2020/08/20 20:45:12.540 UTC <Default Executor-thread-3> tid=0x1f] No active profile set, falling back to default profiles: default

[info 2020/08/20 20:45:14.041 UTC <Default Executor-thread-3> tid=0x1f] Multiple Spring Data modules found, entering strict repository configuration mode!

[info 2020/08/20 20:45:14.042 UTC <Default Executor-thread-3> tid=0x1f] Bootstrapping Spring Data Gemfire repositories in DEFAULT mode.

[debug 2020/08/20 20:45:14.047 UTC <Default Executor-thread-3> tid=0x1f] Scanning for Gemfire repositories in packages example.jta.client.repository.geode.

[trace 2020/08/20 20:45:14.055 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/geode/TradeGeodeRepository.class]

[debug 2020/08/20 20:45:14.058 UTC <Default Executor-thread-3> tid=0x1f] Identified candidate component class: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/geode/TradeGeodeRepository.class]

[trace 2020/08/20 20:45:14.091 UTC <Default Executor-thread-3> tid=0x1f] Spring Data Gemfire - Registering repository: tradeGeodeRepository - Interface: example.jta.client.repository.geode.TradeGeodeRepository - Factory: org.springframework.data.gemfire.repository.support.GemfireRepositoryFactoryBean

[info 2020/08/20 20:45:14.092 UTC <Default Executor-thread-3> tid=0x1f] Finished Spring Data repository scanning in 44ms. Found 1 Gemfire repository interfaces.

[info 2020/08/20 20:45:14.097 UTC <Default Executor-thread-3> tid=0x1f] Multiple Spring Data modules found, entering strict repository configuration mode!

[info 2020/08/20 20:45:14.097 UTC <Default Executor-thread-3> tid=0x1f] Bootstrapping Spring Data JPA repositories in DEFAULT mode.

[debug 2020/08/20 20:45:14.103 UTC <Default Executor-thread-3> tid=0x1f] Scanning for JPA repositories in packages example.jta.client.repository.jpa.

[trace 2020/08/20 20:45:14.105 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/jpa/TradeJpaRepository.class]

[debug 2020/08/20 20:45:14.106 UTC <Default Executor-thread-3> tid=0x1f] Identified candidate component class: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/jpa/TradeJpaRepository.class]

[trace 2020/08/20 20:45:14.121 UTC <Default Executor-thread-3> tid=0x1f] Spring Data JPA - Registering repository: tradeJpaRepository - Interface: example.jta.client.repository.jpa.TradeJpaRepository - Factory: org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean

[info 2020/08/20 20:45:14.122 UTC <Default Executor-thread-3> tid=0x1f] Finished Spring Data repository scanning in 18ms. Found 1 JPA repository interfaces.

[trace 2020/08/20 20:45:14.498 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/Client.class]

[trace 2020/08/20 20:45:14.499 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/Client.class]

[trace 2020/08/20 20:45:14.499 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/controller/TradeController.class]

[trace 2020/08/20 20:45:14.500 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/controller/TradeController.class]

[trace 2020/08/20 20:45:14.500 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/domain/CusipHelper.class]

[trace 2020/08/20 20:45:14.501 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/domain/CusipHelper.class]

[trace 2020/08/20 20:45:14.501 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/domain/Trade.class]

[trace 2020/08/20 20:45:14.501 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/domain/Trade.class]

[trace 2020/08/20 20:45:14.502 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/geode/TradeGeodeRepository.class]

[trace 2020/08/20 20:45:14.503 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/geode/TradeGeodeRepository.class]

[trace 2020/08/20 20:45:14.503 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/jpa/TradeJpaRepository.class]

[trace 2020/08/20 20:45:14.504 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/repository/jpa/TradeJpaRepository.class]

[trace 2020/08/20 20:45:14.505 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/service/TradeService.class]

[trace 2020/08/20 20:45:14.505 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/service/TradeService.class]

[trace 2020/08/20 20:45:14.505 UTC <Default Executor-thread-3> tid=0x1f] Scanning file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/transaction/TransactionEventHandler.class]

[trace 2020/08/20 20:45:14.506 UTC <Default Executor-thread-3> tid=0x1f] Ignored because not matching any filter: file [/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/jta-websphere-liberty.war/WEB-INF/classes/example/jta/client/transaction/TransactionEventHandler.class]

[info 2020/08/20 20:45:14.856 UTC <Default Executor-thread-3> tid=0x1f] @Bean method PdxConfiguration.pdxDiskStoreAwareBeanFactoryPostProcessor is non-static and returns an object assignable to Spring's BeanFactoryPostProcessor interface. This will result in a failure to process annotations such as @Autowired, @Resource and @PostConstruct within the method's declaring @Configuration class. Add the 'static' modifier to this method to avoid these container lifecycle issues; see @Bean javadoc for complete details.

[info 2020/08/20 20:45:14.864 UTC <Default Executor-thread-3> tid=0x1f] @Bean method RegionTemplateAutoConfiguration.regionTemplateBeanFactoryPostProcessor is non-static and returns an object assignable to Spring's BeanFactoryPostProcessor interface. This will result in a failure to process annotations such as @Autowired, @Resource and @PostConstruct within the method's declaring @Configuration class. Add the 'static' modifier to this method to avoid these container lifecycle issues; see @Bean javadoc for complete details.

[info 2020/08/20 20:45:15.336 UTC <Default Executor-thread-3> tid=0x1f] Bean 'org.springframework.geode.boot.autoconfigure.DataImportExportAutoConfiguration' of type [org.springframework.geode.boot.autoconfigure.DataImportExportAutoConfiguration$$EnhancerBySpringCGLIB$$35dcad95] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)

[info 2020/08/20 20:45:15.421 UTC <Default Executor-thread-3> tid=0x1f] Root WebApplicationContext: initialization completed in 2840 ms

[info 2020/08/20 20:45:15.935 UTC <Default Executor-thread-3> tid=0x1f] Starting embedded database: url='jdbc:h2:mem:bc7137b7-53d4-4e9e-b5b3-23b2ba359a5c;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'

[debug 2020/08/20 20:45:16.300 UTC <Default Executor-thread-3> tid=0x1f] JTA UserTransaction found at default JNDI location [java:comp/UserTransaction]

[debug 2020/08/20 20:45:16.301 UTC <Default Executor-thread-3> tid=0x1f] Retrieving WebSphere UOWManager from default JNDI location [java:comp/websphere/UOWManager]

[info 2020/08/20 20:45:16.618 UTC <Default Executor-thread-3> tid=0x1f] HHH000204: Processing PersistenceUnitInfo [name: default]

[info 2020/08/20 20:45:17.267 UTC <Default Executor-thread-3> tid=0x1f] HHH000412: Hibernate ORM core version 5.4.15.Final

[info 2020/08/20 20:45:17.589 UTC <Default Executor-thread-3> tid=0x1f] HCANN000001: Hibernate Commons Annotations {5.1.0.Final}

[info 2020/08/20 20:45:18.080 UTC <Default Executor-thread-3> tid=0x1f] HHH000400: Using dialect: org.hibernate.dialect.H2Dialect

[info 2020/08/20 20:45:19.530 UTC <Default Executor-thread-3> tid=0x1f] HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.WebSphereLibertyJtaPlatform]

[info 2020/08/20 20:45:19.589 UTC <Default Executor-thread-3> tid=0x1f] Initialized JPA EntityManagerFactory for persistence unit 'default'

[warn 2020/08/20 20:45:19.922 UTC <Default Executor-thread-3> tid=0x1f] Use of PoolFactory.setThreadLocalConnections is deprecated and ignored.

[info 2020/08/20 20:45:20.090 UTC <Default Executor-thread-3> tid=0x1f] Using org.apache.geode.logging.log4j.internal.impl.Log4jLoggingProvider from ServiceLoader for service org.apache.geode.logging.internal.spi.LoggingProvider

[info 2020/08/20 20:45:20.267 UTC <Default Executor-thread-3> tid=0x1f] 
---------------------------------------------------------------------------
  
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with this
  work for additional information regarding copyright ownership.
   
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with the
  License.  You may obtain a copy of the License at
  
  http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
  License for the specific language governing permissions and limitations
  under the License.
  
---------------------------------------------------------------------------
Build-Date: 2020-08-10 13:21:17 -0700
Build-Id: boglesby 0
Build-Java-Vendor: Oracle Corporation
Build-Java-Version: 1.8.0_121
Build-Platform: Mac OS X 10.14.3 x86_64
Product-Name: Apache Geode
Product-Version: 1.12.0
Source-Date: 2020-03-26 14:00:52 -0700
Source-Repository: HEAD
Source-Revision: 57f17bfa7589b41aea6c05ea8bcddba40285c228
Running on: /xxx, 2 cpu(s), amd64 Linux 4.18.0-193.14.3.el8_2.x86_64 
Communications version: 115
Process ID: 485141
User: root
Current dir: /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer
Home dir: /root
Command Line Parameters:
  -javaagent:/opt/IBM/WebSphere/Liberty/bin/tools/ws-javaagent.jar
  -Djava.awt.headless=true
  -Djdk.attach.allowAttachSelf=true
Class Path:
  /opt/IBM/WebSphere/Liberty/bin/tools/ws-server.jar
  /opt/IBM/WebSphere/Liberty/bin/tools/ws-javaagent.jar
Library Path:
  /usr/java/packages/lib/amd64
  /usr/lib64
  /lib64
  /lib
  /usr/lib
System Properties:
    PID = 485141
    awt.toolkit = sun.awt.X11.XToolkit
    com.ibm.ws.beta.edition = false
    com.ibm.ws390.jta.TransactionManager = com.ibm.wsspi.zos.tx.RRSTXSynchronizationManager
    file.encoding = UTF-8
    file.encoding.pkg = sun.io
    file.separator = /
    ibm.cds.suppresserrors = true
    java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
    java.awt.headless = true
    java.awt.printerjob = sun.print.PSPrinterJob
    java.class.version = 52.0
    java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/endorsed
    java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
    java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre
    java.io.tmpdir = /tmp
    java.runtime.name = OpenJDK Runtime Environment
    java.runtime.version = 1.8.0_262-b10
    java.specification.name = Java Platform API Specification
    java.specification.vendor = Oracle Corporation
    java.specification.version = 1.8
    java.util.logging.manager = com.ibm.ws.kernel.boot.logging.WsLogManager
    java.vendor = Oracle Corporation
    java.vendor.url = http://java.oracle.com/
    java.vendor.url.bug = http://bugreport.sun.com/bugreport/
    java.version = 1.8.0_262
    java.vm.info = mixed mode
    java.vm.name = OpenJDK 64-Bit Server VM
    java.vm.specification.name = Java Virtual Machine Specification
    java.vm.specification.vendor = Oracle Corporation
    java.vm.specification.version = 1.8
    java.vm.vendor = Oracle Corporation
    java.vm.version = 25.262-b10
    javax.management.builder.initial = com.ibm.ws.kernel.boot.jmx.internal.PlatformMBeanServerBuilder
    jdk.attach.allowAttachSelf = true
    jna.loaded = true
    jna.platform.library.path = /usr/lib64:/lib64:/usr/lib:/lib:/usr/lib64//bind9-export
    jnidispatch.path = /root/.cache/JNA/temp/jna711045141864601635.tmp
    kernel.launch.time = 690737596312057
    line.separator = 

    org.apache.aries.blueprint.preemptiveShutdown = false
    org.apache.cxf.stax.allowInsecureParser = 1
    org.apache.logging.log4j.assignedSequences = 554
    org.jboss.weld.xml.disableValidating = true
    os.version = 4.18.0-193.14.3.el8_2.x86_64
    path.separator = :
    server.config.dir = /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/
    server.output.dir = /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/
    server.tmp.dir = /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/workarea/tmp/
    shared.app.dir = /opt/IBM/WebSphere/Liberty/usr/shared/apps/
    shared.config.dir = /opt/IBM/WebSphere/Liberty/usr/shared/config/
    shared.resource.dir = /opt/IBM/WebSphere/Liberty/usr/shared/resources/
    spring.beaninfo.ignore = true
    sun.arch.data.model = 64
    sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/classes
    sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-0.el8_2.x86_64/jre/lib/amd64
    sun.cpu.endian = little
    sun.cpu.isalist = 
    sun.io.unicode.encoding = UnicodeLittle
    sun.java.command = /opt/IBM/WebSphere/Liberty/bin/tools/ws-server.jar defaultServer
    sun.java.launcher = SUN_STANDARD
    sun.jnu.encoding = UTF-8
    sun.management.compiler = HotSpot 64-Bit Tiered Compilers
    sun.net.http.retryPost = false
    sun.nio.ch.bugLevel = 
    sun.os.patch.level = unknown
    user.country = US
    user.language = en
    user.timezone = UTC
    wlp.install.dir = /opt/IBM/WebSphere/Liberty/
    wlp.lib.dir = /opt/IBM/WebSphere/Liberty/lib/
    wlp.process.type = server
    wlp.server.name = defaultServer
    wlp.user.dir = /opt/IBM/WebSphere/Liberty/usr/
    wlp.user.dir.isDefault = true
    wlp.workarea.dir = workarea/
Log4J 2 Configuration:
    wsjar:file:/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/apps/expanded/jta-websphere-liberty.ear/lib/geode-log4j-1.12.0.jar!/log4j2.xml
---------------------------------------------------------------------------


[info 2020/08/20 20:45:20.273 UTC <Default Executor-thread-3> tid=0x1f] Startup Configuration: 
### GemFire Properties defined with api ###
locators=
log-level=config
mcast-port=0
name=SpringBasedCacheClientApplication
### GemFire Properties using default values ###
ack-severe-alert-threshold=0
ack-wait-threshold=15
archive-disk-space-limit=0
archive-file-size-limit=0
async-distribution-timeout=0
async-max-queue-size=8
async-queue-timeout=60000
bind-address=
cache-xml-file=cache.xml
cluster-configuration-dir=
cluster-ssl-ciphers=any
cluster-ssl-enabled=false
cluster-ssl-keystore=
cluster-ssl-keystore-password=
cluster-ssl-keystore-type=
cluster-ssl-protocols=any
cluster-ssl-require-authentication=true
cluster-ssl-truststore=
cluster-ssl-truststore-password=
conflate-events=server
conserve-sockets=true
delta-propagation=true
deploy-working-dir=/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer
disable-auto-reconnect=false
disable-jmx=false
disable-tcp=false
distributed-system-id=-1
distributed-transactions=false
durable-client-id=
durable-client-timeout=300
enable-cluster-configuration=true
enable-management-rest-service=true
enable-network-partition-detection=true
enable-time-statistics=false
enforce-unique-host=false
gateway-ssl-ciphers=any
gateway-ssl-enabled=false
gateway-ssl-keystore=
gateway-ssl-keystore-password=
gateway-ssl-keystore-type=
gateway-ssl-protocols=any
gateway-ssl-require-authentication=true
gateway-ssl-truststore=
gateway-ssl-truststore-password=
groups=
http-service-bind-address=
http-service-port=7070
http-service-ssl-ciphers=any
http-service-ssl-enabled=false
http-service-ssl-keystore=
http-service-ssl-keystore-password=
http-service-ssl-keystore-type=
http-service-ssl-protocols=any
http-service-ssl-require-authentication=false
http-service-ssl-truststore=
http-service-ssl-truststore-password=
jmx-manager=false
jmx-manager-access-file=
jmx-manager-bind-address=
jmx-manager-hostname-for-clients=
jmx-manager-http-port=7070
jmx-manager-password-file=
jmx-manager-port=1099
jmx-manager-ssl-ciphers=any
jmx-manager-ssl-enabled=false
jmx-manager-ssl-keystore=
jmx-manager-ssl-keystore-password=
jmx-manager-ssl-keystore-type=
jmx-manager-ssl-protocols=any
jmx-manager-ssl-require-authentication=true
jmx-manager-ssl-truststore=
jmx-manager-ssl-truststore-password=
jmx-manager-start=false
jmx-manager-update-rate=2000
load-cluster-configuration-from-dir=false
locator-wait-time=0
lock-memory=false
log-disk-space-limit=0
log-file=
log-file-size-limit=0
max-num-reconnect-tries=3
max-wait-time-reconnect=60000
mcast-address=239.192.81.1
mcast-flow-control=1048576, 0.25, 5000
mcast-recv-buffer-size=1048576
mcast-send-buffer-size=65535
mcast-ttl=32
member-timeout=5000
membership-port-range=41000-61000
memcached-bind-address=
memcached-port=0
memcached-protocol=ASCII
off-heap-memory-size=
redis-bind-address=
redis-password=
redis-port=0
redundancy-zone=
remote-locators=
remove-unresponsive-client=false
roles=
security-auth-token-enabled-components=
security-client-accessor=
security-client-accessor-pp=
security-client-auth-init=
security-client-authenticator=
security-client-dhalgo=
security-log-file=
security-log-level=config
security-manager=
security-peer-auth-init=
security-peer-authenticator=
security-peer-verifymember-timeout=1000
security-post-processor=
security-udp-dhalgo=
serializable-object-filter=!*
server-bind-address=
server-ssl-ciphers=any
server-ssl-enabled=false
server-ssl-keystore=
server-ssl-keystore-password=
server-ssl-keystore-type=
server-ssl-protocols=any
server-ssl-require-authentication=true
server-ssl-truststore=
server-ssl-truststore-password=
socket-buffer-size=32768
socket-lease-time=60000
ssl-ciphers=any
ssl-cluster-alias=
ssl-default-alias=
ssl-enabled-components=
ssl-endpoint-identification-enabled=false
ssl-gateway-alias=
ssl-jmx-alias=
ssl-keystore=
ssl-keystore-password=
ssl-keystore-type=
ssl-locator-alias=
ssl-parameter-extension=
ssl-protocols=any
ssl-require-authentication=true
ssl-server-alias=
ssl-truststore=
ssl-truststore-password=
ssl-truststore-type=
ssl-use-default-context=false
ssl-web-alias=
ssl-web-require-authentication=false
start-dev-rest-api=false
start-locator=
statistic-archive-file=
statistic-sample-rate=1000
statistic-sampling-enabled=true
tcp-port=0
thread-monitor-enabled=true
thread-monitor-interval-ms=60000
thread-monitor-time-limit-ms=30000
udp-fragment-size=60000
udp-recv-buffer-size=1048576
udp-send-buffer-size=65535
use-cluster-configuration=true
user-command-packages=
validate-serializable-objects=false


[info 2020/08/20 20:45:20.281 UTC <Default Executor-thread-3> tid=0x1f] initializing InternalDataSerializer with 7 services

[info 2020/08/20 20:45:20.298 UTC <Default Executor-thread-3> tid=0x1f] [ThreadsMonitor] New Monitor object and process were created.


[info 2020/08/20 20:45:20.312 UTC <StatSampler> tid=0x11e] Disabling statistic archival.

[warn 2020/08/20 20:45:20.375 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.mapTransactions invoked

[warn 2020/08/20 20:45:20.377 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:/TransactionManager

[warn 2020/08/20 20:45:20.378 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup caught exception=javax.naming.NameNotFoundException: java:/TransactionManager

[warn 2020/08/20 20:45:20.379 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:comp/TransactionManager

[warn 2020/08/20 20:45:20.379 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup caught exception=javax.naming.NameNotFoundException: javax.naming.NameNotFoundException: java:comp/TransactionManager

[warn 2020/08/20 20:45:20.380 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:appserver/TransactionManager

[warn 2020/08/20 20:45:20.380 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup caught exception=javax.naming.NameNotFoundException: java:appserver/TransactionManager

[warn 2020/08/20 20:45:20.380 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:pm/TransactionManager

[warn 2020/08/20 20:45:20.381 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup caught exception=javax.naming.NameNotFoundException: java:pm/TransactionManager

[warn 2020/08/20 20:45:20.381 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:comp/UserTransaction

[warn 2020/08/20 20:45:20.382 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=java:comp/UserTransaction; jndiObject=com.ibm.ws.transaction.services.UserTransactionService@6c13fc8f

[warn 2020/08/20 20:45:20.382 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiObject is not a TransactionManager. It is a com.ibm.ws.transaction.services.UserTransactionService

[warn 2020/08/20 20:45:20.383 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=javax.transaction.TransactionManager

[warn 2020/08/20 20:45:20.419 UTC <Default Executor-thread-3> tid=0x1f] XXX JNDIInvoker.doTransactionLookup jndiKey=javax.transaction.TransactionManager; jndiObject=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@f7cfce1

[info 2020/08/20 20:45:20.419 UTC <Default Executor-thread-3> tid=0x1f] Running in client mode

[info 2020/08/20 20:45:20.474 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.cache.query.internal.QueryConfigurationServiceImpl

[info 2020/08/20 20:45:20.485 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.cache.lucene.internal.LuceneServiceImpl

[info 2020/08/20 20:45:21.512 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.management.internal.cli.remote.OnlineCommandProcessor

[info 2020/08/20 20:45:21.516 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service com.gemstone.gemfire.OldClientSupportProvider

[info 2020/08/20 20:45:21.517 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.connectors.jdbc.internal.JdbcConnectorServiceImpl

[info 2020/08/20 20:45:21.518 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.redis.internal.GeodeRedisService

[info 2020/08/20 20:45:21.534 UTC <Default Executor-thread-3> tid=0x1f] Initialized cache service org.apache.geode.internal.memcached.GeodeMemcachedService

[info 2020/08/20 20:45:21.547 UTC <Default Executor-thread-3> tid=0x1f] Connected to Distributed System [SpringBasedCacheClientApplication] as Member [ip-xxx(SpringBasedCacheClientApplication:485141:loner):0:1d6c9e0d:SpringBasedCacheClientApplication] in Group(s) [[]] with Role(s) [[]] on Host [ip-xxx.ca-central-1.compute.internal] having PID [485141]

[info 2020/08/20 20:45:21.549 UTC <Default Executor-thread-3> tid=0x1f] Created new Apache Geode version [1.12.0] Cache [SpringBasedCacheClientApplication]

[warn 2020/08/20 20:45:21.710 UTC <Default Executor-thread-3> tid=0x1f] Invalid JavaBean property 'regionConfigurers' being accessed! Ambiguous write methods found next to actually used [public void org.springframework.data.gemfire.config.annotation.support.CacheTypeAwareRegionFactoryBean.setRegionConfigurers(org.springframework.data.gemfire.config.annotation.RegionConfigurer[])]: [public void org.springframework.data.gemfire.config.annotation.support.CacheTypeAwareRegionFactoryBean.setRegionConfigurers(java.util.List)]

[info 2020/08/20 20:45:21.713 UTC <Default Executor-thread-3> tid=0x1f] Falling back to creating Region [Trades] in Cache [SpringBasedCacheClientApplication]

[info 2020/08/20 20:45:21.715 UTC <Default Executor-thread-3> tid=0x1f] Falling back to creating Region [Trades] in Cache [SpringBasedCacheClientApplication]

[info 2020/08/20 20:45:21.729 UTC <Default Executor-thread-3> tid=0x1f] Creating client Region [Trades]

[info 2020/08/20 20:45:21.754 UTC <Default Executor-thread-3> tid=0x1f] AutoConnectionSource UpdateLocatorListTask started with interval=10000 ms.

[info 2020/08/20 20:45:21.755 UTC <Default Executor-thread-3> tid=0x1f] Pool DEFAULT started with multiuser-authentication=false

[info 2020/08/20 20:45:21.799 UTC <poolTimer-DEFAULT-3> tid=0x127] Updating membership port.  Port changed from 0 to 51412.  ID is now ip-xxx(SpringBasedCacheClientApplication:485141:loner):0:1d6c9e0d:SpringBasedCacheClientApplication

[info 2020/08/20 20:45:21.803 UTC <poolTimer-DEFAULT-2> tid=0x126] AutoConnectionSource discovered new locators [ip-xxx.ca-central-1.compute.internal/172.31.13.92:10334]

[debug 2020/08/20 20:45:21.982 UTC <Default Executor-thread-3> tid=0x1f] Initializing repository instance for example.jta.client.repository.geode.TradeGeodeRepository…

[debug 2020/08/20 20:45:22.036 UTC <Default Executor-thread-3> tid=0x1f] Finished creation of repository instance for example.jta.client.repository.geode.TradeGeodeRepository.

[debug 2020/08/20 20:45:22.102 UTC <Default Executor-thread-3> tid=0x1f] Initializing JpaMetamodelMappingContext…

[debug 2020/08/20 20:45:22.108 UTC <Default Executor-thread-3> tid=0x1f] Finished initializing JpaMetamodelMappingContext!

[debug 2020/08/20 20:45:22.266 UTC <Default Executor-thread-3> tid=0x1f] Initializing repository instance for example.jta.client.repository.jpa.TradeJpaRepository…

[debug 2020/08/20 20:45:22.317 UTC <Default Executor-thread-3> tid=0x1f] Finished creation of repository instance for example.jta.client.repository.jpa.TradeJpaRepository.

[trace 2020/08/20 20:45:22.332 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'example.jta.client.service.TradeService.createTrade' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[trace 2020/08/20 20:45:22.373 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'example.jta.client.service.TradeService.runJpaTest1' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[trace 2020/08/20 20:45:22.373 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'example.jta.client.service.TradeService.runJpaTest2' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[trace 2020/08/20 20:45:22.374 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'example.jta.client.service.TradeService.runGeodeTest2' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[trace 2020/08/20 20:45:22.375 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'example.jta.client.service.TradeService.runGeodeTest1' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[warn 2020/08/20 20:45:22.637 UTC <Default Executor-thread-3> tid=0x1f] spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning

[info 2020/08/20 20:45:22.864 UTC <Default Executor-thread-3> tid=0x1f] Initializing ExecutorService 'applicationTaskExecutor'

[info 2020/08/20 20:45:23.368 UTC <Default Executor-thread-3> tid=0x1f] Started Client in 11.93 seconds (JVM running for 35.369)

[info 2020/08/20 20:45:23.373 UTC <Default Executor-thread-3> tid=0x1f] Creating 1 trades

[info 2020/08/20 20:45:23.373 UTC <Default Executor-thread-3> tid=0x1f] About to create trade=0

[debug 2020/08/20 20:45:23.897 UTC <Default Executor-thread-3> tid=0x1f] Creating new transaction with name [null]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[debug 2020/08/20 20:45:23.897 UTC <Default Executor-thread-3> tid=0x1f] Invoking WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:45:24.691 UTC <Default Executor-thread-3> tid=0x1f] Initializing transaction synchronization

[trace 2020/08/20 20:45:24.692 UTC <Default Executor-thread-3> tid=0x1f] Getting transaction for [example.jta.client.service.TradeService.createTrade]

[trace 2020/08/20 20:45:24.700 UTC <Default Executor-thread-3> tid=0x1f] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[warn 2020/08/20 20:45:24.713 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnectionFactory.<init> 
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.<init>(JCAManagedConnectionFactory.java:40)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at java.lang.Class.newInstance(Class.java:442)
	at com.ibm.ws.jca.service.ConnectionFactoryService.init(ConnectionFactoryService.java:412)
	at com.ibm.ws.jndi.internal.WSContext$4.run(WSContext.java:522)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.ibm.ws.jndi.internal.WSContext.getReference(WSContext.java:518)
	at com.ibm.ws.jndi.internal.WSContext.resolveObject(WSContext.java:137)
	at com.ibm.ws.jndi.internal.WSContext.lookup(WSContext.java:307)
	at com.ibm.ws.jndi.WSContextBase.lookup(WSContextBase.java:61)
	at org.apache.aries.jndi.DelegateContext.lookup(DelegateContext.java:161)
	at javax.naming.InitialContext.lookup(InitialContext.java:417)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.resolveGemFireConnectionFactory(GemFireAsLastResourceConnectionAcquiringAspect.java:75)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:394)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[warn 2020/08/20 20:45:26.024 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnectionFactory.createConnectionFactory cm=[ConnectionManager]@6bd75b49
JNDI Name <gfe/jca>
shareable <true>

java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createConnectionFactory(JCAManagedConnectionFactory.java:51)
	at com.ibm.ws.jca.cm.AbstractConnectionFactoryService.createResource(AbstractConnectionFactoryService.java:163)
	at com.ibm.ws.resource.internal.ResourceFactoryTrackerData$1.getService(ResourceFactoryTrackerData.java:120)
	at com.ibm.ws.jndi.internal.WSContext.getReference(WSContext.java:518)
	at com.ibm.ws.jndi.internal.WSContext.resolveObject(WSContext.java:137)
	at com.ibm.ws.jndi.internal.WSContext.lookup(WSContext.java:307)
	at com.ibm.ws.jndi.WSContextBase.lookup(WSContextBase.java:61)
	at org.apache.aries.jndi.DelegateContext.lookup(DelegateContext.java:161)
	at javax.naming.InitialContext.lookup(InitialContext.java:417)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.resolveGemFireConnectionFactory(GemFireAsLastResourceConnectionAcquiringAspect.java:75)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[error 2020/08/20 20:45:26.031 UTC <Default Executor-thread-3> tid=0x1f] XXX GemFireConnectionHolder.acquire about to getConnection throwOnError=false

[warn 2020/08/20 20:45:26.033 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnectionFactory.createManagedConnection 
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:58)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:394)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[warn 2020/08/20 20:45:26.035 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnection.init localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@5eafde51
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.<init>(JCAManagedConnection.java:66)
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:59)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[warn 2020/08/20 20:45:26.445 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnection.getLocalTransaction localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@5eafde51

[warn 2020/08/20 20:45:26.918 UTC <Default Executor-thread-3> tid=0x1f] XXX JCALocalTransaction.begin identity=1588584017
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:54)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[warn 2020/08/20 20:45:26.920 UTC <Default Executor-thread-3> tid=0x1f] XXX JCALocalTransaction.begin tm=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@f7cfce1

[warn 2020/08/20 20:45:26.922 UTC <Default Executor-thread-3> tid=0x1f] XXX JCALocalTransaction.begin about to begin gfTxMgr=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5

[warn 2020/08/20 20:45:26.924 UTC <Default Executor-thread-3> tid=0x1f] XXX TXStateProxyImpl.TXStateProxyImpl
java.lang.Exception
	at org.apache.geode.internal.cache.TXStateProxyImpl.<init>(TXStateProxyImpl.java:95)
	at org.apache.geode.internal.cache.TXManagerImpl.begin(TXManagerImpl.java:361)
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:77)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[warn 2020/08/20 20:45:26.925 UTC <Default Executor-thread-3> tid=0x1f] XXX JCALocalTransaction.begin done begin tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:1

[warn 2020/08/20 20:45:26.926 UTC <Default Executor-thread-3> tid=0x1f] XXX JCAManagedConnection.<init> transactionManager=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5
java.lang.Exception: JCAManagedConnection.init
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.init(JCAManagedConnection.java:142)
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.getConnection(JCAManagedConnection.java:123)
	at com.ibm.ejs.j2c.MCWrapper.getConnection(MCWrapper.java:1928)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:326)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[error 2020/08/20 20:45:26.934 UTC <Default Executor-thread-3> tid=0x1f] XXX GemFireConnectionHolder.acquire done getConnection conn=org.apache.geode.internal.ra.GFConnectionImpl@3bed5f7d

[trace 2020/08/20 20:45:26.950 UTC <Default Executor-thread-3> tid=0x1f] Bound value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@634d794f] for key [public abstract java.lang.Object org.springframework.data.repository.CrudRepository.save(java.lang.Object)] to thread [Default Executor-thread-3]

[debug 2020/08/20 20:45:26.954 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'save' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[debug 2020/08/20 20:45:26.957 UTC <Default Executor-thread-3> tid=0x1f] Creating new transaction with name [null]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[debug 2020/08/20 20:45:26.958 UTC <Default Executor-thread-3> tid=0x1f] Invoking WebSphere UOW action: type=1, join=true

[trace 2020/08/20 20:45:26.963 UTC <Default Executor-thread-3> tid=0x1f] Getting transaction for [org.springframework.data.jpa.repository.support.SimpleJpaRepository.save]

[trace 2020/08/20 20:45:26.978 UTC <Default Executor-thread-3> tid=0x1f] Bound value [org.springframework.orm.jpa.EntityManagerHolder@6adc040a] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] to thread [Default Executor-thread-3]

[debug 2020/08/20 20:45:27.033 UTC <Default Executor-thread-3> tid=0x1f] Returned from WebSphere UOW action: type=1, join=true

[trace 2020/08/20 20:45:27.034 UTC <Default Executor-thread-3> tid=0x1f] Removed value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@634d794f] for key [public abstract java.lang.Object org.springframework.data.repository.CrudRepository.save(java.lang.Object)] from thread [Default Executor-thread-3]

[info 2020/08/20 20:45:27.068 UTC <Default Executor-thread-3> tid=0x1f] Caching PdxType[dsid=0, typenum=10399583
        name=example.jta.client.domain.Trade
        fields=[
        id:String:identity:0:idx0(relativeOffset)=0:idx1(vlfOffsetIndex)=-1
        cusip:String:1:1:idx0(relativeOffset)=0:idx1(vlfOffsetIndex)=1
        shares:Object:2:2:idx0(relativeOffset)=0:idx1(vlfOffsetIndex)=2
        price:Object:3:3:idx0(relativeOffset)=0:idx1(vlfOffsetIndex)=3]]

[info 2020/08/20 20:45:27.073 UTC <Default Executor-thread-3> tid=0x1f] Saved trade=Trade[id=0; cusip=LLY; shares=77; price=69.56]

[trace 2020/08/20 20:45:27.074 UTC <Default Executor-thread-3> tid=0x1f] Triggering beforeCommit synchronization

[info 2020/08/20 20:45:27.074 UTC <Default Executor-thread-3> tid=0x1f] Event TransactionPhase.BEFORE_COMMIT: Trade[id=0; cusip=LLY; shares=77; price=69.56]

[trace 2020/08/20 20:45:27.075 UTC <Default Executor-thread-3> tid=0x1f] No result object given - no result to handle

[trace 2020/08/20 20:45:27.075 UTC <Default Executor-thread-3> tid=0x1f] Triggering beforeCompletion synchronization

[trace 2020/08/20 20:45:27.075 UTC <Default Executor-thread-3> tid=0x1f] Removed value [org.springframework.orm.jpa.EntityManagerHolder@6adc040a] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] from thread [Default Executor-thread-3]

[warn 2020/08/20 20:45:27.123 UTC <Default Executor-thread-3> tid=0x1f] XXX JCALocalTransaction.commit tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:1; identity=1588584017
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:101)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.createTrade(<generated>)
	at example.jta.client.Client.iterateAndCreateTrades(Client.java:70)
	at example.jta.client.Client.loadEntries(Client.java:59)
	at example.jta.client.Client.loadGetEntries(Client.java:53)
	at example.jta.client.Client.lambda$runner$0(Client.java:48)

[info 2020/08/20 20:45:27.209 UTC <Default Executor-thread-3> tid=0x1f] Event TransactionPhase.AFTER_COMPLETION: Trade[id=0; cusip=LLY; shares=77; price=69.56]

[trace 2020/08/20 20:45:27.210 UTC <Default Executor-thread-3> tid=0x1f] No result object given - no result to handle

[info 2020/08/20 20:45:27.211 UTC <Default Executor-thread-3> tid=0x1f] Event TransactionPhase.AFTER_COMMIT: Trade[id=0; cusip=LLY; shares=77; price=69.56]

[trace 2020/08/20 20:45:27.211 UTC <Default Executor-thread-3> tid=0x1f] No result object given - no result to handle

[debug 2020/08/20 20:45:27.224 UTC <Default Executor-thread-3> tid=0x1f] Returned from WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:45:27.225 UTC <Default Executor-thread-3> tid=0x1f] Closing GemFire Connection...

[info 2020/08/20 20:45:27.230 UTC <Default Executor-thread-3> tid=0x1f] Created trade=0

[info 2020/08/20 20:45:27.281 UTC <Default Executor-thread-3> tid=0x1f] Created 1 trades in 3907 ms

[info 2020/08/20 20:45:27.282 UTC <Default Executor-thread-3> tid=0x1f] Getting 1 trades from JPA repository

[trace 2020/08/20 20:45:27.282 UTC <Default Executor-thread-3> tid=0x1f] Bound value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@48f3877e] for key [public abstract java.util.Optional org.springframework.data.repository.CrudRepository.findById(java.lang.Object)] to thread [Default Executor-thread-3]

[debug 2020/08/20 20:45:27.284 UTC <Default Executor-thread-3> tid=0x1f] Adding transactional method 'findById' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT,readOnly

[debug 2020/08/20 20:45:27.285 UTC <Default Executor-thread-3> tid=0x1f] Creating new transaction with name [null]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT,readOnly

[debug 2020/08/20 20:45:27.286 UTC <Default Executor-thread-3> tid=0x1f] Invoking WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:45:27.289 UTC <Default Executor-thread-3> tid=0x1f] Initializing transaction synchronization

[trace 2020/08/20 20:45:27.289 UTC <Default Executor-thread-3> tid=0x1f] Getting transaction for [org.springframework.data.jpa.repository.support.SimpleJpaRepository.findById]

[trace 2020/08/20 20:45:27.291 UTC <Default Executor-thread-3> tid=0x1f] Retrieved value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@48f3877e] for key [public abstract java.util.Optional org.springframework.data.repository.CrudRepository.findById(java.lang.Object)] bound to thread [Default Executor-thread-3]

[trace 2020/08/20 20:45:27.292 UTC <Default Executor-thread-3> tid=0x1f] Retrieved value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@48f3877e] for key [public abstract java.util.Optional org.springframework.data.repository.CrudRepository.findById(java.lang.Object)] bound to thread [Default Executor-thread-3]

[trace 2020/08/20 20:45:27.293 UTC <Default Executor-thread-3> tid=0x1f] Retrieved value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@48f3877e] for key [public abstract java.util.Optional org.springframework.data.repository.CrudRepository.findById(java.lang.Object)] bound to thread [Default Executor-thread-3]

[trace 2020/08/20 20:45:27.295 UTC <Default Executor-thread-3> tid=0x1f] Bound value [org.springframework.orm.jpa.EntityManagerHolder@5fa45f9b] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] to thread [Default Executor-thread-3]

[trace 2020/08/20 20:45:27.314 UTC <Default Executor-thread-3> tid=0x1f] Triggering beforeCommit synchronization

[trace 2020/08/20 20:45:27.315 UTC <Default Executor-thread-3> tid=0x1f] Triggering beforeCompletion synchronization

[trace 2020/08/20 20:45:27.315 UTC <Default Executor-thread-3> tid=0x1f] Removed value [org.springframework.orm.jpa.EntityManagerHolder@5fa45f9b] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] from thread [Default Executor-thread-3]

[debug 2020/08/20 20:45:27.318 UTC <Default Executor-thread-3> tid=0x1f] Returned from WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:45:27.318 UTC <Default Executor-thread-3> tid=0x1f] Removed value [org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$DefaultCrudMethodMetadata@48f3877e] for key [public abstract java.util.Optional org.springframework.data.repository.CrudRepository.findById(java.lang.Object)] from thread [Default Executor-thread-3]

[info 2020/08/20 20:45:27.318 UTC <Default Executor-thread-3> tid=0x1f] Retrieved JPA trade=Optional[Trade[id=0; cusip=LLY; shares=77; price=69.56]]

[info 2020/08/20 20:45:27.318 UTC <Default Executor-thread-3> tid=0x1f] Retrieved 1 trades from JPA repository in 36 ms

[info 2020/08/20 20:45:27.319 UTC <Default Executor-thread-3> tid=0x1f] Getting 1 trades from Geode repository

[info 2020/08/20 20:45:27.360 UTC <Default Executor-thread-3> tid=0x1f] Retrieved Geode trade=Optional[Trade[id=0; cusip=LLY; shares=77; price=69.56]]

[info 2020/08/20 20:45:27.360 UTC <Default Executor-thread-3> tid=0x1f] Retrieved 1 trades from Geode repository in 41 ms
```
##Run Test1 and Test2
###Curl Commands
####Test1
Run Test1 using this curl command:

```
curl http://ec2-xxx.ca-central-1.compute.amazonaws.com:9080/jta-websphere-liberty/geodetest1/0
```
Output like this will be logged after 15 seconds:

```
{"timestamp":"2020-08-20T20:54:18.998+0000","status":500,"error":"Internal Server Error","message":"","path":"/jta-websphere-liberty/geodetest1/0"}
```
####Test2
Run Test1 using this curl command:

```
curl http://ec2-xxx.ca-central-1.compute.amazonaws.com:9080/jta-websphere-liberty/geodetest2/0
```
Output like this will be logged:

```
Geode Test2
Updating trade=Trade[id=0; cusip=LLY; shares=77; price=69.56]
Updated trade=Trade[id=0; cusip=LLY; shares=77; price=517.42]
```
###Output
####Test1 Starts and Sleeps

```
[info 2020/08/20 20:54:03.485 UTC <Default Executor-thread-201> tid=0x252] Initializing Servlet 'dispatcherServlet'

[info 2020/08/20 20:54:03.513 UTC <Default Executor-thread-201> tid=0x252] Completed initialization in 27 ms

[trace 2020/08/20 20:54:03.526 UTC <Default Executor-thread-201> tid=0x252] Bound value [org.springframework.orm.jpa.EntityManagerHolder@508944ba] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] to thread [Default Executor-thread-201]

[debug 2020/08/20 20:54:03.554 UTC <Default Executor-thread-201> tid=0x252] Creating new transaction with name [null]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[debug 2020/08/20 20:54:03.554 UTC <Default Executor-thread-201> tid=0x252] Invoking WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:54:03.644 UTC <Default Executor-thread-201> tid=0x252] Initializing transaction synchronization

[trace 2020/08/20 20:54:03.645 UTC <Default Executor-thread-201> tid=0x252] Getting transaction for [example.jta.client.service.TradeService.runGeodeTest1]

[trace 2020/08/20 20:54:03.647 UTC <Default Executor-thread-201> tid=0x252] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[error 2020/08/20 20:54:03.647 UTC <Default Executor-thread-201> tid=0x252] XXX GemFireConnectionHolder.acquire about to getConnection throwOnError=false

[warn 2020/08/20 20:54:03.648 UTC <Default Executor-thread-201> tid=0x252] XXX JCAManagedConnectionFactory.createManagedConnection 
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:58)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.lambda$invokeWithinTransaction$1(TransactionAspectSupport.java:397)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[warn 2020/08/20 20:54:03.649 UTC <Default Executor-thread-201> tid=0x252] XXX JCAManagedConnection.init localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@33e80851
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.<init>(JCAManagedConnection.java:66)
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:59)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[warn 2020/08/20 20:54:03.651 UTC <Default Executor-thread-201> tid=0x252] XXX JCAManagedConnection.getLocalTransaction localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@33e80851

[warn 2020/08/20 20:54:03.652 UTC <Default Executor-thread-201> tid=0x252] XXX JCALocalTransaction.begin identity=870844497
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:54)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[warn 2020/08/20 20:54:03.654 UTC <Default Executor-thread-201> tid=0x252] XXX JCALocalTransaction.begin tm=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@f7cfce1

[warn 2020/08/20 20:54:03.656 UTC <Default Executor-thread-201> tid=0x252] XXX JCALocalTransaction.begin about to begin gfTxMgr=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5

[warn 2020/08/20 20:54:03.656 UTC <Default Executor-thread-201> tid=0x252] XXX TXStateProxyImpl.TXStateProxyImpl
java.lang.Exception
	at org.apache.geode.internal.cache.TXStateProxyImpl.<init>(TXStateProxyImpl.java:95)
	at org.apache.geode.internal.cache.TXManagerImpl.begin(TXManagerImpl.java:361)
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:77)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[warn 2020/08/20 20:54:03.657 UTC <Default Executor-thread-201> tid=0x252] XXX JCALocalTransaction.begin done begin tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:2

[warn 2020/08/20 20:54:03.658 UTC <Default Executor-thread-201> tid=0x252] XXX JCAManagedConnection.<init> transactionManager=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5
java.lang.Exception: JCAManagedConnection.init
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.init(JCAManagedConnection.java:142)
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.getConnection(JCAManagedConnection.java:123)
	at com.ibm.ejs.j2c.MCWrapper.getConnection(MCWrapper.java:1928)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:326)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[error 2020/08/20 20:54:03.659 UTC <Default Executor-thread-201> tid=0x252] XXX GemFireConnectionHolder.acquire done getConnection conn=org.apache.geode.internal.ra.GFConnectionImpl@a8adb7d

[info 2020/08/20 20:54:03.659 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 finding tradeId=0

[info 2020/08/20 20:54:03.667 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 found trade=Trade[id=0; cusip=LLY; shares=77; price=69.56]

[info 2020/08/20 20:54:03.667 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 updated trade=Trade[id=0; cusip=LLY; shares=77; price=360.55]

[info 2020/08/20 20:54:03.668 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 about to sleep for 15000 milliseconds before committing
```
####Test2 Runs and Completes Successfully

```
[trace 2020/08/20 20:54:09.747 UTC <Default Executor-thread-204> tid=0x255] Bound value [org.springframework.orm.jpa.EntityManagerHolder@11c1fcdf] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] to thread [Default Executor-thread-204]

[debug 2020/08/20 20:54:09.750 UTC <Default Executor-thread-204> tid=0x255] Creating new transaction with name [null]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[debug 2020/08/20 20:54:09.750 UTC <Default Executor-thread-204> tid=0x255] Invoking WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:54:09.754 UTC <Default Executor-thread-204> tid=0x255] Initializing transaction synchronization

[trace 2020/08/20 20:54:09.754 UTC <Default Executor-thread-204> tid=0x255] Getting transaction for [example.jta.client.service.TradeService.runGeodeTest2]

[trace 2020/08/20 20:54:09.754 UTC <Default Executor-thread-204> tid=0x255] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[error 2020/08/20 20:54:09.755 UTC <Default Executor-thread-204> tid=0x255] XXX GemFireConnectionHolder.acquire about to getConnection throwOnError=false

[warn 2020/08/20 20:54:09.755 UTC <Default Executor-thread-204> tid=0x255] XXX JCAManagedConnectionFactory.createManagedConnection 
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:58)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[warn 2020/08/20 20:54:09.757 UTC <Default Executor-thread-204> tid=0x255] XXX JCAManagedConnection.init localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@5348567f
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.<init>(JCAManagedConnection.java:66)
	at org.apache.geode.internal.ra.spi.JCAManagedConnectionFactory.createManagedConnection(JCAManagedConnectionFactory.java:59)
	at com.ibm.ejs.j2c.FreePool.createManagedConnectionWithMCWrapper(FreePool.java:1372)
	at com.ibm.ejs.j2c.FreePool.createOrWaitForConnection(FreePool.java:1246)
	at com.ibm.ejs.j2c.PoolManager.reserve(PoolManager.java:1465)
	at com.ibm.ejs.j2c.ConnectionManager.allocateMCWrapper(ConnectionManager.java:581)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:314)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[warn 2020/08/20 20:54:09.758 UTC <Default Executor-thread-204> tid=0x255] XXX JCAManagedConnection.getLocalTransaction localTransaction=org.apache.geode.internal.ra.spi.JCALocalTransaction@5348567f

[warn 2020/08/20 20:54:09.759 UTC <Default Executor-thread-204> tid=0x255] XXX JCALocalTransaction.begin identity=1397249663
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:54)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[warn 2020/08/20 20:54:09.760 UTC <Default Executor-thread-204> tid=0x255] XXX JCALocalTransaction.begin tm=com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet@f7cfce1

[warn 2020/08/20 20:54:09.762 UTC <Default Executor-thread-204> tid=0x255] XXX JCALocalTransaction.begin about to begin gfTxMgr=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5

[warn 2020/08/20 20:54:09.762 UTC <Default Executor-thread-204> tid=0x255] XXX TXStateProxyImpl.TXStateProxyImpl
java.lang.Exception
	at org.apache.geode.internal.cache.TXStateProxyImpl.<init>(TXStateProxyImpl.java:95)
	at org.apache.geode.internal.cache.TXManagerImpl.begin(TXManagerImpl.java:361)
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.begin(JCALocalTransaction.java:77)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.start(LocalTransactionWrapper.java:668)
	at com.ibm.ws.Transaction.JTA.JTAResourceBase.start(JTAResourceBase.java:121)
	at com.ibm.tx.jta.impl.RegisteredResources.startRes(RegisteredResources.java:835)
	at com.ibm.tx.jta.impl.RegisteredResources.enlistResource(RegisteredResources.java:289)
	at com.ibm.tx.jta.impl.TransactionImpl.enlistResource(TransactionImpl.java:1991)
	at com.ibm.tx.jta.embeddable.impl.EmbeddableTranManagerSet.enlistOnePhase(EmbeddableTranManagerSet.java:184)
	at com.ibm.ws.transaction.services.TransactionManagerService.enlistOnePhase(TransactionManagerService.java:366)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.enlist(LocalTransactionWrapper.java:412)
	at com.ibm.ejs.j2c.ConnectionManager.initializeForUOW(ConnectionManager.java:1037)
	at com.ibm.ejs.j2c.ConnectionManager.involveMCInTran(ConnectionManager.java:699)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:316)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[warn 2020/08/20 20:54:09.766 UTC <Default Executor-thread-204> tid=0x255] XXX JCALocalTransaction.begin done begin tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:3

[warn 2020/08/20 20:54:09.766 UTC <Default Executor-thread-204> tid=0x255] XXX JCAManagedConnection.<init> transactionManager=org.apache.geode.internal.cache.TXManagerImpl@67ce95b5
java.lang.Exception: JCAManagedConnection.init
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.init(JCAManagedConnection.java:142)
	at org.apache.geode.internal.ra.spi.JCAManagedConnection.getConnection(JCAManagedConnection.java:123)
	at com.ibm.ejs.j2c.MCWrapper.getConnection(MCWrapper.java:1928)
	at com.ibm.ejs.j2c.ConnectionManager.allocateConnection(ConnectionManager.java:326)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:44)
	at org.apache.geode.internal.ra.GFConnectionFactoryImpl.getConnection(GFConnectionFactoryImpl.java:25)
	at org.springframework.data.gemfire.config.annotation.support.AbstractGemFireAsLastResourceAspectSupport$GemFireConnectionHolder.acquire(AbstractGemFireAsLastResourceAspectSupport.java:526)
	at org.springframework.data.gemfire.config.annotation.support.GemFireAsLastResourceConnectionAcquiringAspect.doGemFireConnectionFactoryGetConnection(GemFireAsLastResourceConnectionAcquiringAspect.java:61)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager$UOWActionAdapter.run(WebSphereUowTransactionManager.java:371)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:736)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[error 2020/08/20 20:54:09.767 UTC <Default Executor-thread-204> tid=0x255] XXX GemFireConnectionHolder.acquire done getConnection conn=org.apache.geode.internal.ra.GFConnectionImpl@4ceb1f42

[info 2020/08/20 20:54:09.768 UTC <Default Executor-thread-204> tid=0x255] Geode Test2 finding tradeId=0

[info 2020/08/20 20:54:09.781 UTC <Default Executor-thread-204> tid=0x255] Geode Test2 found trade=Trade[id=0; cusip=LLY; shares=77; price=69.56]

[info 2020/08/20 20:54:09.786 UTC <Default Executor-thread-204> tid=0x255] Geode Test2 saved trade=Trade[id=0; cusip=LLY; shares=77; price=517.42]

[trace 2020/08/20 20:54:09.787 UTC <Default Executor-thread-204> tid=0x255] Triggering beforeCommit synchronization

[trace 2020/08/20 20:54:09.787 UTC <Default Executor-thread-204> tid=0x255] Triggering beforeCompletion synchronization

[warn 2020/08/20 20:54:09.789 UTC <Default Executor-thread-204> tid=0x255] XXX JCALocalTransaction.commit tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:3; identity=1397249663
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:101)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[warn 2020/08/20 20:54:09.793 UTC <Default Executor-thread-204> tid=0x255] XXX CachePerfStats.txSuccess 
java.lang.Exception
	at org.apache.geode.internal.cache.CachePerfStats.txSuccess(CachePerfStats.java:1200)
	at org.apache.geode.internal.cache.TXManagerImpl.noteCommitSuccess(TXManagerImpl.java:487)
	at org.apache.geode.internal.cache.TXManagerImpl.commit(TXManagerImpl.java:451)
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:112)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest2(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest2(TradeController.java:58)

[debug 2020/08/20 20:54:09.795 UTC <Default Executor-thread-204> tid=0x255] Returned from WebSphere UOW action: type=1, join=false

[trace 2020/08/20 20:54:09.797 UTC <Default Executor-thread-204> tid=0x255] Closing GemFire Connection...

[trace 2020/08/20 20:54:09.830 UTC <Default Executor-thread-204> tid=0x255] Removed value [org.springframework.orm.jpa.EntityManagerHolder@11c1fcdf] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] from thread [Default Executor-thread-204]
```
####Test1 Continues and Fails

```
[info 2020/08/20 20:54:18.668 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 woke up

[info 2020/08/20 20:54:18.672 UTC <Default Executor-thread-201> tid=0x252] Geode Test1 saved trade=Trade[id=0; cusip=LLY; shares=77; price=360.55]

[trace 2020/08/20 20:54:18.672 UTC <Default Executor-thread-201> tid=0x252] Triggering beforeCommit synchronization

[trace 2020/08/20 20:54:18.673 UTC <Default Executor-thread-201> tid=0x252] Triggering beforeCompletion synchronization

[warn 2020/08/20 20:54:18.674 UTC <Default Executor-thread-201> tid=0x252] XXX JCALocalTransaction.commit tid=TXId: ip-xxx(SpringBasedCacheClientApplication:485141:loner):51412:1d6c9e0d:SpringBasedCacheClientApplication:2; identity=870844497
java.lang.Exception
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:101)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[ERROR   ] J2CA0024E: Method commit, within transaction branch ID {XidImpl: formatId(57415344), gtrid_length(36), bqual_length(40),
data(000001740da66878000000013679ebd861581484eccc6147d7a1e9cfd81d7f23664e762a000001740da66878000000013679ebd861581484eccc6147d7a1e9cfd81d7f23664e762a00000001)} of resource pool gfe/jca/connectionManager, caught javax.resource.spi.LocalTransactionException: org.apache.geode.cache.CommitConflictException: Entry for key 0 on region Trades had a state change
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:116)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
	at [internal classes]
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)
 and threw a XAException.
[ERROR   ] WTRN0075W: Transaction 000001740DA66878000000013679EBD861581484ECCC6147D7A1E9CFD81D7F23664E762A000001740DA66878000000013679EBD861581484ECCC6147D7A1E9CFD81D7F23664E762A00000001 received a heuristic exception when committing a resource.
[trace 2020/08/20 20:54:18.860 UTC <Default Executor-thread-201> tid=0x252] Closing GemFire Connection...

[trace 2020/08/20 20:54:18.867 UTC <Default Executor-thread-201> tid=0x252] Removed value [org.springframework.orm.jpa.EntityManagerHolder@508944ba] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] from thread [Default Executor-thread-201]

[ERROR   ] SRVE0777E: Exception thrown by application class 'org.springframework.web.servlet.FrameworkServlet.processRequest:1,014'
org.springframework.web.util.NestedServletException: Request processing failed; nested exception is org.springframework.transaction.TransactionSystemException: UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:686)
Caused by: org.springframework.transaction.TransactionSystemException: UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:313)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)
Caused by: com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:757)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
Caused by: javax.transaction.HeuristicMixedException
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:715)
Caused by: javax.transaction.xa.XAException
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:157)
Caused by: javax.resource.spi.LocalTransactionException: org.apache.geode.cache.CommitConflictException: Entry for key 0 on region Trades had a state change
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:116)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)

[error 2020/08/20 20:54:18.979 UTC <Default Executor-thread-201> tid=0x252] Forwarding to error page from request [/geodetest1/0] due to exception [UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException]
org.springframework.transaction.TransactionSystemException: UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:313)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$336b97a8.runGeodeTest1(<generated>)
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)
Caused by: com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:757)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderUOW(EmbeddableUOWManagerImpl.java:329)
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:306)
Caused by: javax.transaction.HeuristicMixedException
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:715)
	at com.ibm.tx.jta.impl.TranManagerImpl.commit(TranManagerImpl.java:165)
	at com.ibm.tx.jta.impl.TranManagerSet.commit(TranManagerSet.java:113)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowCommit(EmbeddableUOWManagerImpl.java:834)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.uowEnd(EmbeddableUOWManagerImpl.java:812)
	at com.ibm.ws.uow.embeddable.EmbeddableUOWManagerImpl.runUnderNewUOW(EmbeddableUOWManagerImpl.java:754)
Caused by: javax.transaction.xa.XAException
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:157)
	at com.ibm.tx.jta.impl.OnePhaseResourceImpl.commit_one_phase(OnePhaseResourceImpl.java:113)
	at com.ibm.tx.jta.impl.RegisteredResources.flowCommitOnePhase(RegisteredResources.java:2045)
	at com.ibm.tx.jta.impl.TransactionImpl.commitXAResources(TransactionImpl.java:1478)
	at com.ibm.tx.jta.impl.TransactionImpl.stage1CommitProcessing(TransactionImpl.java:801)
	at com.ibm.tx.jta.impl.TransactionImpl.processCommit(TransactionImpl.java:768)
	at com.ibm.tx.jta.impl.TransactionImpl.commit(TransactionImpl.java:711)
Caused by: javax.resource.spi.LocalTransactionException: org.apache.geode.cache.CommitConflictException: Entry for key 0 on region Trades had a state change
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:116)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)

[trace 2020/08/20 20:54:18.992 UTC <Default Executor-thread-201> tid=0x252] Bound value [org.springframework.orm.jpa.EntityManagerHolder@35c2f385] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] to thread [Default Executor-thread-201]

[trace 2020/08/20 20:54:19.057 UTC <Default Executor-thread-201> tid=0x252] Removed value [org.springframework.orm.jpa.EntityManagerHolder@35c2f385] for key [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean@6e376a83] from thread [Default Executor-thread-201]
```