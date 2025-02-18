# Receipt Processor

Challenge submission for Fetch Rewards. A simple webservice that processes receipts and calculates points for each receipt.

### API documentation

[api.yml](./api.yml)

### Build/run

Run the following terminal commands at the top project level:

```
docker build -t docker-receipt .
docker run -d -p 8080:8080 --name docker-receipt-container docker-receipt
```
