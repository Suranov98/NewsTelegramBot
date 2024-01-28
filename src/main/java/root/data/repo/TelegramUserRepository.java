package root.data.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import root.data.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}