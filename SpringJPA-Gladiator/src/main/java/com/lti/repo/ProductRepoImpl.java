package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Product;
import com.lti.entity.Retailer;

@Repository
public class ProductRepoImpl implements ProductRepo{

	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public void save(Product product) {
		em.persist(product);
		
	}

	public Product fetch(int productid) {
		Product product = em.find(Product.class, productid);
		return product;
	}

	public List<Product> fetchAll() {
		return em.createQuery("from Product").getResultList();
	}
	
	public List<Retailer> fetchByID() {
		return em.createQuery("from Retailer").getResultList();
	}

	@Transactional(value=TxType.REQUIRED)
	public void delete(int productid) {
		em.remove(em.find(Product.class, productid));
		
	}

	@Transactional(value=TxType.REQUIRED)
	public void update(Product product) {
			em.merge(product);
	}

	public List<Product> fetchAllBrands() {
		return em.createQuery("Select distinct(p.brand) from Product p").getResultList();
	}
	
	public List<Product> fetchByBrand(String brnd) {
		return em.createQuery("Select p from Product p where UPPER(p.brand) LIKE UPPER(:pb)")
				.setParameter("pb", "%"+brnd+"%")
				.getResultList();
	}

	
	

	

}
