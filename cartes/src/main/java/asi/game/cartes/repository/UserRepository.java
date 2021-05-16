package asi.game.cartes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import asi.game.cartes.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public Optional<User> findByLog(String name, String mdp);

}
