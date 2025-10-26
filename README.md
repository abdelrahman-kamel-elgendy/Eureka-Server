# Eureka Server
A Spring Cloud Netflix Eureka-based service registry server for microservices architecture. This service acts as the central registry for all microservices in the e-commerce platform.

## Project Overview
This service acts as a central registry in a microservices architecture, allowing services to register themselves and discover other available services in the ecosystem.

## Features
- Service Registration & registery: Central registry for microservices.
- Health Monitoring: Custom health endpoints and Spring Boot Actuator integration.
- Security: HTTP Basic authentication for Eureka dashboard.
- Multiple Environments: Support for development, docker, and production profiles.
- Docker Support: Containerization ready with Dockerfile and docker-compose.

## Project Structure
```
Eureka-Server/
├── src/main/java/com/e_commerce/eureka_server/
│   ├── EurekaServer.java                       # Main application class
│   ├── config/
│   │   └── SecurityConfig.java                 # Security configuration
│   └── controller/
│       └── HealthController.java               # Health check endpoint
├── src/main/resources/
│   ├── .env.example                            # Environment variables template
│   └── application.properties                  # Application configuration
└── pom.xml                                     # Maven dependencies
```

## API Endpoints

|Endpoint	     |Method	|Description	            |Authentication|
|----------------|----------|---------------------------|--------------|
|/	             |GET	    |Eureka Dashboard	        |Required      |
|/api/health     |GET	    |Application health status	|Public        |
|/actuator/health|GET	    |Spring Boot Actuator health|Public        |
|/actuator/info	 |GET	    |Application information	|Public        |
|/eureka/**	     |Various	|Eureka server endpoints	|Required      |


## Security
The service is secured with HTTP Basic Authentication:
- Eureka dashboard and API endpoints require authentication.
- Health and info endpoints are publicly accessible.
- Uses BCrypt password encoding.