package com.alpha.MotoMint.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Driver {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int licenceno;
	private String upiid;
	private String name;
	private String Status;
	private int age;
	private long mobileno;
	private String gender;
	private String mail;
	
	@OneToOne
	private Vehicle vehicle;

	@Override
	public String toString() {
		return "Driver [id=" + id + ", licenceno=" + licenceno + ", upiid=" + upiid + ", name=" + name + ", Status="
				+ Status + ", age=" + age + ", mobileno=" + mobileno + ", gender=" + gender + ", mail=" + mail
				+ ", vehicle=" + vehicle + "]";
	}

	public Driver(int id, int licenceno, String upiid, String name, String status, int age, long mobileno,
			String gender, String mail, Vehicle vehicle) {
		this.id = id;
		this.licenceno = licenceno;
		this.upiid = upiid;
		this.name = name;
		Status = status;
		this.age = age;
		this.mobileno = mobileno;
		this.gender = gender;
		this.mail = mail;
		this.vehicle = vehicle;
	}

	public Driver() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLicenceno() {
		return licenceno;
	}

	public void setLicenceno(int licenceno) {
		this.licenceno = licenceno;
	}

	public String getUpiid() {
		return upiid;
	}

	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
	

}
