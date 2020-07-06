package com.github.Pogryziony.Librasys.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String isbn;
    private String publishingHouse;
    private String publishingYear;
    private HashSet<Author> authors;

    public Book() {
    }

    public Book(Long id, String name, String isbn, String publishingHouse, String publishingYear, HashSet<Author> authors) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public HashSet<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(HashSet<Author> authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", authors=" + authors +
                '}';
    }
}
