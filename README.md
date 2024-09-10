# My First RestAPI with Spring Boot

This project is a simple REST API developed using Spring Boot, demonstrating the fundamental concepts of RESTful web services. The API includes essential CRUD (Create, Read, Update, Delete) operations and uses Swagger for API documentation.

## Features
- 🌐 **RESTful API**: Implements GET, POST, PUT, and DELETE HTTP methods.
- 📄 **Swagger Integration**: Automatically generated API documentation accessible through `/swagger-ui`.
- 📦 **Spring Boot Framework**: Fast and efficient configuration using Spring Boot’s built-in capabilities.
- 🛠️ **Dependency Management**: Managed with Maven for simplified builds and dependencies.

## Technologies Used
- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Swagger**
- **Maven**

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/Daniel-da-Silva-Alves/My-First-Web-API-with-Springboot.git
   ```
2. Navigate to the project directory:
   ```bash
   cd my-first-restapi-springboot
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Documentation
Access the API documentation with Swagger by visiting the following URL after starting the application:

```
http://localhost:8080/swagger-ui.html
```

## Endpoints Overview
| Method | Endpoint        | Description                |
|--------|-----------------|----------------------------|
| GET    | /api/resource    | Retrieve all resources     |
| POST   | /api/resource    | Create a new resource      |
| GET    | /api/resource/{id} | Retrieve resource by ID    |
| PUT    | /api/resource/{id} | Update resource by ID      |
| DELETE | /api/resource/{id} | Delete resource by ID      |

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

You can customize this description by adding more information or adapting it to your specific project.
