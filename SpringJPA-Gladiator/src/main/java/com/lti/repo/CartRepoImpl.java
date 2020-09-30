package com.lti.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Cart;


@Repository
public class CartRepoImpl implements CartRepo{
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public void save(Cart cart) {
		em.persist(cart);

	}
	

	public Cart fetch(int cartid) {
		Cart crt = em.find(Cart.class, cartid);
		return crt;
	}


	@Transactional(value=TxType.REQUIRED)
	public Cart update(Cart cart) {
		em.merge(cart);
		return null;
	}

}
