package Estudo_Java.My_First_Web_API.doc;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi usersApi() {
        return GroupedOpenApi.builder()
                .group("Users API")  // Nome do grupo que será exibido na documentação
                .pathsToMatch("/api/users/**")  // Inclui todos os endpoints que começam com "/users"
                .build();

    }
}
