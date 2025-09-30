package com.graphql.graphQl.entitis;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {
    private String title;
    private String desc;
    private double price;
    private String author;
    private int pages;
}
