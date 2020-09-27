package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailers")
public class Retailer {
	
	@Id
	private int retailerid;
	
	@Column(length = 20)
	private String retailername;
	@Column(length = 10)
	private String mobile;
	@Column(length = 25)
	private String email;
	@Column(length = 15)
	private String password;
	
	
	
	public int getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}
	public String getRetailername() {
		return retailername;
	}
	public void setRetailername(String retailername) {
		this.retailername = retailername;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Retailer [retailerid=" + retailerid + ", retailername=" + retailername + ", mobile=" + mobile
				+ ", email=" + email + ", password=" + password + "]";
	}
	

}
