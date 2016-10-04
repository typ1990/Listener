package com.cn.Adapter;

/**
 * Created by typ on 2016/10/4.
 * 二相转三相的适配器
 */
public class TwoPlugAdapter implements ThreePlugIF {

    private GBTowPlug gbTowPlug;

    public TwoPlugAdapter(GBTowPlug gbTowPlug) {
        this.gbTowPlug=gbTowPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过适配器的转化，三相转为二相");
        gbTowPlug.powerWithTwo();
    }
}
