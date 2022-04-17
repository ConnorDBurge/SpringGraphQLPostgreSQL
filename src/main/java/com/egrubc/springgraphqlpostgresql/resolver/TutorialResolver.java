package com.egrubc.springgraphqlpostgresql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.egrubc.springgraphqlpostgresql.model.Author;
import com.egrubc.springgraphqlpostgresql.model.Tutorial;
import com.egrubc.springgraphqlpostgresql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {

    @Autowired
    private AuthorRepository authorRepository;

    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}
