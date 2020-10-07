package com.lti.repo;

import java.util.List;

import javax.persistence.criteria.Order;

import com.lti.entity.Orders;


public interface OrderRepo {

	 void save(Orders order,int userid,int retailerid,int productid);
		
	 Orders fetch(int orderid);

}
