package com.diplav.bookstore.entity;

import lombok.*;
import jakarta.persistence.*;


@Data
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private int id;
    @Column(name="Book Name")
    private String name;
    @Column(name="Author Name")
    private String author;
    @Column(name="Book Price")
    private String price;
}
