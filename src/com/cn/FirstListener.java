package com.cn;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by lisa on 2016/9/14.
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //web.xml配置
        String canshu=servletContextEvent.getServletContext().getInitParameter("canshu");

        System.out.println("初始化ServletContextListener...........");
        System.out.println("ServletContextListener参数获取canshu："+canshu);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁ServletContextListener...........");
    }
}
