package com.lti.repo;
import java.util.List;

import com.lti.entity.Cart;

public interface CartRepo {

    void save(Cart cart);
	
	Cart fetch(int cartid);
	
	Cart update(Cart cart);	
}
