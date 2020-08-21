#Initial Liberty Configuration
I configured the instance using this documentation:

```
https://www.midvisioncloud.com/ibm-websphere-on-amazon-web-services/ibm-websphere-liberty-profile-edition-aws/
```
##Connect to Instance
Connect to the instance using ssh like:

```
ssh -i my.pem midvision@ec2-xxx.ca-central-1.compute.amazonaws.com
```
There will be output like:

```
Welcome to                                                                                                                                             
 __  __ _     ___     ___     _                    ____ _                 _ 
|  \/  (_) __| \ \   / (_)___(_) ___  _ __        / ___| | ___  _   _  __| |
| |\/| | |/ _` |\ \ / /| / __| |/ _ \| '_ \ _____| |   | |/ _ \| | | |/ _` |
| |  | | | (_| | \ V / | \__ \ | (_) | | | |_____| |___| | (_) | |_| | (_| |
|_|  |_|_|\__,_|  \_/  |_|___/_|\___/|_| |_|      \____|_|\___/ \__,_|\__,_|
                                                                            
                                                  	 A MidVision Service

        * WebSite: https://www.midvisioncloud.com/product-category/amazon-web-services-marketplace
        * Support: http://support.midvision.com/redmine/projects/devtestcloud
        * Forum:   https://www.midvisioncloud.com/community
```
##First Logon
The first time I connected, I was taken through Liberty configuration:

- mvadmin admin password
- open 9090 and 9080 ports on the firewall

```
Welcome, this is MidVisionCloud RapidDeploy and WAS Liberty Profile image first run configuration.

Configuration steps:

  - Set RapidDeploy framework initial password.
  - Open ports on RHEL firewall.

Configuring password for RapidDeploy default user 'mvadmin'
Set password for user 'mvadmin'. Submit blank for default value of the instance id: i-0ac9a549b5ac26851

Setting RapidDeploy password for user 'mvadmin'...
HTTP/1.1 200 
Content-Type: text/html
Transfer-Encoding: chunked
Date: Wed, 12 Aug 2020 16:49:55 GMT

RapidDeploy password successfully set
Open firewall ports for RapidDeploy and WAS Liberty Profile (default port 9090 and 9080)  [y/n]?
y
Open firewall port 9090
iptables: Saving firewall rules to /etc/sysconfig/iptables:[  OK  ]
Opening default web UI ports for WebSphere and RapidDeploy.
Open firewall port 9080
iptables: Saving firewall rules to /etc/sysconfig/iptables:[  OK  ]
Type port number to open. Type 'all' to open all ports, type 'exit' to finish.
exit
Configuration finished, you may now start using RapidDeploy services and other software. Web user interfaces are available on:
RapidDeploy: xxx.ca-central-1.compute.amazonaws.com:9090/MidVision
Type 'menu' to launch IBM WebSphere Liberty Profile menu.

http://ec2-35-182-54-185.ca-central-1.compute.amazonaws.com:9090/MidVision/ui/public/welcome.xhtml
```
##Change Public IP Address
Change the default IP address from localhost to the actual IP address.

```
[midvision@ip-xxx ~]$ menu
Main Application Administration Menu on ip-xxx.ca-central-1.compute.internal
=====================================================================================
Please select from list
 1. Display Status for ip-xxx.ca-central-1.compute.internal
 2. Manage Websphere Liberty Profile
 3. Change public IP Address
 4. Open Firewall Port on ip-xxx.ca-central-1.compute.internal
 5. Help for the Management menu
 x. Quit
>3
changeIPMenu valid selection

Change IP address Menu on ip-xxx.ca-central-1.compute.internal - USE WITH CARE.
========================================================================================
Please select from list
 1. Current set IP Address: localhost
 2. Update server.xml files with current actual IP: ec2-xxx.ca-central-1.compute.amazonaws.com
 x. Quit
>2
setHostName valid selection

Updating /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/server.xml with
Replacing [ localhost ] with [ ec2-xxx.ca-central-1.compute.amazonaws.com ] in [ /opt/IBM/WebSphere/Liberty/usr/servers/defaultServer/server.xml ]
Hit any key to return to menu> 

Change IP address Menu on ip-xxx.ca-central-1.compute.internal - USE WITH CARE.
========================================================================================
Please select from list
 1. Current set IP Address: ec2-xxx.ca-central-1.compute.amazonaws.com
 2. Update server.xml files with current actual IP: ec2-xxx.ca-central-1.compute.amazonaws.com
 x. Quit
>
```
##Bounce Liberty
Stop and start Liberty using the menu like:

```
Main Application Administration Menu on ip-xxx.ca-central-1.compute.internal
=====================================================================================
Please select from list
 1. Display Status for ip-xxx.ca-central-1.compute.internal
 2. Manage Websphere Liberty Profile
 3. Change public IP Address
 4. Open Firewall Port on ip-xxx.ca-central-1.compute.internal
 5. Help for the Management menu
 x. Quit
>2
wasMenu valid selection

WebSphere Administration Menu on ip-xxx.ca-central-1.compute.internal
==============================================================================
Please select from list
 1. Stop Liberty Profile Server: defaultServer
 2. Start Liberty Profile Server: defaultServer
 3. Liberty Profile Server Status: defaultServer
 4. Select Liberty Profile Server: Current Server: defaultServer
 5. Liberty Profile Version
 6. Liberty Profile Validation
 7. Liberty Profile Features
 x. Quit
>1
stopServer valid selection
Running command, please wait ...

Stopping server defaultServer.
Server defaultServer is not running.
Hit any key to return to Main menu> 

WebSphere Administration Menu on ip-xxx.ca-central-1.compute.internal
==============================================================================
Please select from list
 1. Stop Liberty Profile Server: defaultServer
 2. Start Liberty Profile Server: defaultServer
 3. Liberty Profile Server Status: defaultServer
 4. Select Liberty Profile Server: Current Server: defaultServer
 5. Liberty Profile Version
 6. Liberty Profile Validation
 7. Liberty Profile Features
 x. Quit
>2
startServer valid selection
Running command, please wait ...

Starting server defaultServer.
Server defaultServer started with process ID 42060.
Hit any key to return to Main menu> 
```