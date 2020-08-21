#Launch EC2 Instance

##Launch EC2 Instance Using Wizard
Launch an EC2 instance using the wizard from:

```
https://ca-central-1.console.aws.amazon.com/ec2/v2/home?region=ca-central-1#LaunchInstanceWizard:
```
Search for WebSphere Liberty

I selected:

```
MidVision RapidDeploy for Liberty
 (0)| 20.0.0.5 | By MidVision Limited
Starting from $0.15/hr or from $1,182.00/yr (10% savings) for software + AWS usage fees
Linux/Unix, Red Hat Enterprise Linux 8 | 64-bit (x86) Amazon Machine Image (AMI) | Updated: 6/18/20
This AMI has RapidDeploy v5.0 +IBM Liberty v20 installed on Red Hat Enterprise Linux 7.5 base.
```
##Accept Terms
Before this AMI can be launched, you must accept the terms here:

```
https://aws.amazon.com/marketplace/server/procurement?productId=23696353-a26a-40fa-9cff-a5f283ecf823
```
##Configure EC2 Instance
I configured the instance using this documentation:

```
https://www.midvisioncloud.com/ibm-websphere-on-amazon-web-services/ibm-websphere-liberty-profile-edition-aws/
```

##Choose Instance Type
I chose `t2.large`

##Configure Instance Details
I left the defaults

##Add Storage
I left the defaults

##Add Tags
I left the defaults

##Configure Security Group
I created a new security group with these ports enabled:

```
Port 22 to connect via SSH (enabled by default), 
Port 9080 to connect to the helloworld application in Liberty Profile
Port 9090 to reach RapidDeploy web console, 
Port 20000 and 20100 to open for RapidDeploy Remote Agent
```
All of these with 0.0.0.0/0 access.

##Review Instance Launch
Launch with an AWS key pair.