package com.servlet;
//Servlet多映射
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet04 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int money=10000;
       String path=req.getRequestURI();
        path = path.substring(path.lastIndexOf("/"));
        if("/vip".equals(path)){
            System.out.println("原价为："+money+",优惠价为："+(money*0.9));
        }else if("/vvip".equals(path)){
            System.out.println("原价为："+money+",优惠价为："+(money*0.6));
        }else {
            System.out.println("价格为"+money);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
