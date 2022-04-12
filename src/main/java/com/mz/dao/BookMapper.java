package com.mz.dao;

import com.mz.pojo.XdBooks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    List<XdBooks> queryBooksByName(String name);
    List<XdBooks> queryBooksByAuthor(String author);
    XdBooks queryBookByNameandAuthor(@Param("name") String bookname, @Param("author") String bookauthor);
    List<XdBooks> queryAllBooks();
    int addBook(XdBooks book);
    int deleteBook(String name);
    int updateBook(XdBooks book);
    int setoutdate(@Param("name") String bookname, @Param("author") String bookauthor);
    int setreturndate(@Param("name") String bookname, @Param("author") String bookauthor);






}
