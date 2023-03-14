package com.books.MicroBooks.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.awt.print.Book;
@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book, Long> {
}
