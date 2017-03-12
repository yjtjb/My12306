package bean;

public class userinfo {
	private int id;
	private String username;
	private String password;
	private String name;
	private String sex;
	private String cretid;
	private String phone;
	private String last_time;
	private String state;
	
	
	public userinfo(int id, String username, String password, String name,
			String sex, String cretid, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.cretid = cretid;
		this.phone = phone;
	}
	public userinfo(int id, String username, String password, String name,
			String sex, String cretid, String phone, String lastTime,
			String state) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.cretid = cretid;
		this.phone = phone;
		last_time = lastTime;
		this.state = state;
	}
	public userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCretid() {
		return cretid;
	}
	public void setCretid(String cretid) {
		this.cretid = cretid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLast_time() {
		return last_time;
	}
	public void setLast_time(String lastTime) {
		last_time = lastTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
