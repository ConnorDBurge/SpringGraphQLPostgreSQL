package com.egrubc.springgraphqlpostgresql.repository;

import com.egrubc.springgraphqlpostgresql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
