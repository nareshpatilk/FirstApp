FROM alpine/git as clone
WORKDIR /app
RUN git clone -b dev https://github.com/nareshpatilk/FirstApp.git skipcache


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/FirstApp /app
RUN mvn install


FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/FirstApp-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "FirstApp-0.0.1-SNAPSHOT.jar"]