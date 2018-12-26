package com.spring.guru.spring5webapp.repositories;

import com.spring.guru.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {



}


