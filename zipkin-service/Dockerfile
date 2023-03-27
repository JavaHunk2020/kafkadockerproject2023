FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler "pykube02@gmail.com"
ADD target/zipkin-service-0.0.1-SNAPSHOT.jar zipkin-servicey.jar
ENTRYPOINT ["java", "-jar", "/zipkin-servicey.jar"]
EXPOSE 9411