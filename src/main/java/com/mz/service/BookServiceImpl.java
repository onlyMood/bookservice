package com.mz.service;

import com.mz.dao.BookMapper;
import com.mz.pojo.XdBooks;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }

    public List<XdBooks> queryBooksByName(String name) {
        return bookMapper.queryBooksByName(name);
    }

    public List<XdBooks> queryBooksByAuthor(String author) {
        return bookMapper.queryBooksByAuthor(author);
    }

    public XdBooks queryBookByNameandAuthor(String name, String author) {
        return bookMapper.queryBookByNameandAuthor(name,author);
    }

    public List<XdBooks> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public int addBook(XdBooks book) {
        return bookMapper.addBook(book);
    }

    public int deleteBook(String name) {
        return bookMapper.deleteBook(name);
    }

    public int updateBook(XdBooks book) {
        return bookMapper.updateBook(book);
    }

    public int setoutdate(String bookname, String bookauthor) {
        return bookMapper.setoutdate(bookname,bookauthor);
    }

    public int setreturndate(String bookname, String bookauthor) {
        return bookMapper.setreturndate(bookname,bookauthor);
    }
}
