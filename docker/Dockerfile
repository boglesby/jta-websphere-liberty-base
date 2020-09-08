# I started with this Dockerfile from Jacky: https://github.com/GSSJacky/gemfire-docker/blob/master/Dockerfile

FROM websphere-liberty:webProfile8

# Set working directory
WORKDIR /home/default

# Get JDK
ENV JAVA_VERSION 8u261
ENV JAVA_SUB_VERSION 261
ENV JDK_BUNDLE_ID 242980_a4634525489241b9a9e1aa73d9e118e6

# Done as root to avoid this error on apt-get:
# List directory /var/lib/apt/lists/partial is missing. - Acquire (13: Permission denied)
USER root
RUN apt-get update && apt-get install -y wget

RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" https://javadl.oracle.com/webapps/download/AutoDL?BundleId=$JDK_BUNDLE_ID -O jre-$JAVA_VERSION-linux-x64.tar.gz
RUN tar xzf jre-$JAVA_VERSION-linux-x64.tar.gz

# Copy and untar GemFire and scripts
ADD apache-geode.tgz .
COPY startandconfigure.gfsh .
COPY startandconfigure.sh .
COPY taillog.sh .

# Configure GemFire PATH
ENV JAVA_HOME /home/default/jre1.8.0_$JAVA_SUB_VERSION
ENV GEMFIRE /home/default/apache-geode
ENV PATH $JAVA_HOME/bin:$GEMFIRE/bin:$PATH

# Stop Liberty

# Copy Application
COPY --chown=1001:0 jta-websphere-liberty.ear /config/apps
COPY --chown=1001:0 h2-1.4.200.jar /config/apps
COPY --chown=1001:0 server.xml /config

RUN configure.sh
