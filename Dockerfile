FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /var/www/app

COPY pom.xml .
COPY src src

RUN mvn package -DskipTests


FROM openjdk:17-jdk-slim

WORKDIR /var/www/app

COPY --from=build /var/www/app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]