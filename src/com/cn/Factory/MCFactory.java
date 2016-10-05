package com.cn.Factory;

/**
 * Created by typ on 2016/10/5.
 */
public class MCFactory implements PersonFactory{


    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
