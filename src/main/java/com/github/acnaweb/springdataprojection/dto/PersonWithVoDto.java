package com.github.acnaweb.springdataprojection.dto;

import com.github.acnaweb.springdataprojection.vo.Address;
import org.springframework.beans.factory.annotation.Value;

public interface PersonWithVoDto {
	Long getId();

	String getName();

	@Value("#{@addressMapper.map(target)}")
	Address getAddress();
}
