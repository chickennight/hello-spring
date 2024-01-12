FROM openjdk:17

WORKDIR /app

COPY build/libs/*.jar service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service.jar"]