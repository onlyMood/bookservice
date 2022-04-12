package com.mz.filter;

import com.mz.service.ManagerService;
import com.mz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        HttpSession session=request.getSession();


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl =(StudentService)  context.getBean("StudentServiceImpl");
        ManagerService managerServiceImpl =(ManagerService) context.getBean("ManagerServiceImpl") ;


        String id = request.getParameter("id");
        String password=request.getParameter("password");
        String identity =request.getParameter("identity");
        System.out.println(id);
        System.out.println(password);
        System.out.println(identity);
        if(id!="" && password!="" && identity!=null){
            //System.out.println("llllll");
            if (identity.equals("student")) {
                if (studentServiceImpl.queryStudentById(id)==null) {
                    //System.out.println("sssssss");
                    response.sendRedirect("/bookservice/isnotstudent");
                    //System.out.println("sssssssss");
                }else if (password.equals(studentServiceImpl.queryStudentById(id).getPassword())) {
                    response.sendRedirect("/bookservice/toquerybook");
                    System.out.println("学生登录成功");
                }else {
                    System.out.println("拦截访问");
                    response.sendRedirect("/");
                }
            }
            if (identity.equals("manager") ) {
                if (managerServiceImpl.queryManagerById(id) == null) {
                    //System.out.println("mmmmmmmmmmm");
                    response.sendRedirect("/bookservice/isnotmanager");
                    //System.out.println("mmmmmmmmmm");
                }else if(password.equals(managerServiceImpl.queryManagerById(id).getPassword())) {
                    //System.out.println("lllllll");
                    response.sendRedirect("/bookservice/managercontrol");
                    System.out.println("管理员登录成功");
                }else {
                    System.out.println("拦截访问");
                    response.sendRedirect("/");
                }
            }
        }else{
            System.out.println("拦截访问");
            response.sendRedirect("/");
        }
    }

    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
