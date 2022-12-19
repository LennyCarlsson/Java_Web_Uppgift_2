package model;

public class LoginBean {

	public LoginBean(String name, String password) {
		this.name = name;
		this.password = password;
	}

	private String name, password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
