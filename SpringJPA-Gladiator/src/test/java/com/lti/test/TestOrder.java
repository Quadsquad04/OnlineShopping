package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Orders;
import com.lti.entity.User;
import com.lti.repo.OrderRepo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestOrder {

	@Autowired
	private OrderRepo repo;
	
	@Test
	public void testSave() {
		Orders ordr = new Orders();
		ordr.setOrderid(2202);
		repo.save(ordr);
	}
	
	@Test
	public void testFetchOrderById() {
		Orders ordr=  repo.fetch(2202);
		System.out.println(ordr.getOrderid());
		
	}
}
