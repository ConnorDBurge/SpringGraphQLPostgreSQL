package com.egrubc.springgraphqlpostgresql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.egrubc.springgraphqlpostgresql.model.Author;
import com.egrubc.springgraphqlpostgresql.model.Tutorial;
import com.egrubc.springgraphqlpostgresql.repository.AuthorRepository;
import com.egrubc.springgraphqlpostgresql.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private AuthorRepository authorRepository;
    private TutorialRepository tutorialRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public long countTutorials() {
        return tutorialRepository.count();
    }
}
