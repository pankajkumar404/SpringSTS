package com.book.library.repositories;
import com.book.library.bookentities.Book;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book,Integer> {
}
