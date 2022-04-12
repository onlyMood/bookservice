package com.mz.filter;

import com.mz.pojo.XdStudents;
import com.mz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegistFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        HttpSession session=request.getSession();


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl =(StudentService)  context.getBean("StudentServiceImpl");
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        String passwordagain=request.getParameter("passwordagain");


        if(id!="" && password!="" && passwordagain!="" && password.equals(passwordagain)){
            if (studentServiceImpl.queryStudentById(id)==null){
                response.sendRedirect("/bookservice/isnotstudent");
            }else if(studentServiceImpl.queryStudentById(id).getPassword()!=null){

                response.sendRedirect("/bookservice/isstudent");

            }else if (password.equals(passwordagain)){
                studentServiceImpl.addPassword(new XdStudents(id,passwordagain));
                response.sendRedirect("/");
            }
        }else {
            response.sendRedirect("/bookservice/regist");
        }
    }

    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
