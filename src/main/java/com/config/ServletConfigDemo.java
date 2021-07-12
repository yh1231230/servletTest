package com.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletConfigDemo extends HttpServlet {
    //1.创建config对象
    private ServletConfig config;


    //2.通过init复制config对象
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //3.使用
        //根据key获取value
        String encodingValue = config.getInitParameter("encoding");
        System.out.println(encodingValue);
        //获取所有key
        Enumeration<String> keys = config.getInitParameterNames();
        while(keys.hasMoreElements()){
            String key=keys.nextElement();
            //根据key获取所有value
            String value=config.getInitParameter(key);

            System.out.println(key+","+value);
        }

        //获取Servlet名称
        String servletName = config.getServletName();

        //获取ServletContext对象
        ServletContext context=config.getServletContext();
        //获取共享数据
        Object username = context.getAttribute("username");
        System.out.println(username);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {

    }
}
