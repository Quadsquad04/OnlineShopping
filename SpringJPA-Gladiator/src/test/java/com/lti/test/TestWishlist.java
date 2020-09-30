package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Wishlist;
import com.lti.repo.CartRepo;
import com.lti.repo.WishlistRepo;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestWishlist {
	
	@Autowired
	private WishlistRepo repo;
	
	@Test
	public void testSave() {
		Wishlist wslst = new Wishlist();
		wslst.setWishlistid(7001);
		wslst.setQuantity(10);
		repo.save(wslst);
	}
	
	@Test
	public void testFetchWishlistById() {
		Wishlist wslst=  repo.fetch(7001);
		System.out.println(wslst.getWishlistid()+"\t"+wslst.getQuantity());
		
	}
	
	@Test
	public void testUpdate() {
		Wishlist wslst = repo.fetch(7001);
		wslst.setWishlistid(7001);
	    wslst.setQuantity(12);
		repo.update(wslst);
	}

}
