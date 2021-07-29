package com.github.acnaweb.springdataprojection.controller;

import com.github.acnaweb.springdataprojection.dto.PersonDto;
import com.github.acnaweb.springdataprojection.dto.PersonPtDto;
import com.github.acnaweb.springdataprojection.dto.PersonReduceDto;
import com.github.acnaweb.springdataprojection.dto.PersonWithVoDto;
import com.github.acnaweb.springdataprojection.repository.PersonRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {
	private final PersonRepository repository;

	@GetMapping("/persons/all")
	public ResponseEntity<List<PersonDto>> all() {
		return ResponseEntity.ok(repository.findBy(PersonDto.class));
	}

	@GetMapping("/persons/pt")
	public ResponseEntity<List<PersonPtDto>> pt() {
		return ResponseEntity.ok(repository.findBy(PersonPtDto.class));
	}

	@GetMapping("/persons/reduce")
	public ResponseEntity<List<PersonReduceDto>> reduce() {
		return ResponseEntity.ok(repository.findBy(PersonReduceDto.class));
	}

	@GetMapping("/persons/vo")
	public ResponseEntity<List<PersonWithVoDto>> vo() {
		return ResponseEntity.ok(repository.findBy(PersonWithVoDto.class));
	}
}
