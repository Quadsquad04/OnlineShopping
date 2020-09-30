package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;

@Repository
public class UserRepoImpl implements UserRepo{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public void save(User user) {
		em.persist(user);

	}
	

	public User fetch(int userid) {
		User usr = em.find(User.class, userid);
		return usr;
	}


	@Transactional(value=TxType.REQUIRED)
	public User update(User user) {
		em.merge(user);
		return null;
	}

}
