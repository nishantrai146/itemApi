# Item Management REST API

## Overview

This project is a simple Java Spring Boot backend application that provides a RESTful API
for managing a collection of items. The application is similar to a basic e-commerce
product service where items can be created and retrieved.

The application uses in-memory storage (`ArrayList`) and does not use any database.
It exposes two REST endpoints:
- Create a new item
- Retrieve an item by its ID

---

## Tech Stack

- Java 17
- Spring Boot
- Maven

---

## Prerequisites

Before running the application, ensure that the following are installed on your system:

- Java 17 or higher
- Maven

---

## Application Design

The application follows a layered architecture:

- **Controller Layer**  
  Handles HTTP requests and responses and performs input validation.

- **Service Layer**  
  Contains business logic and manages items using an in-memory data store.

- **Model Layer**  
  Defines the structure of the Item entity.

Items are stored using an `ArrayList`. Since the data is stored in memory, all data is lost
when the application restarts.

---

## How to Run the Application

1. Navigate to the project directory:
   ```bash
   cd itemapi
2. Run the application:
   ```bash
    mvn spring-boot:run
The application will start on the default port:
   ```arduino
     http://localhost:8080
   ```
## API Documentation

### Add Item

**Endpoint**

### POST /api/items

Description

Creates a new item and stores it in memory.

The item ID is generated automatically by the backend.

Request Body Example
```json
{
"name": "MacBook",
"description": "Apple laptop",
"price": 62000,
"category": "Electronics"
}
```

### Validation Rules

- name must not be null or empty

- price must be greater than 0

- category must not be null or empty

Success Response
```json
{
"id": 1,
"name": "MacBook Air",
"description": "Apple laptop",
"price": 99999.0,
"category": "Electronics"
}
```
### Get Item by ID

Endpoint

### GET /api/items/{id}

Description

Retrieves a single item using its unique ID.

Example Request

### GET /api/items/1

Success Response
```json
{
"id": 1,
"name": "MacBook Air",
"description": "Apple laptop",
"price": 99999.0,
"category": "Electronics"
}
```
### Error Response

Item not found


## Important Notes
- Uses in-memory storage only

- No database or persistence layer is implemented

- Data is lost when the application restarts

- Item IDs are auto-generated in the service layer

- Input validation is handled manually in the controller
