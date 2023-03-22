#Installing java inside docker container
FROM java:8

#Installing maven inside docker container
FROM maven:alpine

WORKDIR  /microservices

COPY . /microservices

RUN mvn clean install -DskipTests

LABEL maintainer="technohunk444@gmail.com"

RUN cp  target/account-service-0.0.1-SNAPSHOT.jar  account-service-2.0.jar

ENTRYPOINT ["java", "-jar", "account-service-2.0.jar"]
EXPOSE 8000

