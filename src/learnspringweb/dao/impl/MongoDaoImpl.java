//package learnspringweb.dao.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//
//import learnspringweb.dao.MongoDao;
//import learnspringweb.model.User;
//
//public class MongoDaoImpl implements MongoDao{
//
//	
//	@Autowired
//	MongoOperations mongo;
//	
//	@Override
//	public int insert(User u) {
//		int res = 1;
//		try {
//			mongo.insert(u);
//		} catch (Exception e) {
//			e.printStackTrace();
//			res = -1;
//		}
//		return res;
//	}
//
//}
