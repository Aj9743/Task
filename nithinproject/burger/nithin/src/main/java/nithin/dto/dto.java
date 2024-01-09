package nithin.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dto {
	@Id
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "dto [id=" + id + ", email=" + email + ", phno=" + phno + ", user_name=" + user_name + ", password="
				+ password + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String email;
	private long phno;
	private String user_name;
	private String password;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String country;
//	private String street;

	
	
	

}
