# Basic CRUD Application with Spring Boot

## Overview

This repository contains a basic CRUD (Create, Read, Update, Delete) application built using Spring Boot. This application demonstrates how to perform fundamental database operations with various Spring Boot dependencies.

## Features

- **Create**: Add new records to the database.
- **Read**: Retrieve and display records from the database.
- **Update**: Modify existing records in the database.
- **Delete**: Remove records from the database.

## Technologies Used

- **Spring Boot**: Framework for building Java-based applications.
- **Spring Data JPA**: Provides JPA-based data access layer.
- **H2 Database**: In-memory database for development and testing.
- **Thymeleaf**: Server-side Java template engine for rendering HTML pages.
- **Maven**: Dependency management and build tool.

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven 3.6 or later

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/vermagagan/CRUD.git
   ```

2. **Navigate to the Project Directory**

   ```bash
   cd CRUD
   ```

3. **Build the Project**

   ```bash
   mvn clean install
   ```

4. **Run the Application**

   ```bash
   mvn spring-boot:run
   ```

   By default, the application will be available at `http://localhost:8080`.

## Usage

Once the application is running, you can access the following endpoints:

- **Create**: Use the form at `http://localhost:8080/create` to add new records.
- **Read**: View records at `http://localhost:8080/records`.
- **Update**: Edit records at `http://localhost:8080/edit/{id}`.
- **Delete**: Remove records at `http://localhost:8080/delete/{id}`.

## Dependencies

The following dependencies are used in this project:

- **Spring Boot Starter Web**: Provides support for web applications.
- **Spring Boot Starter Data JPA**: Adds support for Spring Data JPA.
- **Spring Boot Starter Thymeleaf**: Integrates Thymeleaf template engine.
- **H2 Database**: In-memory database for development and testing.

## Contributing

Feel free to contribute to this project by submitting issues, feature requests, or pull requests.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, you can reach out to vermagagan1512@gmail.com.
```
