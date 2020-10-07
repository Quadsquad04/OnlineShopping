package com.lti.repo;

import java.util.List;

import com.lti.entity.Product;

public interface ProductRepo {
	
	
    void save(Product product, int retailerid,int categoryid);
	
	Product fetch(int productid);
	
	List<Product> fetchAll();
	
	void delete(int productid);
	
	void update(Product product);
	
	List<Product>fetchAllBrands();
	
	List<Product>fetchByBrand(String brnd);

}
