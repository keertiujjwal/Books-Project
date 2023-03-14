package com.books.MicroBooks.services;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

    public List<Book> getBooks();
    public Book getBook(long bookId);
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public void deleteBook(long bookId);


}
