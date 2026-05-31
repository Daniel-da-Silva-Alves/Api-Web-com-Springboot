package Estudo_Java.My_First_Web_API.repository;

import Estudo_Java.My_First_Web_API.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //notação que define para o spring que essa classe vai ser um componente com a existência de instância gerenciada pelo Spring.
public class UserRepository {
    private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public void save(User user){
        if(user.getId()==null)
            logger.info("SAVE - Recebendo o usuário na camada de repositório");
        else
            logger.info("UPDATE - Recebendo o usuário na camada de repositório");
        logger.debug("Dados do usuário: {}", user);
    }
    public void deleteByID(Integer id){
        logger.info("DELETE/id - Recebendo o id: {} para deletar o usuário", id);
    }
    public List<User> findAll(){
        logger.info("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("daniel", "****"));
        users.add(new User("blenda", "****"));
        return users;
    }
    public User findById(Integer id){
        logger.info("FIND/id - Recebendo o id: {} para buscar e exibir um usuário", id);
        return new User("daniel", "****");
    }
    public User findByUsername(String username){
        logger.info("FIND/username - Recebendo o username: {} para buscar e exibir", username);
        return new User("daniel", "****");
    }
}