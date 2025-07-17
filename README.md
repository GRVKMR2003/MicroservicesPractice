
# Microservices Practice (Learning)

## Overview
This project is a practice implementation of microservices architecture using Spring Boot. It includes multiple services such as API Gateway, User Service, Hotel Service, and Rating Service. Each service is designed to demonstrate various aspects of microservices including service discovery, load balancing, and inter-service communication.

## Features
- **API Gateway**: Single entry point for all client requests.
- **User Service**: Manages users and integrates hotel & rating info.
- **Hotel Service**: CRUD operations for hotel data.
- **Rating Service**: CRUD operations for hotel ratings.
- **Service Discovery**: Eureka-based registration and discovery.
- **Database Integration**: Uses MySQL for persistence.
- **Reactive Programming**: WebFlux for non-blocking streams (in Gateway).

## Technologies Used

### Backend
- **Spring Boot**
- **Spring Cloud**
- **Spring Cloud Gateway**
- **Eureka Server**
- **Spring Data JPA**
- **Lombok**
- **MySQL**

---

## 🚀 Top Spring Cloud Features

1. 🔍 **Service Discovery (Eureka)**  
   Dynamic discovery of services for seamless inter-service communication.

2. 🌐 **API Gateway (Spring Cloud Gateway)**  
   Central routing hub. Supports routing, filters, rate limiting, and CORS.

3. 🛡️ **Circuit Breaker (Resilience4j)**  
   Prevents service failure propagation using fallback strategies.

---

## Prerequisites
- Java 21
- Maven
- Docker (optional)
- MySQL

---

## Getting Started

### 📦 Clone Repository
```bash
git clone https://github.com/GRVKMR2003/MicroservicesPractice.git
cd MicroservicesPractice
````
