package learnspringweb.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

import net.sf.json.JSONObject;

@Document
public class User {
	@NotNull
	@Size(min=2,max=12)
	private String userName;
	@NotNull
	@Size(min=6,max=12)
	private String pwd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		JSONObject json = new JSONObject();
		json.put("userName", userName);
		json.put("pwd", pwd);
		return json.toString();
	}
	
	public JSONObject toJson(){
		JSONObject json = new JSONObject();
		json.put("userName", userName);
		json.put("pwd", pwd);
		return json;
	}


}
