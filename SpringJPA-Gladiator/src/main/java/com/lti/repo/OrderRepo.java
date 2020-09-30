package com.lti.repo;

import com.lti.entity.Orders;


public interface OrderRepo {

	 void save(Orders order);
		
	 Orders fetch(int orderid);
}
