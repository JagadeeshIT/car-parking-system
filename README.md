# Car Parking System – Microservices Project

This is a full-stack **Spring Boot Microservices-based Car Parking System** designed for real-time development practice. It uses service discovery, API gateway, and centralized configuration to manage users and parking slots in a distributed architecture.

---

##  Modules in This Application

| Module Name                | Description                                         |
|----------------------------|-----------------------------------------------------|
| `eureka-server`            | Service registry for microservice discovery         |
| `config-server`            | Centralized externalized configuration              |
| `config-repo`              | Repository for `.yml` files of all services         |
| `api-gateway`              | Entry point that routes requests to other services  |
| `user-management-service`  | Handles user registration, retrieval, update, delete |
| `parking-management-service` | Manages parking slots, booking, releasing, history |

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Eureka
- Spring Cloud Config
- Spring Cloud Gateway
- Spring Data JPA
- MySQL
- Postman 

---

## Key Features

-  Register, update, and delete users
-  View and book available parking slots (in - progress)
-  Release booked slots (in - progress)
-  View booking history by user (in - progress)
-  Microservice architecture with centralized config
-  Service discovery and dynamic routing

---

## How to Run the Application

1. Start `eureka-server`
2. Start `config-server` (which reads from local `config-repo`)
3. Start `api-gateway`
4. Start `user-management-service`
5. Start `parking-management-service`

Visit Eureka: [http://localhost:8761](http://localhost:8761)  
Test APIs via Postman using: [http://localhost:8080](http://localhost:8080)

---

## Sample API Endpoints

### User APIs
- `POST /api/users/register` → Register a new user
- `GET /api/users` → Get all users
- `GET /api/users/{id}` → Get user by ID
- `PUT /api/users/{id}` → Update user
- `DELETE /api/users/{id}` → Delete user

### Parking APIs (in - progress)
- `GET /api/parking/available` → View available slots
- `POST /api/parking/book/{slotId}/{userId}` → Book a slot
- `POST /api/parking/release/{slotId}` → Release a slot
- `GET /api/parking/history/{userId}` → Booking history for user

---

##  Author

**Jagadeesh Namagiri**  
-  Mailto:jagadeeshnamagiri46@gmail.com)  

---

## License

This project is for educational purposes only. Feel free to use and customize it.

