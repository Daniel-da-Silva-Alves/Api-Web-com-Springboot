package Estudo_Java.My_First_Web_API.repository;

import Estudo_Java.My_First_Web_API.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //notação que define para o spring que essa classe vai ser um componente com a existência de instância gerenciada pelo Spring.
public class UserRepository {
    public void save(User user){
        if(user.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório ");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório ");
        System.out.println(user);
    }
    public void deleteByID(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para deletar o usario", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("daniel", "password"));
        users.add(new User("blenda", "passworddablenda"));
        return users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para buscar e exibir um usuário", id));
        return new User("daniel", "password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para buscar e exibir", username));
        return new User("daniel", "password");
    }
}