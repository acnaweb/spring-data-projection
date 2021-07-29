package com.github.acnaweb.springdataprojection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "persons")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	Long id;
	String name;
	String street;
	String zipcode;
	String city;
	String state;
}
