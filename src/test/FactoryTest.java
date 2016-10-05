package test;

import com.cn.Factory.*;

/**
 * Created by typ on 2016/10/5.
 */
public class FactoryTest {

    public static void main(String[] args){
//        HairInterface left=new LeftHair();
//        left.draw();
//        HairInterface rightHair=new RightHair();
//        rightHair.draw();
        HairFactory hairFactory=new HairFactory();
//        hairFactory.getHair("left").draw();
//        hairFactory.getHair("right").draw();
//        try {
////            hairFactory.getHairByName("com.cn.Factory.LeftHair").draw();
//            hairFactory.getHairByKay("in").draw();
//        } catch (ClassNotFoundException e) {
//
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
        PersonFactory personFactory=new MCFactory();
        personFactory.getBoy().drawBoy();
        personFactory.getGirl().drawGirl();

        PersonFactory personFactory2=new HNFactory();
        personFactory2.getBoy().drawBoy();
        personFactory2.getGirl().drawGirl();

    }
}
