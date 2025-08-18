package com.diplav.bookstore.entity;

import lombok.*;
import jakarta.persistence.*;

@Data
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MyBook")
public class MyBookList {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;
}
