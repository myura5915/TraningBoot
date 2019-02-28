package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "user_name")
	private String user_name;

	@Column(name = "pass")
	private String pass;

	@Column(name = "insert_date")
	private Date insert_date;

	public AccountEntity() {
	}

	public AccountEntity(int id, String user_name, String pass, Date insert_date) {
		this.id = id;
		this.user_name = user_name;
		this.pass = pass;
		this.insert_date = insert_date;
	}

	public int getId() {
		return id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getPass() {
		return pass;
	}

	public Date getInsert_date() {
		return insert_date;
	}
}