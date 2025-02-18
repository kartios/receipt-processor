FROM amazoncorretto:17
COPY "./build/libs/receipt-0.0.1-SNAPSHOT.jar" app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]