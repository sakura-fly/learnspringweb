package learnspringweb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import learnspringweb.dao.UserOperations;
import learnspringweb.model.User;

public class UserRepositoryImpl implements UserOperations{

	
	@Autowired
	private MongoOperations mongo;

	@Override
	public List<User> findByUserName(User u) {
		return mongo.find(Query.query(Criteria.where("userName").is(u.getUserName()).and("pwd").is(u.getPwd())), User.class);
	}
	

}
