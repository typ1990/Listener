package com.cn.Observer;

/**
 * 这是一个观察者接口，定义一个更新的接口，给那些目标发生改变的时候通知的对象。
 * Created by typ on 2016/10/4.
 */
public interface Observer {
    public void update(Subject subject);

    public String getObserverState();

    public void setObserverState(String observerState);


}
