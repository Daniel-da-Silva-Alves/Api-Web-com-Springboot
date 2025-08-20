# Minha Primeira REST API com Spring Boot

Este projeto consiste em uma API REST desenvolvida com **Spring Boot**, cujo objetivo é demonstrar a aplicação prática dos conceitos fundamentais de serviços web RESTful. A solução implementa operações essenciais de **CRUD** (Create, Read, Update, Delete) e conta com a integração do **Swagger** para documentação interativa dos endpoints.

## Funcionalidades
- 🌐 **API RESTful**: Implementação completa dos métodos HTTP GET, POST, PUT e DELETE.  
- 📄 **Swagger**: Documentação da API gerada automaticamente, disponível em `/swagger-ui`.  
- 📦 **Spring Boot**: Estruturação e configuração ágil, utilizando os recursos nativos do framework.  
- 🛠️ **Gerenciamento de Dependências**: Utilização do **Maven** para compilar, empacotar e gerenciar bibliotecas externas.  

## Tecnologias Utilizadas
- **Java 17**  
- **Spring Boot**  
- **Spring Web**  
- **Swagger (OpenAPI)**  
- **Maven**  

## Execução do Projeto
1. Clone o repositório:  
   ```bash
   git clone https://github.com/Daniel-da-Silva-Alves/My-First-Web-API-with-Springboot.git
   ```

2. Acesse o diretório do projeto:

   ```bash
   cd my-first-restapi-springboot
   ```
3. Compile o projeto com Maven:

   ```bash
   mvn clean install
   ```
4. Inicie a aplicação:

   ```bash
   mvn spring-boot:run
   ```

## Documentação da API

Após a execução da aplicação, a documentação interativa estará disponível em:

```
http://localhost:8080/swagger-ui.html
```

## Endpoints Disponíveis

| Método | Endpoint           | Descrição                   |
| ------ | ------------------ | --------------------------- |
| GET    | /api/resource      | Retorna todos os recursos   |
| POST   | /api/resource      | Cria um novo recurso        |
| GET    | /api/resource/{id} | Retorna um recurso pelo ID  |
| PUT    | /api/resource/{id} | Atualiza um recurso pelo ID |
| DELETE | /api/resource/{id} | Remove um recurso pelo ID   |

## Licença

Este projeto está licenciado sob os termos da **MIT License**. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

