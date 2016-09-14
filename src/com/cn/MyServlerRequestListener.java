package com.cn;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by lisa on 2016/9/14.
 */
@WebListener
public class MyServlerRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("初始化ServletRequestListener######################");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        String name=servletRequestEvent.getServletRequest().getParameter("name");
        System.out.println("获取参数name:"+name);
        System.out.println("销毁ServletRequestListener######################");
    }
}
