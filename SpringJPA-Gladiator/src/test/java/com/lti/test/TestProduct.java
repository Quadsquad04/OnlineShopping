package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.lti.entity.Product;
import com.lti.repo.ProductRepo;
import com.lti.repo.RetailerRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestProduct {
	
	@Autowired
	private ProductRepo repo;
	private RetailerRepo repo1;
	
	@Test
	public void testSave() {
//		Retailer r=new Retailer();
//		r.setRetailerid(50012);
//		r.setMobile("45678");
//		r.setEmail("xyziu");
//		r.setRetailername("jaggu");
//		r.setPassword("123");
//		Category c= new Category();
//		c.setCategoryid(6325);
//		c.setCategoryname("Sweaters");
		
		Product product = new Product();
		product.setProductid(4015);
		product.setName("FullSleeve Swaeater");
		product.setBrand("Tommy");
		product.setPrice(1500);
		product.setQuantity(20);
		product.setImageid("Tommy ki pic");
		product.setDescription("This is a limited edition t-shirt from tommy ");
//    	product.setRetailer(r);
//		product.setCategory(c);
		repo.save(product, 50012 , 6323);
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
		List<Product> result= repo.fetchAll();
		for (Product p : result) {
			System.out.println(p.getName()+"\t"+p.getBrand()+"\t");
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
		List<Product> result= repo.fetchByBrand("Tommy");
		for (Product p : result) {
			System.out.println(p.getName()+"\t"+p.getPrice());
		}
	}
	
	

}
