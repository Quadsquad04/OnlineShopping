package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Retailer;
import com.lti.repo.RetailerRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestRetailer {
	
	@Autowired
	private RetailerRepo repo;
	
	@Test
	public void testSave() {
		Retailer rtlr = new Retailer();
		rtlr.setRetailerid(8005);
		rtlr.setRetailername("Anmol");
		rtlr.setPassword("12345");
		rtlr.setMobile("7888456976");
		rtlr.setEmail("anmol@gmail.com");
		repo.save(rtlr);
	}
	
	@Test
	public void testFetchUserById() {
		Retailer rtlr =  repo.fetch(8001);
		System.out.println(rtlr);
		
	}
	
	@Test
	public void testUpdate() {
		Retailer rtlr = repo.fetch(8001);
		rtlr.setRetailername("Ankit raj");
		rtlr.setPassword("12345");
		rtlr.setMobile("704293226");
		rtlr.setEmail("anamika@gmail.com");
		repo.update(rtlr);
	}
	
	@Test
	public void testDeleteRetailerById() {
		Retailer rtlr =  repo.fetch(51005);
		repo.delete(51005);
		System.out.println(rtlr);
		
	}
	
	@Test
	public void testFetchAllRetailers() {
		List result= repo.fetchAll();
		for (Object object : result) {
			System.out.println(object);
		}
	}

}
