package com.servlet;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class Servlet01 extends GenericServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("初始化");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我的Servlet");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("销毁");
    }
}
