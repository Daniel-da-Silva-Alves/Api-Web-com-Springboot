<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="Spring Boot Logo" width="120" />
</p>

<h1 align="center">API Web com Spring Boot</h1>

<p align="center">
  REST API desenvolvida com Spring Boot para gerenciamento de usuários,<br>
  demonstrando operações CRUD e documentação interativa com Swagger.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.3.3-6DB33F?style=flat&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Spring%20Web-MVC-6DB33F?style=flat&logo=spring&logoColor=white" alt="Spring Web" />
  <img src="https://img.shields.io/badge/Swagger-OpenAPI%203-85EA2D?style=flat&logo=swagger&logoColor=black" alt="Swagger" />
  <img src="https://img.shields.io/badge/Maven-3.9-C71A36?style=flat&logo=apachemaven&logoColor=white" alt="Maven" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="MIT License" />
</p>

---

## Overview

Uma API RESTful completa para gerenciamento de usuários, construída com **Spring Boot 3.3** e **Java 17**. O projeto implementa as operações essenciais de CRUD e conta com documentação interativa via **Swagger (OpenAPI 3)**, servindo como referência prática de boas práticas em desenvolvimento de serviços web.

> [!NOTE]
> Projeto desenvolvido como estudo e portfólio técnico, demonstrando habilidades com o ecossistema Spring e padrões REST.

## Features

- **API RESTful** — Implementação completa dos métodos HTTP (GET, POST, DELETE)
- **Swagger UI** — Documentação interativa gerada automaticamente em `/swagger-ui`
- **Arquitetura em camadas** — Controller, Model e Repository bem separados
- **Anotações OpenAPI** — Endpoints documentados com `@Operation`, `@ApiResponse` e `@Schema`
- **Spring Boot 3.3** — Configuração e inicialização simplificada com Maven Wrapper

## Project Structure

```
src/main/java/Estudo_Java/My_First_Web_API/
├── MyFirstWebApiApplication.java    Application entry point
├── controller/
│   ├── UserController.java          REST endpoints (CRUD)
│   └── WelcomeUser.java             Welcome endpoint
├── doc/
│   └── ...                          Swagger/OpenAPI config
├── model/
│   └── User.java                    User entity (id, login, password)
└── repository/
    └── ...                          In-memory data access
```

## Getting Started

### Prerequisites

- [Java 17](https://adoptium.net/) (JDK)
- [Maven 3.9+](https://maven.apache.org/) (ou use o Maven Wrapper incluso)

### Running

```bash
# Clone o repositório
git clone git@github.com:Daniel-da-Silva-Alves/Api-Web-com-Springboot.git

# Acesse o diretório
cd Api-Web-com-Springboot

# Compile o projeto
./mvnw clean install

# Inicie a aplicação
./mvnw spring-boot:run
```

> [!TIP]
> No Windows, use `mvnw.cmd` ao invés de `./mvnw`.

## API Documentation

Após iniciar a aplicação, a documentação interativa estará disponível em:

```
http://localhost:8080/swagger-ui.html
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/users` | Lista todos os usuários |
| `GET` | `/api/users/{username}` | Busca usuário por username |
| `POST` | `/api/users` | Cria um novo usuário |
| `DELETE` | `/api/users/{id}` | Remove usuário por ID |

## Author

**Daniel da Silva Alves**
