package com.spring.guru.spring5webapp.repositories;

import com.spring.guru.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
