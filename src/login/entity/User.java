package login.entity;

/**
 * Title: User.java
 * @date 2018年10月5日 下午3:19:40
 * @author Mr.yang
 * 用户的实体类设计  
 */
public class User {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String sex;
	
	private String email;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
