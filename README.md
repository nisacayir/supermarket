# Market Management System 🛒

A comprehensive microservices-based supermarket management system developed with Spring Boot, implementing CRUD operations for users, products, categories, and orders.

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0.0-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Maven](https://img.shields.io/badge/Maven-3.8.0-red)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6.0-green)

## Table of Contents
- [Features](#features)
- [Architecture](#architecture)
- [Tech Stack](#tech-stack)
- [Microservices](#microservices)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Future Updates](#future-updates)
- [Contributors](#contributors)

## Features
- User authentication and authorization with role-based access control
- Product and category management
- Order processing with status tracking
- Secure password handling with BCrypt
- RESTful API endpoints for all operations
- MySQL database integration

## Architecture
The system is built on a microservices architecture with three main services:
- User Service: Handles user management and authentication
- Order Service: Manages order processing and tracking
- Category & Product Service: Handles product and category management

Each microservice operates independently with its own database while communicating through RESTful APIs.

## Tech Stack
- **Backend Framework:** Spring Boot
- **Database:** MySQL
- **Security:** Spring Security, BCrypt Password Encoding
- **Development Tools:**
  - Version Control: Git, GitHub
  - Database Tools: DBeaver, DataGrip
  - API Testing: Postman, H2 Database
  - Build Tool: Maven

## Microservices

### User Microservice
**Key Features:**
- User CRUD operations
- Secure user registration
- Role-based authentication
- Password encryption

### Order Microservice
**Endpoints:**
- `POST /api/order-management`: Create new order
- `PUT /api/order-management/{id}`: Update existing order
- `PUT /api/order-management/{id}/status`: Update order status
- `DELETE /api/order-management/{id}`: Delete order
- `GET /api/order-management`: Retrieve all orders

**Order Statuses:**
- Pending
- Completed
- Cancelled

### Category & Product Microservice
**Category Endpoints:**
- `GET /api/categories/{id}`: Get specific category
- `GET /api/categories`: Get all categories
- `POST /api/categories/create`: Create category
- `PUT /api/categories/update/{id}`: Update category
- `DELETE /api/categories/delete/{id}`: Delete category

**Product Endpoints:**
- `GET /api/products/{id}`: Get specific product
- `GET /api/products`: Get all products
- `POST /api/products/create?categoryId={id}`: Create product
- `PUT /api/products/update/{id}`: Update product
- `DELETE /api/products/delete/{id}`: Delete product

## Getting Started
(Installation and setup instructions to be added)

## API Documentation
Detailed API documentation for each microservice is available through Swagger/OpenAPI.

## Future Updates
- Email/SMS notifications for order updates
- Multi-language support
- OAuth2 implementation
- Frontend development with React/Angular
- Enhanced analytics and reporting

## Contributors
- Nisa Çayır - User Microservice & Login Parts
- Sinan Demir - Order Microservice
- Batuhan Ekinci - Category & Product Microservice

## Project Advisor
- Engin Kandıran, Yeditepe University 

## Known Issues
- Date handling with LocalDate vs LocalDateTime
- Lazy initialization exceptions in entity relationships
- Initial Postman testing configuration issues

## References
- Spring Boot Documentation
- GeeksforGeeks: Spring Boot Overview
