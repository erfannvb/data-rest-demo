package nvb.springframework.datarestdemo.repository;

import nvb.springframework.datarestdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    @RestResource(exported = true)
    List<User> findByFirstName(String firstName);

}
