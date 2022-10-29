package nvb.springframework.datarestdemo.repository;

import nvb.springframework.datarestdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Long> {
}
