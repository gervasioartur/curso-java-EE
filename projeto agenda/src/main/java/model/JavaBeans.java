package model;

public class JavaBeans {
	private String idCon;
	private String name;
	private String phone;
	private String email;
		
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavaBeans(String idCon, String name, String phone, String email) {
		super();
		this.idCon = idCon;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getIdCon() {
		return idCon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}