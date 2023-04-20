FROM openjdk:8-jre-alpine

ARG JAR_FILE

WORKDIR /app

COPY ${JAR_FILE} app.jar

CMD ["java", "-jar", "app.jar"]
