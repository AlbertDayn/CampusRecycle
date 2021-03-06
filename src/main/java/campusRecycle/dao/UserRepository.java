package campusRecycle.dao;

import campusRecycle.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.*;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);
	Optional<User> findByUsernameAndDeleted(String username, boolean deleted);
	List<User> findAllByDeleted(boolean deleted);
} 