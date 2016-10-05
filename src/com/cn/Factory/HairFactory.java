package com.cn.Factory;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by typ on 2016/10/5.
 * 发型工厂
 */
public class HairFactory {

    /**
     * 根据类型来创建对象
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }
        if("right".equals(key)){
            return new RightHair();
        }
        return null;

    }


    /**
     * 根据类名生产对象
     * @param name
     * @return
     */
    public  HairInterface getHairByName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (HairInterface) Class.forName(name).newInstance();

    }

    public  HairInterface getHairByKay(String key) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name=new PropertiesReader().getProperties().get(key);
        return (HairInterface) Class.forName(name).newInstance();

    }


}
