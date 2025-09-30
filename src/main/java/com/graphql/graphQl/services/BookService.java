package com.graphql.graphQl.services;

import com.graphql.graphQl.entitis.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);
}
