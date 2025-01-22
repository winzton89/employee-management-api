# Employee Management API

## Overview

This project is a Spring Boot-based API designed for managing employee data. The main purpose of the API is to enable HR administrators to add and manage employee records. The information stored includes Employee Number, Title, First Name, Surname, Date of Birth, Gender, Email Address, and Home Address. The Employee Number is automatically generated and needs to be unique, and the email must also be unique for each employee.

## Technologies Used

The project is built using Spring Boot, leveraging Spring Data JPA for database interaction. The data is stored in an in-memory H2 database, suitable for development and testing environments. The project also includes JUnit 5 for testing and uses Maven for dependency management.

## Setup and Running the Project

To get the project up and running, clone the repository and navigate to the project directory. Run the following command to install dependencies and build the project:

```
mvn clean install
```

After building the project, run it using:

```
mvn spring-boot:run
```

Once the application is running, you can use tools like Postman or curl to interact with the API. For instance, to add a new employee, you can send a POST request to `http://localhost:8080/employees` with the employee data in the body.

## Approach and Key Decisions

The employee model includes essential fields such as Employee Number, Name, Date of Birth, Email, and Address. The Employee Number is generated automatically and is unique for each record. The email address is also checked to ensure it is unique across all employee records.

The service layer contains the logic for handling operations related to employees, such as adding, updating, and retrieving employee data. The controller layer exposes the endpoints that allow interaction with the data.

For persistence, H2 Database is used as a simple in-memory solution, which can be easily replaced with a more robust database like MySQL or PostgreSQL for production.

## Next Steps

If there was more time, the next steps would include adding authentication and authorization to secure the endpoints, improving error handling, migrating to a production-ready database, and integrating the API with a frontend application. Additionally, it would be beneficial to implement Swagger or a similar API documentation tool to provide a clear and interactive API documentation.
