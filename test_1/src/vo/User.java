package vo;

public class User {

	public User(String userName, String password, String charName) {
		// TODO Auto-generated constructor stub
		super();
		this.setUserName(userName);
		this.setPassword(password);
		this.setChrName(charName);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChrName() {
		return chrName;
	}
	public void setChrName(String chrName) {
		this.chrName = chrName;
	}
	private String userName;
	private String password;
	private String chrName;
	

}