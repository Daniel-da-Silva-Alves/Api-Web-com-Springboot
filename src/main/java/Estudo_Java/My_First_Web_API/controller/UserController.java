package Estudo_Java.My_First_Web_API.controller;

import Estudo_Java.My_First_Web_API.model.User;
import Estudo_Java.My_First_Web_API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users", produces = {"application/json"})
@Tag(name = "Users-api", description = "APIs related to user management")
public class UserController {
    @Autowired
    private UserRepository repository;

    @Operation(summary = "Search all users", method = "GET")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Search completed successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid request data"),
            @ApiResponse(responseCode = "400", description = "Invalid parameters"),
            @ApiResponse(responseCode = "500", description = "Error when searching for data"),
    })
    @GetMapping(" ") //listar todos os usuários
    public List<User> getUsers(){
        return repository.findAll();
    }

    @Operation(summary = "User search by username", method = "GET")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Search completed successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid request data"),
            @ApiResponse(responseCode = "400", description = "Invalid parameters"),
            @ApiResponse(responseCode = "500", description = "Error when searching for data"),
    })
    @GetMapping("/{username}") //listar o usuário por username
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @Operation(summary = "Deleting user by id", method = "DELETE")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful deletion"),
            @ApiResponse(responseCode = "422", description = "Invalid request data"),
            @ApiResponse(responseCode = "400", description = "Invalid parameters"),
            @ApiResponse(responseCode = "500", description = "Error performing deletion"),
    })
    @DeleteMapping("/{id}") //Deletar usuário por id
    public void delete(@PathVariable("id") Integer id){
        repository.deleteByID(id);
    }

    @Operation(summary = "Upload a user", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User upload completed successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid request data"),
            @ApiResponse(responseCode = "400", description = "Invalid parameters"),
            @ApiResponse(responseCode = "500", description = "Error when uploading user"),
    })
    @PostMapping ()
    public void  postUser(@RequestBody User user){
        repository.save(user);
    }
}
