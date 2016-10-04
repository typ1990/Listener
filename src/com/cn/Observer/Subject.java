package com.cn.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by typ on 2016/10/4.
 */
public class Subject {

    //用来保存注册的观察者对象
    protected List<Observer> observers=new ArrayList<Observer>();

    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o){
        observers.remove(o);

    }

    protected  void notifyObervers(){
        for(Observer o: observers){
            o.update(this);
        }

    }


}
