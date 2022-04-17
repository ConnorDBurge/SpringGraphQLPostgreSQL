package com.egrubc.springgraphqlpostgresql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age")
    private Integer age;

    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
