package com.rt;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name = "books")
public class Book extends PanacheEntityBase {
    @Id
    public UUID id;
    public String title;
    public String author;
}
