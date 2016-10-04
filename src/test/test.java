package test;

import com.cn.JavaObserver.ConcreteObserver;
import com.cn.JavaObserver.ConcreteWeatherSubject;
import com.cn.Observer.ConcreteSubject;
import com.cn.singleton.HungrySingleton;
import com.cn.singleton.LazySingleton;

/**
 * Created by typ on 2016/10/3.
 * 懒汉模式与饿汉模式的区别：
 *      懒汉模式：加载快，运行慢，线程不安全
 *      饿汉模式：加载慢，运行快，线程安全
 */
public class test {
    public static  void main(String[] args){
        /*//饿汉模式
        HungrySingleton s1= HungrySingleton.getInstance();
        HungrySingleton s2= HungrySingleton.getInstance();
        System.out.println(s1==s2);
        //懒汉模式
        LazySingleton s3= LazySingleton.getInstance();
        LazySingleton s4= LazySingleton.getInstance();
        System.out.println(s3==s4);*/

       /* ConcreteWeatherSubject subject=new ConcreteWeatherSubject();

        ConcreteObserver girl=new ConcreteObserver();
        girl.setObserverName("女友");
        ConcreteObserver monther=new ConcreteObserver();
        monther.setObserverName("母亲");

        subject.addObserver(girl);
        subject.addObserver(monther);

        subject.setContent("天气信息");*/

        //1,创建目标对象
        ConcreteSubject subject=new ConcreteSubject();
        //2，创建观察者
        com.cn.Observer.ConcreteObserver girl=new com.cn.Observer.ConcreteObserver();
        girl.setName("女友");
        com.cn.Observer.ConcreteObserver monther=new com.cn.Observer.ConcreteObserver();
        monther.setName("母亲");

        //3，添加观察对象
        subject.attach(girl);
        subject.attach(monther);
        //4,改变状态，更新信息
        subject.setSubjectState("下雪");

    }
}
