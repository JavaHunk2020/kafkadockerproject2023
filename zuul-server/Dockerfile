#Installing java inside docker container
FROM java:8

#Installing maven inside docker container
FROM maven:alpine

WORKDIR  /microservices

COPY . /microservices

RUN mvn clean install -DskipTests

LABEL maintainer="technohunk444@gmail.com"

RUN cp  target/zuul-server-0.0.1-SNAPSHOT.jar  zuul-server-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "zuul-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8762

