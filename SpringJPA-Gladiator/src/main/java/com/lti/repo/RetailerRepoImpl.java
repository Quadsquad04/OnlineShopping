package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Retailer;
import com.lti.entity.User;


@Repository
public class RetailerRepoImpl implements RetailerRepo{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public void save(Retailer retailer) {
		em.persist(retailer);
		
	}

	public Retailer fetch(int retailerid) {
		Retailer rtlr = em.find(Retailer.class, retailerid);
		return rtlr;
	}

	
	@Transactional(value=TxType.REQUIRED)
	public void delete(int retailerid) {
		em.remove(em.find(Retailer.class, retailerid));
	}

	
	@Transactional(value=TxType.REQUIRED)
	public void update(Retailer rtlr) {
		em.merge(rtlr);
		
	}

	public List<Retailer> fetchAll() {
	return em.createQuery("from Retailer").getResultList();
		
	}

}
