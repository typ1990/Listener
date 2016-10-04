package com.cn.Observer;

/**
 * 具体的观察者对象，实现更新的方法，是自身的状态和目标的状态保持一致。
 * Created by typ on 2016/10/4.
 */
public class ConcreteObserver implements  Observer {
    private  String ObserverState;

    private String name;

    @Override
    public void update(Subject subject) {
        ObserverState=((ConcreteSubject)subject).getSubjectState();
        System.out.println(name+"收到了消息："+ObserverState);

    }


    public String getObserverState() {
        return ObserverState;
    }

    public void setObserverState(String observerState) {
        ObserverState = observerState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
