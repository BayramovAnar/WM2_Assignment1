package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author createAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author){
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }

    public List<Author> getAuthorsByBook(Long bookId){
        return authorRepository.findByBooksId(bookId);
    }
}
