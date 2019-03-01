package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_user")
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "user_name")
	private String user_name;

	@Column(name = "password")
	private String password;

	@Column(name = "insert_date")
	private String insert_date;

		public AccountEntity() {
	}

	public AccountEntity(int id, String user_name, String password, String insert_date) {
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

	public String getInsert_date() {
		return insert_date;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setPass(String password) {
		this.password = password;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}
}