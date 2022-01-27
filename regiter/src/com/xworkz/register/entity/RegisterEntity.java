package com.xworkz.register.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table (name= "register_details")
public class RegisterEntity {
@Id
@Column (name= "r_id")
	private int id;
@Column (name= "r_username")
	private String userName;
@Column (name= "r_email")
	private String email;
@Column (name= "r_password")
	private String password;
@Column (name= "r_city")
	private String city;
@Column (name= "r_country")
	private String country;
@Column (name= "r_mobileno")
	private long mobileNo;
@Column (name= "r_indiancitizen")
	private boolean indianCitizen;
	
	public RegisterEntity(String userName, String email, String password, String city, String country, long mobileNo,
			boolean indianCitizen) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileNo = mobileNo;
		this.indianCitizen = indianCitizen;
	}
	
	
}
