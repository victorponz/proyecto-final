package caminas.repository;

import caminas.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends CrudRepository<User, Long> { ;
    boolean existsUserByNameAndPassword(String name, String password);


}

