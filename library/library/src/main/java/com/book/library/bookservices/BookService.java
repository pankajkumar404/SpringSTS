package com.book.library.bookservices;

import com.book.library.bookentities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Mono<Book> create(Book book);

    public Flux<Book> getAll();
    public Mono<Book> get(int bookId);
    public Mono<Book> update(Book book, int bookId);
    public Mono<Void> delete(int bookId);
    public Flux<Book> search(String query);

}
