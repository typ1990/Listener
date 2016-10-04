package com.cn.singleton;

/**
 * Created by typ on 2016/10/3.
 */
public class HungrySingleton {
    private HungrySingleton(){

    }

    private static HungrySingleton instance=new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }

}
