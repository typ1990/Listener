package com.cn.JavaObserver;

import com.cn.Observer.ConcreteSubject;

import java.util.Observable;

/**
 * Created by typ on 2016/10/4.
 */
public class ConcreteObserver implements  java.util.Observer {

    private String observerName;



    @Override
    public void update(Observable o, Object arg) {
        //第一种是推的方式。
        System.out.println(this.observerName+"收到了消息，用推的方式，目标对象推送的消息："+arg);
        //第二种是拉的方式
        System.out.println(this.observerName+"收到了消息，用拉的方式，目标对象推送的消息："
                +((ConcreteWeatherSubject)o).getContent());

    }


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
