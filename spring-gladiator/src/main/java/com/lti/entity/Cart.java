package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	private int cartid;
	
	@JoinColumn(name="userid")
	private User user;
	
	@JoinColumn(name="productid")
	private Product product;
	
	

}
