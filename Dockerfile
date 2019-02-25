FROM openjdk:8u191-jre-alpine3.9

RUN apk add curl jq

# workspace
WORKDIR /usr/share/Artlist

#ADD .jar under target from host into this image
ADD target/selenium-docker.jar          selenium-docker.jar
ADD target/selenium-docker-tests.jar    selenium-docker-tests.jar
ADD target/libs                         libs 

#add suite files
ADD Sanity.xml                          Sanity.xml

#ADD health check script
ADD healthcheck.sh                      healthcheck.sh

#BROWSER
#HUB_HOST
#MODULE
ENTRYPOINT sh healthcheck.sh            


