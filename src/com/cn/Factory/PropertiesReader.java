package com.cn.Factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by typ on 2016/10/5.
 */
public class PropertiesReader {

    public Map<String,String> getProperties(){
        Properties properties=new Properties();
        Map<String,String> map=new HashMap<String,String>();
        try {
            InputStream inputStream= getClass().getResourceAsStream("type.properties");
            properties.load(inputStream);
            Enumeration enumeration= properties.propertyNames();
            while (enumeration.hasMoreElements()){
            String key=(String)enumeration.nextElement();
            String value=properties.getProperty(key);
            map.put(key,value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
