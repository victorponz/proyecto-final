package caminas.controller;

import caminas.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public boolean checkUserExists(String name, String password){
        return (this.userRepository.existsUserByNameAndPassword(name, password));
    }
}
