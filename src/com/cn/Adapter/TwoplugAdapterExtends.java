package com.cn.Adapter;

/**
 * Created by typ on 2016/10/4.
 * 采用继承方式的插座适配器
 */
public class TwoplugAdapterExtends extends GBTowPlug implements ThreePlugIF {


    @Override
    public void powerWithThree() {
        System.out.println("继承适配器");
        this.powerWithTwo();
    }
}
