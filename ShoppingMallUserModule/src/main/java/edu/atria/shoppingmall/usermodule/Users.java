package edu.atria.shoppingmall.usermodule;
import jakarta.persistence.Entity;
@Entity
public class Users {
	@jakarta.persistence.Id
	private long Id;
	private String Username;
	private String Email;
	private String Password;
	public Users(){
		
		
	}
	public Users(long id, String username, String email, String password) {
		super();
		this.Id = id;
		this.Username = username;
		this.Email = email;
		this.Password = password;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", Username=" + Username + ", Email=" + Email + ", Password=" + Password + "]";
	}

}
