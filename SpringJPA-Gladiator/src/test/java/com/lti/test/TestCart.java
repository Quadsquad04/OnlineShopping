package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Cart;
import com.lti.repo.CartRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestCart {
	
	@Autowired
	private CartRepo repo;
	
	@Test
	public void testSave() {
		Cart crt = new Cart();
		crt.setCartid(6002);
		crt.setQuantity(1000);
		repo.save(crt);
	}
	
	@Test
	public void testFetchCartById() {
		Cart crt=  repo.fetch(6002);
		System.out.println(crt.getCartid()+"\t"+crt.getQuantity());
		
	}
	
	@Test
	public void testUpdate() {
		Cart crt = repo.fetch(6002);
		crt.setCartid(6002);
		crt.setQuantity(1050);
		repo.update(crt);
	}

}
