package com.cn.entity;

import javax.servlet.http.*;
import java.io.Serializable;

/**
 * Created by lisa on 2016/9/14.
 */
public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable {

    private String username;
    private String password;

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("绑定 valueBound name："+httpSessionBindingEvent.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("解除绑定 valueUnbound name："+httpSessionBindingEvent.getName());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //钝化方法
    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("钝化 sessionWillPassivate："+httpSessionEvent.getSource());

    }

    //活化方法
    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("活化 sessionDidActivate："+httpSessionEvent.getSource());

    }
}
