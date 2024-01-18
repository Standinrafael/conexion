package com.distribuida.books.authors.db;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="authors")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

}
