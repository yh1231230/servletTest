package com.servlet;
//生命周期


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet02 extends HttpServlet {
    //初始化
    @Override
    public void init() throws ServletException {
        System.out.println("创建并初始化成功");
    }

    //提供服务
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收客户端请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    //销毁
    @Override
    public void destroy() {
        System.out.println("对象已销毁");
    }
}
