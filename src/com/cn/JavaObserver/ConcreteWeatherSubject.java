package com.cn.JavaObserver;

/**
 * Created by typ on 2016/10/4.
 */
public class ConcreteWeatherSubject extends java.util.Observable {

    //定义一个天气情况的内容。
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //调用通知方法
        //注意在通知之前，再用java的observer模式，下面这句必不可少。
        this.setChanged();
        //推方法
        this.notifyObservers(content);
        //拉方法
        //this.notifyObservers();
    }
}
