package com.officelibrary.library.exposure.model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
public class Book {

    @Id
    private String uniqueID;
    private String title;
    private String author;
    private String description;

    @DocumentReference
    private List<Author> authors;

    public Book(String title, String author, String description, List<Author> authors) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.authors = authors;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void updateFields(Book book){
        this.title = book.title;
        this.author = book.author;
        this.description = book.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof Book)) { return false; }
        Book book = (Book) o;
        return getUniqueID() == book.getUniqueID() && Objects.equals(getTitle(), book.getTitle()) &&
            Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getDescription(), book.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniqueID(), getTitle(), getAuthor(), getDescription());
    }
}
