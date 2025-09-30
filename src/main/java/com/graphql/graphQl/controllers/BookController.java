package com.graphql.graphQl.controllers;

import com.graphql.graphQl.entitis.Book;
import com.graphql.graphQl.entitis.BookInput;
import com.graphql.graphQl.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // create book
    @PostMapping
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    };

    @GetMapping
    public List<Book> getBookRest(){
        return this.bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getBookByIdRest(@PathVariable("id") int bookId){
        return this.bookService.get(bookId);
    }

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());
        b.setPrice((book.getPrice()));
        return this.bookService.create(b);
    }

    //get books
    @QueryMapping("allBooks")
    public List<Book> getBooks(){
        return this.bookService.getAll();
    }

    //get books by id's
    @QueryMapping("getBook")
    public Book getBookById(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}
