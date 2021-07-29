package com.github.acnaweb.springdataprojection.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Address {
	final String street;
	final String zipcode;
	final String city;
	final String state;
}
