package com.lti.repo;

import java.util.List;

import com.lti.entity.Retailer;

public interface RetailerRepo {

    void save(Retailer retailer);
	
	Retailer fetch(int retailerid);
	
	List<Retailer> fetchAll();
	
	void delete(int retailerid);
	
	void update(Retailer rtlr);

	List find(Class<Retailer> class1, int i);
	
	
}
