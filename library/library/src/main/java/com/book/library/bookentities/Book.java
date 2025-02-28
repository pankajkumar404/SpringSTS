package com.book.library.bookentities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("BookDetails")
public class Book {

    @Id
    private int bookId;
    private String bookName;
    private String  publisher;
    private String author;

    @Column("BookDescription")
    private String description;

    public Book(int bookId, String bookName, String publisher, String author, String description) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
        this.description = description;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public Book() {

    }
}
