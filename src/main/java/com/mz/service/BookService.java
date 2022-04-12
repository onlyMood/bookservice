package com.mz.service;

import com.mz.pojo.XdBooks;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookService {
        List<XdBooks> queryBooksByName(String name);
        List<XdBooks> queryBooksByAuthor(String author);
        XdBooks queryBookByNameandAuthor(String name,String author);

        List<XdBooks> queryAllBooks();
        int addBook(XdBooks book);
        int deleteBook(String name);
        int updateBook(XdBooks book);
        int setoutdate(String bookname, String bookauthor);
        int setreturndate(String bookname, String bookauthor);


}
