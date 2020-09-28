package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")

public class Category {
	
	@Id
	private int categoryid;
	@Column(length = 20)
	private String name;
	
}	
