FROM gradle:jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew bootJar

FROM amazoncorretto:17
WORKDIR /app
COPY --from=builder /app/build/libs/receipt-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
