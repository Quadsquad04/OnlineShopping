package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Orders;

@Repository
public class OrderRepoImpl implements OrderRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public void save(Orders order) {
		em.persist(order);
		
	}
	
	public Orders fetch(int orderid) {
		Orders ordr = em.find(Orders .class, orderid);
		return ordr;
	}
	
	
}
