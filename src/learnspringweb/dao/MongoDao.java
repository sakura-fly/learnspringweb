package learnspringweb.dao;

import learnspringweb.model.User;

public class MongoDao {
	public int insert(User u){
		int res = 1;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			res = -1;
		}
		return res;
	}
}
