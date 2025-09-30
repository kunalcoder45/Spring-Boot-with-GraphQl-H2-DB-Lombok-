package com.graphql.graphQl.entitis;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projct_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private double price;
    private String author;
    private int pages;
}
