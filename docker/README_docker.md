## Description
This docker directory configures docker so that Liberty and GemFire run in the container. The test curl commands run on the host.

This was tested against Geode 1.12 with the fix for GEODE-8483.

## Build Geode
Build Geode and tar the geode-assembly/build/install/apache-geode directory.

Copy geode-core-1.12.0.jar to the ear/lib directory.

Create the ear file.

## Copy Files
Copy these files to this directory:

- apache-geode.tgz
- h2-1.4.200.jar
- jta-websphere-liberty.ear

## Download websphere-liberty docker image
```
docker pull websphere-liberty
Using default tag: latest
latest: Pulling from library/websphere-liberty
f08d8e2a3ba1: Pull complete 
3baa9cb2483b: Pull complete 
94e5ff4c0b15: Pull complete 
1860925334f9: Pull complete 
95c98416fa53: Pull complete 
3a5f476bbd91: Pull complete 
59a6f5bbae4a: Pull complete 
f6e17cf793e4: Pull complete 
7bfb88b67122: Pull complete 
d20be25cdabd: Pull complete 
d11f3b9f04fb: Pull complete 
481c197754fd: Pull complete 
8fc5df1c287a: Pull complete 
7fde6f95030b: Pull complete 
9f72ed5ca14c: Pull complete 
ef35fe555e71: Pull complete 
Digest: sha256:d60c6c2529636d7a86bbc4af3fd7ec5936606f0e16a3d846cc7b1ec40984ed13
Status: Downloaded newer image for websphere-liberty:latest
docker.io/library/websphere-liberty:latest
```
## Configure docker image
```
docker build --tag websphere-liberty-test:1.0 .
Sending build context to Docker daemon  252.3MB
Step 1/20 : FROM websphere-liberty:webProfile8
 ---> 6017740d4320
Step 2/20 : WORKDIR /home/default
 ---> Using cache
 ---> a2fdcf5613a2
Step 3/20 : ENV JAVA_VERSION 8u261
 ---> Using cache
 ---> 233d8e9fdff3
Step 4/20 : ENV JAVA_SUB_VERSION 261
 ---> Using cache
 ---> 643d86243950
Step 5/20 : ENV JDK_BUNDLE_ID 242980_a4634525489241b9a9e1aa73d9e118e6
 ---> Using cache
 ---> ecdef3d6a6e7
Step 6/20 : USER root
 ---> Using cache
 ---> 4b836dc8c899
Step 7/20 : RUN apt-get update && apt-get install -y wget
 ---> Using cache
 ---> ddb2c049c57a
Step 8/20 : RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" https://javadl.oracle.com/webapps/download/AutoDL?BundleId=$JDK_BUNDLE_ID -O jre-$JAVA_VERSION-linux-x64.tar.gz
 ---> Using cache
 ---> 7e7c558e1b7c
Step 9/20 : RUN tar xzf jre-$JAVA_VERSION-linux-x64.tar.gz
 ---> Using cache
 ---> 040358310176
Step 10/20 : ADD apache-geode.tgz .
 ---> Using cache
 ---> 6e283bd55995
Step 11/20 : COPY shutdownall.sh .
 ---> Using cache
 ---> 27af3b9d4a46
Step 12/20 : COPY startandconfigure.gfsh .
 ---> ae7841cba24d
Step 13/20 : COPY startandconfigure.sh .
 ---> ef20a70eb60a
Step 14/20 : ENV JAVA_HOME /home/default/jre1.8.0_$JAVA_SUB_VERSION
 ---> Running in 467cd1a94654
Removing intermediate container 467cd1a94654
 ---> 6b14482cb6c7
Step 15/20 : ENV GEMFIRE /home/default/apache-geode
 ---> Running in 04cfb9b6800a
Removing intermediate container 04cfb9b6800a
 ---> 93412f4d2ab2
Step 16/20 : ENV PATH $JAVA_HOME/bin:$GEMFIRE/bin:$PATH
 ---> Running in 1dd1db879a20
Removing intermediate container 1dd1db879a20
 ---> 801e8f015c92
Step 17/20 : COPY --chown=1001:0 jta-websphere-liberty.ear /config/apps
 ---> 31e30eb020ce
Step 18/20 : COPY --chown=1001:0 h2-1.4.200.jar /config/apps
 ---> 0512c2af5e02
Step 19/20 : COPY --chown=1001:0 server.xml /config
 ---> bc92385a96ba
Step 20/20 : RUN configure.sh
 ---> Running in 8f0411ef6829
+ WLP_INSTALL_DIR=/opt/ibm/wlp
+ SHARED_CONFIG_DIR=/opt/ibm/wlp/usr/shared/config
+ SHARED_RESOURCE_DIR=/opt/ibm/wlp/usr/shared/resources
+ SNIPPETS_SOURCE=/opt/ibm/helpers/build/configuration_snippets
+ SNIPPETS_TARGET=/config/configDropins/overrides
+ SNIPPETS_TARGET_DEFAULTS=/config/configDropins/defaults
+ mkdir -p /config/configDropins/overrides
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' == client ']'
+ '[' '' == embedded ']'
+ '[' '' == true ']'
+ '[' '' == true ']'
+ keystorePath=/config/configDropins/defaults/keystore.xml
+ '[' '' == true ']'
+ '[' '' == true ']'
+ '[' '' '!=' false ']'
+ '[' '' '!=' false ']'
+ '[' '!' -e /config/configDropins/defaults/keystore.xml ']'
++ openssl rand -base64 32
+ export KEYSTOREPWD=oLf+4Artb/tz+A9byVbXVU9D3qNN5Khmlre/EEndN/k=
+ KEYSTOREPWD=oLf+4Artb/tz+A9byVbXVU9D3qNN5Khmlre/EEndN/k=
+ sed -i.bak 's|REPLACE|oLf+4Artb/tz+A9byVbXVU9D3qNN5Khmlre/EEndN/k=|g' /opt/ibm/helpers/build/configuration_snippets/keystore.xml
+ cp /opt/ibm/helpers/build/configuration_snippets/keystore.xml /config/configDropins/defaults/keystore.xml
+ '[' '' ']'
+ installUtility install --acceptLicense defaultServer
Checking for missing features required by the server ...
The server requires the following additional features: jca-1.7.  Installing features from the repository ...
Establishing a connection to the configured repositories ...
This process might take several minutes to complete.

Successfully connected to all configured repositories.

Preparing assets for installation. This process might take several minutes to complete.

Additional Liberty features must be installed for this server.

To install the additional features, review and accept the feature license agreement:
The --acceptLicense argument was found. This indicates that you have
accepted the terms of the license agreement.


Step 1 of 4: Downloading jca-1.7 ...
Step 2 of 4: Installing jca-1.7 ...
Step 3 of 4: Validating installed fixes ...
Step 4 of 4: Cleaning up temporary files ...


All assets were successfully installed.

Start product validation...
Product validation completed successfully.
+ find /opt/ibm/fixes -type f -name '*.jar' -print0
+ sort -z
+ xargs -0 -n 1 -r -I '{}' java -jar '{}' --installLocation /opt/ibm/wlp
+ find /opt/ibm/wlp -perm -g=w -print0
+ xargs -0 -r chmod -R g+rw
+ /opt/ibm/wlp/bin/server start

Starting server defaultServer.
Server defaultServer started with process ID 103.
+ /opt/ibm/wlp/bin/server stop

Stopping server defaultServer.
Server defaultServer stopped.
+ rm -rf /output/messaging /logs/console.log /logs/ffdc /logs/messages.log /logs/messages_20.09.03_22.52.42.0.log /logs/trace.log /logs/trace_20.09.03_22.52.43.0.log /logs/trace_ws.log /logs/trace_ws_20.09.03_22.52.43.0.log /logs/trace_ws_20.09.03_22.53.15.0.log /logs/trace_ws_20.09.03_22.53.19.0.log /opt/ibm/wlp/output/.classCache /output/workarea
+ chmod -R g+rwx /opt/ibm/wlp/output/defaultServer
+ find /opt/ibm/wlp -type d -perm -g=x -print0
+ xargs -0 -r chmod -R g+rwx
Removing intermediate container 8f0411ef6829
 ---> ac15dab87448
Successfully built ac15dab87448
Successfully tagged websphere-liberty-test:1.0
```
## Run docker image
```
docker run -d -p 9080:9080 --name wl websphere-liberty-test:1.0
06e1c0173b4454ef320f04bf7225f534f7f6629c63b4ed3596105c2859d46b58
```
## Start docker terminal
```
docker exec -it wl /bin/bash; exit
docker exec -it 06e1c0173b4454ef320f04bf7225f534f7f6629c63b4ed3596105c2859d46b58 /bin/bash; exit
$ 
```
Start Locator and Servers
-------------------------
Start the locator and servers inside the docker terminal.

Note: The Liberty server is starting at this same time. Usually these commands complete before Liberty is started.

```
root@ba5d1091d7b9:/home/default# ./startandconfigure.sh 
1. Executing - start locator --name=locator

..........
Locator in /home/default/locator on ba5d1091d7b9[10334] as locator is currently online.
Process ID: 144
Uptime: 11 seconds
Geode Version: 1.12.0
Java Version: 1.8.0_261
Log File: /home/default/locator/locator.log
JVM Arguments: -Dgemfire.enable-cluster-configuration=true -Dgemfire.load-cluster-configuration-from-dir=false -Dgemfire.launcher.registerSignalHandlers=true -Djava.awt.headless=true -Dsun.rmi.dgc.server.gcInterval=9223372036854775806
Class-Path: /home/default/apache-geode/lib/geode-core-1.12.0.jar:/home/default/apache-geode/lib/geode-dependencies.jar

Successfully connected to: JMX Manager [host=ba5d1091d7b9, port=1099]

Cluster configuration service is up and running.

2. Executing - set variable --name=APP_RESULT_VIEWER --value=any

Value for variable APP_RESULT_VIEWER is now: any.

3. Executing - configure pdx --read-serialized=true

read-serialized = true
ignore-unread-fields = false
persistent = false
Cluster configuration for group 'cluster' is updated.

4. Executing - start server --name=server-1 --server-port=0 --initial-heap=1g --max-heap=1g --statistic-archive-file=cacheserver.gfs --J=-Dgemfire.conserve-sockets=false --J=-Dgemfire.log-file=cacheserver.log

........
Server in /home/default/server-1 on ba5d1091d7b9[36617] as server-1 is currently online.
Process ID: 258
Uptime: 6 seconds
Geode Version: 1.12.0
Java Version: 1.8.0_261
Log File: /home/default/server-1/cacheserver.log
JVM Arguments: -Dgemfire.default.locators=172.17.0.2[10334] -Dgemfire.start-dev-rest-api=false -Dgemfire.use-cluster-configuration=true -Dgemfire.statistic-archive-file=cacheserver.gfs -Dgemfire.conserve-sockets=false -Dgemfire.log-file=cacheserver.log -XX:OnOutOfMemoryError=kill -KILL %p -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=60 -Dgemfire.launcher.registerSignalHandlers=true -Djava.awt.headless=true -Dsun.rmi.dgc.server.gcInterval=9223372036854775806
Class-Path: /home/default/apache-geode/lib/geode-core-1.12.0.jar:/home/default/apache-geode/lib/geode-dependencies.jar

5. Executing - start server --name=server-2 --server-port=0 --initial-heap=1g --max-heap=1g --statistic-archive-file=cacheserver.gfs --J=-Dgemfire.conserve-sockets=false --J=-Dgemfire.log-file=cacheserver.log

.......
Server in /home/default/server-2 on ba5d1091d7b9[37421] as server-2 is currently online.
Process ID: 350
Uptime: 6 seconds
Geode Version: 1.12.0
Java Version: 1.8.0_261
Log File: /home/default/server-2/cacheserver.log
JVM Arguments: -Dgemfire.default.locators=172.17.0.2[10334] -Dgemfire.start-dev-rest-api=false -Dgemfire.use-cluster-configuration=true -Dgemfire.statistic-archive-file=cacheserver.gfs -Dgemfire.conserve-sockets=false -Dgemfire.log-file=cacheserver.log -XX:OnOutOfMemoryError=kill -KILL %p -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=60 -Dgemfire.launcher.registerSignalHandlers=true -Djava.awt.headless=true -Dsun.rmi.dgc.server.gcInterval=9223372036854775806
Class-Path: /home/default/apache-geode/lib/geode-core-1.12.0.jar:/home/default/apache-geode/lib/geode-dependencies.jar

6. Executing - create region --name=Trades --type=PARTITION_REDUNDANT

 Member  | Status | Message
-------- | ------ | --------------------------------------
server-1 | OK     | Region "/Trades" created on "server-1"
server-2 | OK     | Region "/Trades" created on "server-2"

Cluster configuration for group 'cluster' is updated.

************************* Execution Summary ***********************
Script file: startandconfigure.gfsh

Command-1 : start locator --name=locator
Status    : PASSED

Command-2 : set variable --name=APP_RESULT_VIEWER --value=any
Status    : PASSED

Command-3 : configure pdx --read-serialized=true
Status    : PASSED

Command-4 : start server --name=server-1 --server-port=0 --initial-heap=1g --max-heap=1g --statistic-archive-file=cacheserver.gfs --J=-Dgemfire.conserve-sockets=false --J=-Dgemfire.log-file=cacheserver.log
Status    : PASSED

Command-5 : start server --name=server-2 --server-port=0 --initial-heap=1g --max-heap=1g --statistic-archive-file=cacheserver.gfs --J=-Dgemfire.conserve-sockets=false --J=-Dgemfire.log-file=cacheserver.log
Status    : PASSED

Command-6 : create region --name=Trades --type=PARTITION_REDUNDANT
Status    : PASSED
```
## Tail Log
```
root@eeabd2c56dc6:/home/default# ./taillog.sh 
```
## Curl Commands
Execute these curl commands from the host, not the container.

### Create Trades
```
curl http://localhost:9080/jta-websphere-liberty/createtrades/10
```
The tail will show messages like:

```
[9/3/20 21:04:09:979 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:09.979 GMT <Default Executor-thread-168> tid=0x1e4] About to create trade=0

[9/3/20 21:04:10:960 GMT] 000001e4 SystemOut [trace 2020/09/03 21:04:10.960 GMT <Default Executor-thread-168> tid=0x1e4] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[9/3/20 21:04:13:327 GMT] 000001e4 SystemOut [debug 2020/09/03 21:04:13.327 GMT <Default Executor-thread-168> tid=0x1e4] Adding transactional method 'save' with attribute: PROPAGATION_REQUIRED,ISOLATION_DEFAULT

[9/3/20 21:04:13:544 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:13.544 GMT <Default Executor-thread-168> tid=0x1e4] Saved trade=Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[9/3/20 21:04:13:545 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:13.545 GMT <Default Executor-thread-168> tid=0x1e4] Event TransactionPhase.BEFORE_COMMIT: Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[9/3/20 21:04:13:690 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:13.689 GMT <Default Executor-thread-168> tid=0x1e4] Event TransactionPhase.AFTER_COMMIT: Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[9/3/20 21:04:13:691 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:13.691 GMT <Default Executor-thread-168> tid=0x1e4] Event TransactionPhase.AFTER_COMPLETION: Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[9/3/20 21:04:13:705 GMT] 000001e4 SystemOut [trace 2020/09/03 21:04:13.705 GMT <Default Executor-thread-168> tid=0x1e4] Closing GemFire Connection...

[9/3/20 21:04:13:710 GMT] 000001e4 SystemOut [info 2020/09/03 21:04:13.710 GMT <Default Executor-thread-168> tid=0x1e4] Created trade=0
```
### Run Test 1
```
curl http://localhost:9080/jta-websphere-liberty/geodetest1/0
```
The tail will show messages like:

```
[trace 2020/09/03 21:04:30.236 GMT <Default Executor-thread-188> tid=0x208] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[info 2020/09/03 21:04:30.243 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 finding tradeId=0

[info 2020/09/03 21:04:30.263 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 found trade=Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[info 2020/09/03 21:04:30.263 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 updated trade=Trade[id=0; cusip=HSBC; shares=67; price=620.24]

[info 2020/09/03 21:04:30.264 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 about to sleep for 15000 milliseconds before committing
```
See Test2 output below

```
[info 2020/09/03 21:04:45.265 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 woke up

[info 2020/09/03 21:04:45.271 GMT <Default Executor-thread-188> tid=0x208] Geode Test1 saved trade=Trade[id=0; cusip=HSBC; shares=67; price=620.24]

[9/3/20 21:04:45:360 GMT] 00000208 com.ibm.ws.logging.internal.impl.IncidentImpl                I FFDC1015I: An FFDC Incident has been created: "javax.resource.spi.LocalTransactionException: org.apache.geode.cache.CommitConflictException: Entry for key 0 on region Trades had a state change com.ibm.ejs.j2c.LocalTransactionWrapper.commit 164" at ffdc_20.09.03_21.04.45.0.log
[9/3/20 21:04:45:361 GMT] 00000208 com.ibm.ejs.j2c.LocalTransactionWrapper                      E J2CA0024E: Method commit, within transaction branch ID {XidImpl: formatId(57415344), gtrid_length(36), bqual_length(40),
data(0000017455c9001b000000015722c8f40c257aa80043a48596b53c73330b90816b5dc7950000017455c9001b000000015722c8f40c257aa80043a48596b53c73330b90816b5dc79500000001)} of resource pool gfe/jca/connectionManager, caught javax.resource.spi.LocalTransactionException: org.apache.geode.cache.CommitConflictException: Entry for key 0 on region Trades had a state change
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:109)
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
	at example.jta.client.controller.TradeController.runGeodeTest1(TradeController.java:30)

[9/3/20 21:04:45:424 GMT] 00000208 com.ibm.ws.webcontainer.util.ApplicationErrorUtils           E SRVE0777E: Exception thrown by application class 'org.springframework.web.servlet.FrameworkServlet.processRequest:1,014'
Caused by: org.springframework.transaction.TransactionSystemException: UOWManager transaction processing failed; nested exception is com.ibm.wsspi.uow.UOWException: javax.transaction.HeuristicMixedException
	at org.springframework.transaction.jta.WebSphereUowTransactionManager.execute(WebSphereUowTransactionManager.java:313)
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:394)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118)
	at example.jta.client.service.TradeService$$EnhancerBySpringCGLIB$$2c60d3b.runGeodeTest1(<generated>)
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
	at org.apache.geode.internal.ra.spi.JCALocalTransaction.commit(JCALocalTransaction.java:109)
	at com.ibm.ejs.j2c.LocalTransactionWrapper.commit(LocalTransactionWrapper.java:145)
```
### Run Test 2
```
curl http://localhost:9080/jta-websphere-liberty/geodetest2/0
```

The tail will show messages like:

```
[trace 2020/09/03 21:04:41.605 GMT <Default Executor-thread-204> tid=0x21a] Acquiring GemFire Connection from GemFire JCA ResourceAdapter registered at [gfe/jca]...

[info 2020/09/03 21:04:41.611 GMT <Default Executor-thread-204> tid=0x21a] Geode Test2 finding tradeId=0

[info 2020/09/03 21:04:41.618 GMT <Default Executor-thread-204> tid=0x21a] Geode Test2 found trade=Trade[id=0; cusip=HSBC; shares=67; price=718.87]

[info 2020/09/03 21:04:41.623 GMT <Default Executor-thread-204> tid=0x21a] Geode Test2 saved trade=Trade[id=0; cusip=HSBC; shares=67; price=915.93]

[trace 2020/09/03 21:04:41.633 GMT <Default Executor-thread-204> tid=0x21a] Closing GemFire Connection...
```
Stop and remove the docker image
--------------------------------
```
docker rm --force wl
```