
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



### 🛠️ Configure MySQL

1. Create the following databases:

   * `user_service_db`
   * `hotel_service_db`
   * `rating_service_db`
2. Add your DB credentials to each service’s `application.properties`.

### ▶️ Run Services

#### Individually

```bash
# Run from each service folder
mvn spring-boot:run
```

#### Or with Docker (if configured)

```bash
docker-compose up
```

---

## 🔗 Access URLs

| Service          | URL                     |
| ---------------- | ----------------------- |
| API Gateway      | `http://localhost:8080` |
| User Service     | `http://localhost:8083` |
| Hotel Service    | `http://localhost:8081` |
| Rating Service   | `http://localhost:8082` |
| Eureka Dashboard | `http://localhost:8761` |

---

## 📁 Project Structure

```
MicroservicesPractice/
├── ApiGateway/
│   └── application.yml
├── UserService/
│   └── controller/Controller.java
├── HotelServices/
│   └── Controllers/HotelController.java
├── ratingservice/
│   └── controller/rcontroller.java
└── docker-compose.yml  # optional
```

---

## 📡 API Usage

### 👤 User Service (`/users`)

| Method | Endpoint      | Description           |
| ------ | ------------- | --------------------- |
| POST   | `/users/`     | Create a new user     |
| GET    | `/users/`     | Get list of all users |
| GET    | `/users/{id}` | Get user by ID        |

🔗 Via API Gateway:
`http://localhost:8080/user/users/`

---

### 🏨 Hotel Service (`/hotels`)

| Method | Endpoint       | Description     |
| ------ | -------------- | --------------- |
| POST   | `/hotels`      | Add a new hotel |
| GET    | `/hotels`      | Get all hotels  |
| GET    | `/hotels/{id}` | Get hotel by ID |
| PUT    | `/hotels/{id}` | Update hotel    |
| DELETE | `/hotels/{id}` | Delete hotel    |

🔗 Via API Gateway:
`http://localhost:8080/hotel/hotels`

---

### ⭐ Rating Service (`/ratings`)

| Method | Endpoint                  | Description                             |
| ------ | ------------------------- | --------------------------------------- |
| POST   | `/ratings`                | Add a new rating                        |
| GET    | `/ratings/`               | Get all ratings                         |
| GET    | `/ratings/users/{userid}` | Get ratings by user ID                  |
| GET    | `/ratings/hotels/{hid}`   | Get ratings by hotel ID *(⚠️ see note)* |

⚠️ **Note**: `getbyhotelid()` is currently calling `findbyuserid(hid)` — this may be a bug unless intended.

🔗 Via API Gateway:
`http://localhost:8080/rating/ratings`

---

## ✅ To Do

* [ ] Add Swagger API documentation
* [ ] Fix `getbyhotelid()` method logic
* [ ] Add authentication with Keycloak or JWT
* [ ] Dockerize each service

---

## 🙌 Contributing

Contributions welcome! Fork the repo and submit a PR.

---

## 🙏 Acknowledgements

* Spring Boot
* Spring Cloud
* Eureka
* Spring Cloud Gateway
* Lombok
* MySQL

