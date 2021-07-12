package com.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;import java.net.URL;

public class ServletContextDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.获取ServletContext对象
        ServletContext context=getServletContext();


       //2.使用方法
       //根据key获取value
       String value=context.getInitParameter("globalEncoding");
        System.out.println(value);
       //获取应用访问虚拟目录
        String contextPath = context.getContextPath();
        System.out.println(contextPath);
       //获取磁盘上的绝对路径
        String realPath = context.getRealPath("/");
        System.out.println(realPath);

        String a=context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);

        String b=context.getRealPath("/b.txt");
        System.out.println(b);

        String c=context.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        //设置共享数据
        context.setAttribute("username","zhangSan");

        //删除共享数据
        context.removeAttribute("username");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
