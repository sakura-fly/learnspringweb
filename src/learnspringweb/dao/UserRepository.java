package learnspringweb.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import learnspringweb.model.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{
	public int add(User u);
}
