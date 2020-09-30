package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Category;
import com.lti.entity.Product;
import com.lti.entity.Retailer;
import com.lti.repo.CategoryRepo;
import com.lti.repo.ProductRepo;
import com.lti.repo.RetailerRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestProduct {
	
	@Autowired
	private ProductRepo repo;
	
	@Test
	public void testSave() {
		Retailer r=new Retailer();
		r.setRetailerid(50012);
		r.setMobile("45678");
		r.setEmail("xyziu");
		r.setRetailername("jaggu");
		r.setPassword("123");
		Category c= new Category();
		c.setCategoryid(6323);
		c.setCategoryname("Pants");
		
		Product product = new Product();
		product.setProductid(4003);
		product.setName("FullSleeve T-shirt");
		product.setBrand("Tommy");
		product.setPrice(1500);
		product.setQuantity(20);
		product.setImageid("Tommy ki pic");
		product.setDescription("This is a limited edition t-shirt from tommy ");
		product.setRetailer(r);
		product.setCategory(c);
		repo.save(product);
	}
	
	@Test
	public void testFetchProductById() {
		Product product =  repo.fetch(4002);
		System.out.println(product.getName()+"\t"+product.getBrand()+"\t"+product.getPrice());
		
	}
	
	@Test
	public void testUpdate() {
		Product product = repo.fetch(4002);
        product.setPrice(2000);
        repo.update(product);
	}	
	
	@Test
	public void testFetchAllProducts() {
		List result= repo.fetchAll();
		for (Object object : result) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testFetchAllBrands() {
		List result= repo.fetchAllBrands();
		for (Object object : result) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testFetchByBrands() {
		List result= repo.fetchByBrand("Tommy");
		for (Object object : result) {
			System.out.println(object);
		}
	}
	
	

}
