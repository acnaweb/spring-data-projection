package com.github.acnaweb.springdataprojection.dto;

import org.springframework.beans.factory.annotation.Value;

public interface PersonPtDto {
	Long getId();

	@Value("#{target.name}")
	String getNome();

	@Value("#{target.street + ', ' + target.zipcode + ' - ' + target.city + '/' + target.state}")
	String getEnderecoCompleto();

}
