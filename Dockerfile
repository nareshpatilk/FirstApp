
FROM openjdk:8-jre-alpine
MAINTAINER Naresh Patil

RUN mkdir -p /build

WORKDIR /build/
COPY . .
ENTRYPOINT ["java", "-jar", "/build/target/FirstApp-0.0.1-SNAPSHOT.jar"]