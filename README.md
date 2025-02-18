# Receipt Processor

Challenge submission for Fetch Rewards. A simple webservice that processes receipts and calculates points for each receipt.

### Technologies used

The application is developed in Java 17, Spring Boot 3.4.2, and Gradle 8.12.1 for build automation. No external databases are used; all data is stored in memory, so shutting down the service will clear all data.

### API documentation

[api.yml](./api.yml)

## Build/run

Docker is the only required software; the project will build and run entirely within a docker container. Java is not required.

All following commands should be run at the top project level.

### Initial setup

```
docker build -t docker-receipt .
docker run -d -p 8080:8080 --name docker-receipt-container docker-receipt
```
