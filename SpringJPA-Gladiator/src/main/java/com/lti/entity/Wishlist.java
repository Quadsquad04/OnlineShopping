package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	private int wishlistid;
	private int quantity;
	@Column(length = 10)
	
	public int getWishlistid() {
		return wishlistid;
	}

	public void setWishlistid(int wishlistid) {
		this.wishlistid = wishlistid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
