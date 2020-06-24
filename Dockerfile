FROM openjdk:8-jre-alpine

RUN mkdir -p /build

WORKDIR /build/
COPY . .
ENTRYPOINT ["java", "-jar", "/build/target/FirstApp-0.0.1-SNAPSHOT.jar"]