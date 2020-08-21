#Copy and Deploy Files

##Copy Geode to EC2 Instance
Copy Geode product to the EC2 instance like:

```
scp -i my.pem apache-geode.zip midvision@ec2-xxx.ca-central-1.compute.amazonaws.com:
```
Unzip it on the instance like:

```
unzip apache-geode.zip 
```
##Copy Scripts
Copy the Geode scripts to the EC2 instance like:

```
scp -i my.pem setenv.sh cleanupfiles.sh shutdownall.gfsh shutdownall.sh startandconfigure.gfsh startandconfigure.sh midvision@ec2-xxx.ca-central-1.compute.amazonaws.com:
```
##Modify setenv.sh
Modify `GEODE` environment variable in the `setenv.sh` script like:

```
export GEODE=/home/midvision/apache-geode
export PATH=$GEODE/bin:$PATH
```
##Start Locator and Servers
Start and configure the locator and servers like:

```
./startandconfigure.sh 
```
##Copy ear to EC2 Instance
Copy the ear to the EC2 instance like:

```
scp -i my.pem jta-websphere-liberty.ear midvision@ec2-xxx.ca-central-1.compute.amazonaws.com:
```
##Copy ObjectFactory jar to EC2 Instance
Copy the ObjectFactory jar to the EC2 instance like:

```
scp -i my.pem objectfactory-0.0.1-SNAPSHOT.jar midvision@ec2-xxx.ca-central-1.compute.amazonaws.com:
```
##Copy H2 jar to EC2 Instance
Copy the H2 jar to the EC2 instance like:

```
scp -i my.pem h2-1.4.200.jar midvision@ec2-xxx.ca-central-1.compute.amazonaws.com:deploy/lib
```
##Liberty Installation Directory
Liberty is installed here:

```
/opt/IBM/WebSphere/Liberty
```
The defaultServer is here:

```
/opt/IBM/WebSphere/Liberty/usr/servers/defaultServer
```
##Deploy Application
All of the directories in the Liberty server directory are owned by root:

```
[midvision@ip-172-31-13-92 ~]$ ll /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/
total 52
drwxr-xr-x. 3 root      root         22 Aug 12 16:58 apps
drwxr-xr-x. 2 root      root         28 Aug 12 23:22 dropins
drwxr-x---. 4 root      root       4096 Aug 20 00:24 logs
drwxr-x---. 3 root      root         22 Aug 12 17:46 resources
-rwxr-xr-x. 1 root      root         41 Jun  3 16:27 server.env
-rw-rw-r--. 1 midvision midvision  2383 Aug 19 20:57 server.xml
drwxr-x---. 4 root      root         39 Aug 12 22:42 tranlog
drwxr-xr-x. 5 root      root        134 Aug 20 00:23 workarea
```
So I created a directory in the home directory on the EC2 instance and deployed the application from there.

The `deploy` directory and its subdirectories look like:

```
deploy/:
drwxr-xr-x. 2 midvision midvision 68 Aug 19 21:36 lib
drwxrwxr-x. 2 midvision midvision 39 Aug 19 21:24 app

deploy/lib:
-rw-------. 1 midvision midvision    1470 Aug 19 21:36 objectfactory-0.0.1-SNAPSHOT.jar
-rwxr-xr-x. 1 midvision midvision 2303679 Aug 13 18:31 h2-1.4.200.jar

deploy/app:
-rw-------. 1 midvision midvision 121823126 Aug 19 21:24 jta-websphere-liberty.ear
```
The files contained in these directories are:

- The `objectfactory-0.0.1-SNAPSHOT.jar` contains the ObjectFactory for binding the TransactionManager into JNDI. See [Binding Liberty Transaction Manager to JNDI](README_BindingLibertyTransactionManagertoJNDI.md) for details.
- The `h2-1.4.200.jar` contains the H2 JDBC driver
- The `jta-websphere-liberty.ear` contains the application

As soon as the ear file is dropped into the `deploy/app` directory, it is redeployed by Liberty. I found that jars in the war were reloaded, but jars in the ear/lib were not. So if I made a change to `geode-core-1.12.0.jar` (for example), I had to bounce the Liberty server. See [Initial Liberty Configuration](README_InitialLibertyConfiguration.md) for details on bouncing the Liberty server.

##Deploy EAR
Deploy the ear like:

```
mv jta-websphere-liberty.ear deploy/app
```
##Deploy ObjectFactory
Deploy the ObjectFactory jar like:

```
mv objectfactory-0.0.1-SNAPSHOT.jar deploy/lib
```
##Deploy H2
Deploy the H2 jar like:

```
mv h2-1.4.200.jar deploy/lib
```
##Tail console.log
Tail the console.log like:

```
sudo tail -f /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/logs/console.log
```
##Tail messages.log
Tail the messages.log like:

```
sudo tail -f /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/logs/messages.log
```
##View FFDC Logs
View a FFDC log like:

```
sudo ls -l /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/logs/ffdc
sudo head -200 /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/logs/ffdc/ffdc_20.08.12_21.44.55.0.log
```