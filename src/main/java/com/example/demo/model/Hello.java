package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hello {
	@Id
	@GeneratedValue
	private int cId;
	private String cName;
}
