package com.lti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Retailer;
import com.lti.repo.RetailerRepo;

@RestController
public class RetailerController {
	
	@Autowired
	private RetailerRepo repo;
	
	@PostMapping(value="/addretailer",consumes="application/json")
	public String addRetailer(@RequestBody Retailer rtlr) {
		repo.save(rtlr);
		return "Retailer added successfully";
	}
	
	@PutMapping(value = "/updateretailer", consumes = "application/json")
	public String editRetailer(@RequestBody Retailer rtlr) {
		repo.update(rtlr);
		return "Retailer updated successfully";
	}
	
	@DeleteMapping("/delretailer/{retailerid}")
	public String delRetailer(@PathVariable int retailerid) {
		repo.delete(retailerid);
		return "Retailer deleted successfully";
	}

}
