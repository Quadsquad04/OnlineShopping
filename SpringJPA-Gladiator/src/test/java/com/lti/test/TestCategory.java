package com.lti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Category;
import com.lti.entity.Retailer;
import com.lti.repo.CategoryRepo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestCategory {

	@Autowired
	private CategoryRepo repo;
	
	@Test
	public void testSave() {
		Category ctgry = new Category();
		ctgry.setCategoryid(60065);
		ctgry.setCategoryname("Shoes");
		repo.save(ctgry);
	}
	
	@Test
	public void testFetchCategoryById() {
		Category ctgry =  repo.fetch(60065);
		System.out.println(ctgry.getCategoryid()+"\t"+ctgry.getCategoryname());
		
	}
}
