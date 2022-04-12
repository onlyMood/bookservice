package com.mz.dao;

import com.mz.pojo.Managers;
import com.mz.pojo.XdBooks;
import com.mz.pojo.XdStudents;
import com.mz.service.BookService;
import com.mz.service.ManagerService;
import com.mz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService StudentServiceImpl =(StudentService)  context.getBean("StudentServiceImpl");
        if(StudentServiceImpl.queryStudentById("i")==null) System.out.println("niubi");
    }
    @org.junit.Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
        XdBooks books=bookServiceImpl.queryBookByNameandAuthor("java入门","张三");
        System.out.println(books);

    }
    @org.junit.Test
    public void test2(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerService managerServiceImpl =(ManagerService) context.getBean("ManagerServiceImpl");
        System.out.println(managerServiceImpl.queryManagerById("202099001").getPassword());

    }
    @org.junit.Test
    public void test4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
        XdBooks books=new XdBooks("我是大哥大","张四",1,"6666","liului","","");
        bookServiceImpl.updateBook(books);
        List<XdBooks> xdBooks=bookServiceImpl.queryAllBooks();
        System.out.println(xdBooks);


    }
}
