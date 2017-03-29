package learnspringweb.model;

import com.sun.istack.internal.NotNull;

public class User {
	@NotNull
	private String userName;
	@NotNull
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
		// TODO Auto-generated method stub
		return "userName=" + userName + ",pwd=" + pwd;
	}


}
