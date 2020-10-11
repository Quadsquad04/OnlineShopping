package com.lti.repo;

//made by  Anshika Gautum

import java.util.List;

import com.lti.entity.Wishlist;

public interface WishlistRepo {

    void save(Wishlist wishlist);
	
    Wishlist fetch(int wishlistid);
	
    Wishlist update(Wishlist wishlist);	
}
