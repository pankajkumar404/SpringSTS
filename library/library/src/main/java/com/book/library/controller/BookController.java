package com.book.library.controller;


import com.book.library.bookentities.Book;
import com.book.library.bookservices.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Mono<Book> create(@RequestBody Book book){
        return bookService.create(book);

    }

    @GetMapping
    public Flux<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public Mono<Book> get(@PathVariable int bookId){
        return bookService.get(bookId);
    }
    @PutMapping("/{bookId}")
    public Mono<Book> update(@RequestBody Book book, @PathVariable int bookId){
        return bookService.update(book,bookId);
    }

    @DeleteMapping("/{bookId}")
    public Mono<Void> delete(@PathVariable int bookId){
        return bookService.delete(bookId);
    }
}
