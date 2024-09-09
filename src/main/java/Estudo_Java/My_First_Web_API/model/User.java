package Estudo_Java.My_First_Web_API.model;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Model that represents a user in the system")
public class User {

    @Schema(description = "User ID", example = "1")
    private Integer id;

    @Schema(description = "User Login", example = "1")
    private String login;

    @Schema(description = "User Password", example = "1")
    private String password;


    public User(String login, String password ){
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    //Aqui eu fui em Generate - > Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
