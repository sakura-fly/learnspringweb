package learnspringweb.datacof;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import util.MongodbInfo;

@Configuration
@EnableMongoRepositories("learnspringweb")                                     
public class MongoCof extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return MongodbInfo.NAME;
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(MongodbInfo.HOST);
	}


	
}
