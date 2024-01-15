# Build Project as jar file

FROM eclipse-temurin:17-jdk as build

WORKDIR /build

COPY . .

RUN ./gradlew clean build


# Build runtime as image

FROM eclipse-temurin:17-jre

COPY --from=build /build/build/libs/*.jar service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service.jar"]