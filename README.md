# Spring Boot - Ecommerce Project

## Project Overview

This is an e-commerce project built using Spring Boot. The project aims to provide a robust and scalable platform for managing product categories, handling user requests, and performing various e-commerce operations. The key components of the project include:

- **Controller Layer**: Handles incoming HTTP requests and maps them to the appropriate service methods.
- **Service Layer**: Contains the business logic and interacts with the repository layer to fetch and process data.
- **Repository Layer**: Manages data persistence and retrieval using Spring Data JPA.
- **DTOs (Data Transfer Objects)**: Used to transfer data between different layers of the application.

### Key Features

- **Category Management**: Retrieve, add, update, and delete product categories.
- **Pagination and Sorting**: Support for paginated and sorted retrieval of categories.
- **RESTful APIs**: Expose endpoints for various e-commerce operations.

### Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Maven**

### Getting Started

To get started with the project, clone the repository and build it using Maven:

```bash
git clone <repository-url>
cd <project-directory>
mvn clean install
```