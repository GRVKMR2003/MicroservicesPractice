
# Microservices Practice

## Overview
This project is a practice implementation of microservices architecture using Spring Boot. It includes multiple services such as API Gateway, Hotel Service, and Rating Service. Each service is designed to demonstrate various aspects of microservices including service discovery, load balancing, and inter-service communication.

## Features
- **API Gateway**: Acts as a single entry point for all client requests.
- **Hotel Service**: Manages hotel information including CRUD operations.
- **Rating Service**: Manages ratings for hotels.
- **Service Discovery**: Uses Eureka for service registration and discovery.
- **Database Integration**: Uses MySQL for persistent storage.
- **Reactive Programming**: Uses WebFlux for non-blocking reactive streams.

## Technologies Used

### Backend
- **Spring Boot**: Framework to create stand-alone, production-grade Spring based Applications.
- **Spring Cloud**: Provides tools for developers to quickly build some of the common patterns in distributed systems.
- **Spring Cloud Gateway**: Provides a library for building an API Gateway on top of Spring WebFlux.
- **Spring Cloud Netflix Eureka**: Service registry for service discovery.
- **Spring Data JPA**: Abstraction over the JPA to interact with relational databases.
- **Lombok**: Java library that automatically plugs into your editor and build tools, simplifying Java development.
- **MySQL**: Relational database management system.

### DevOps
- **Docker**: Platform for developing, shipping, and running applications.

## Prerequisites
- Java 21
- Maven
- Docker (for containerization)
- MySQL (for database)

## Getting Started

### Clone the repository
```bash
git clone https://github.com/GRVKMR2003/MicroservicesPractice.git
cd MicroservicesPractice
```

### Set up MySQL
1. Install MySQL if not already installed.
2. Create a database for each service.
3. Update the `application.properties` files in each service to point to your MySQL database.

### Build and Run Services
1. Navigate to each service directory and build the project using Maven:
    ```bash
    mvn clean install
    ```
2. Run the services using Docker Compose (if Docker is set up):
    ```bash
    docker-compose up
    ```
3. Alternatively, you can run each service individually using:
    ```bash
    mvn spring-boot:run
    ```

### Accessing the Services
- **API Gateway**: `http://localhost:8080`
- **Hotel Service**: `http://localhost:8081`
- **Rating Service**: `http://localhost:8082`
- **Eureka Dashboard**: `http://localhost:8761`

## Project Structure
- **ApiGateway**: Contains the API Gateway service.
- **HotelServices**: Contains the Hotel service.
- **ratingservice**: Contains the Rating service.

## Usage
- **API Gateway**: Routes requests to the appropriate microservice.
- **Hotel Service**: Perform CRUD operations on hotel data.
- **Rating Service**: Perform CRUD operations on hotel ratings.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka
- Lombok
- MySQL

Thanks..
