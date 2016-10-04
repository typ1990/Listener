package com.cn.singleton;

/**
 * Created by typ on 2016/10/3.
 * 懒汉模式
 */
public class LazySingleton {

    private LazySingleton(){

    }

    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return  instance;
    }

}
