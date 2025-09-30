package com.graphql.graphQl.repositiory;

import com.graphql.graphQl.entitis.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
