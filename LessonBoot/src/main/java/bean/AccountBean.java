package bean;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class AccountBean {
	@NotEmpty
	private int id;
	@NotEmpty
	private String user_name;
	@NotEmpty
	private String password;
	private Date insert_date;

	public AccountBean(int id, String user_name, String password, Date insert_date) {
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.insert_date = insert_date;
	}
	public int getId() {
		return id;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getPassword() {
		return password;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
}