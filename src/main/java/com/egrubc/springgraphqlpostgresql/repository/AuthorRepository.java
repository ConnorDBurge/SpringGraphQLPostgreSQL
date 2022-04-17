package com.egrubc.springgraphqlpostgresql.repository;

import com.egrubc.springgraphqlpostgresql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
