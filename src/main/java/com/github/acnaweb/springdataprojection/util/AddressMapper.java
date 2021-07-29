package com.github.acnaweb.springdataprojection.util;

import com.github.acnaweb.springdataprojection.model.Person;
import com.github.acnaweb.springdataprojection.vo.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
	public Address map(Person person) {
		return new Address(person.getStreet(), person.getZipcode(), person.getCity(), person.getState());
	}

}
