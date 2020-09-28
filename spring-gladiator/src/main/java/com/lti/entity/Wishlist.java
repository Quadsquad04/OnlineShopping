package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	private int wishlistid;
	
	@JoinColumn(name="userid")
	private User user;
	
	@JoinColumn(name="productid")
	private Product product;


}
