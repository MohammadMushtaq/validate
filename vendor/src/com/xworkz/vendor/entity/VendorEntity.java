package com.xworkz.vendor.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name="vendor_details")

public class VendorEntity {
	@Id
	@Column (name="v_id")
	private int id;
	@Column (name="v_name")
	private String name;
	@Column (name="v_email")
	private String email;
	@Column (name="v_loginname")
	private String loginName;
	@Column (name="v_password")
	private String password;
	@Column (name="v_address")
	private String address;
	@Column (name="v_gstno")
	private String gstNo;
	@Column (name="v_createdby")
	private String createdBy;
	@Column (name="v_createdat")
	private LocalDateTime createdAt;
	@Column (name="v_updateby")
	private String updatedby;
	@Column (name="v_updatedat")
	private LocalDateTime updatedAt;
	
	public VendorEntity(String name, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}
	
}
