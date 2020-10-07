package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.User;
import com.lti.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestUser {
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void testSave() {
		User usr = new User();
		usr.setUserid(5005);
		usr.setUsername("Arjana");
		usr.setPassword("12345");
		usr.setMobile("7042932246");
		usr.setEmail("anamika@gmail.com");
		repo.save(usr);
	}
	
	@Test
	public void testFetchUserById() {
		User usr=  repo.fetch(5001);
		System.out.println(usr);
		
	}
	
	@Test
	public void testUpdate() {
		User usr = repo.fetch(5001);
		usr.setUsername("Anamika");
		usr.setPassword("123456789");
		usr.setMobile("7042932246");
		usr.setEmail("anamika@gmail.com");
		repo.update(usr);
	}

}
