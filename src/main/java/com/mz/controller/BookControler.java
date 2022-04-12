package com.mz.controller;

import com.mz.pojo.Managers;
import com.mz.pojo.XdBooks;
import com.mz.pojo.XdStudents;
import com.mz.service.BookService;
import com.mz.service.ManagerService;
import com.mz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/bookservice")
public class BookControler {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @Autowired
    @Qualifier("ManagerServiceImpl")
    private ManagerService managerService;
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @RequestMapping("/borrowbook/{name}/{author}")
    public String borrowbook(@PathVariable("name") String name,@PathVariable("author") String author,Model model){
        bookService.setoutdate(name,author);
        return "toquerybook";

    }
    @RequestMapping("/returnbook/{name}/{author}")
    public String returnbook(@PathVariable("name") String name,@PathVariable("author") String author,Model model){
        bookService.setreturndate(name,author);
        return "toquerybook";
    }


    @RequestMapping("/querybook")
    public String querybook(HttpServletRequest request, Model model){
        String query=request.getParameter("query");
        String key=request.getParameter("key");
        if (query==""){
            System.out.println("拦截访问");
            return "redirect:/bookservice/toquerybook";
        }else {
            if(key.equals("name")) {
                List<XdBooks> list = bookService.queryBooksByName(query);
                //System.out.println(list);
                model.addAttribute("list", list);
            }else if(key.equals("author")){
                List<XdBooks> list=bookService.queryBooksByAuthor(query);
                //System.out.println(list);
                model.addAttribute("list",list);
            }else {
                System.out.println("拦截访问");
                return "redirect:/bookservice/toquerybook";
            }
        }
        return "bookshow";
    }


    @RequestMapping("/managercontrol")
    public String managercontrol() {
        return "managercontrol";
    }

    @RequestMapping("/allbook")
    public String allbook(Model model) {
        List<XdBooks> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allbook";
    }

    @RequestMapping("/allmanager")
    public String allmanager(Model model) {
        List<Managers> list = managerService.queryAllManagers();
        model.addAttribute("list", list);
        return "allmanager";
    }

    @RequestMapping("/allstudent")
    public String allstudent(Model model) {
        List<XdStudents> list = studentService.queryAllStudent();
        model.addAttribute("list", list);
        return "allstudent";

    }

    @RequestMapping("/isnotstudent")
    public String isnotstudent() {
        return "isnotstudent";
    }

    @RequestMapping("/isnotmanager")
    public String isnotmanager() {
        return "isnotmanager";
    }

    @RequestMapping("/regist")
    public String toRegistPage() {
        return "regist";
    }

    @RequestMapping("/isstudent")
    public String isstudent() {
        return "isstudent";
    }

    @RequestMapping("/toupdatebook/{name}/{author}")
    public String toupdatebook(@PathVariable("name") String name, @PathVariable("author") String author, Model model) {
        XdBooks book = bookService.queryBookByNameandAuthor(name, author);
        model.addAttribute("book", book);
        return "toupdatebook";
    }

    @RequestMapping("/deletebook/{name}")
    public String deletebook(@PathVariable("name") String name) {
        bookService.deleteBook(name);
        return "redirect:/stackroom/allbook";
    }

    @RequestMapping("/updatebook")
    public String updatebook(XdBooks book) {
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/stackroom/allbook";
    }

    @RequestMapping("/toaddbook")
    public String toaddbook() {
        return "toaddbook";
    }

    @RequestMapping("/addbook")
    public String addbook(XdBooks book) {
        bookService.addBook(book);
        return "redirect:/stackroom/allbook";
    }

    @RequestMapping("/toaddmanager")
    public String toaddmanager() {
        return "toaddmanager";
    }

    @RequestMapping("/addmanager")
    public String addmanager(Managers manager) {
        managerService.addManager(manager);
        return "redirect:/stackroom/allmanager";
    }

    @RequestMapping("/deletemanager/{id}")
    public String deletemanager(@PathVariable("id") String id) {
        bookService.deleteBook(id);
        return "redirect:/stackroom/allbook";
    }

    @RequestMapping("/resetpassword/{id}")
    public String resetpassword(@PathVariable("id") String id) {
        studentService.resetPassword(id);
        return "redirect:/stackroom/allstudent";
    }

    @RequestMapping("/deletestudent/{id}")
    public String deletestudennt(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
        return "redirect:/stackroom/allstudent";
    }

    @RequestMapping("/toaddstudent")
    public String toaddstudent() {
        return "toaddstudent";
    }

    @RequestMapping("/addstudent")
    public String addstudnet(XdStudents student) {
        studentService.addStudent(student);
        return "redirect:/stackroom/allstudent";
    }
    @RequestMapping("/toquerybook")
    public String toquerybook(){
        return "toquerybook";
    }
    /*@RequestMapping("/borrowbook/*")
    public String returntoquerybook(){
        System.out.println("借书成功");
        return "toquerybook";
    }
    @RequestMapping("/returnbook/*")
    public String returnquerybook(){
        System.out.println("还书成功");
        return "toquerybook";
    }*/





}
