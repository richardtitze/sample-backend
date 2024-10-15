package com.rt;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
@Transactional
public class BookService {
    public UUID create(Book book) {
        UUID uuid = UUID.randomUUID();
        book.id = uuid;
        book.persist();
        return uuid;
    }

    public List<Book> findAll() {
        return Book.listAll();
    }
}
