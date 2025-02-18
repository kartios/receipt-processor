# Receipt Processor

Challenge submission for Fetch Rewards. A simple webservice that processes receipts and calculates points for each receipt.

### Technologies used

The application is developed in Java 17, Spring Boot 3.4.2, and Gradle 8.12.1 for build automation. No external databases are used; all data is stored in memory, so shutting down the service will clear all data.

### API documentation

[api.yml](./api.yml)

## Build/run

Docker is the only required software to run this service. Java/Gradle are not required.

All following commands should be run at the top project level.

### Initial setup

These commands will run Docker with the [Dockerfile](./Dockerfile) in this repository. It is responsible for building as well as running the application. After initializing the docker container, the service will be available on port 8080 (localhost if running locally).
```
docker build -t docker-receipt .
docker run -d -p 8080:8080 --name docker-receipt-container docker-receipt
```

### Stop docker container

Stops docker container without deleting it.
```
docker stop docker-receipt-container
```

### Start docker after initial setup

Starts the docker container. If this fails, try rerunning the initial setup.
```
docker start docker-receipt-container
```

### Clean up docker environment

Run these commands when done testing to delete the docker container and image.
```
docker stop docker-receipt-container
docker rm docker-receipt-container
docker rmi docker-receipt
```