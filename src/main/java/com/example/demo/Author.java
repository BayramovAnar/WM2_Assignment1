package com.example.demo;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Author name is required")
    private String name;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    public Author() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
