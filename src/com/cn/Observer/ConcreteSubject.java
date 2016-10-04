package com.cn.Observer;

/**
 * Created by typ on 2016/10/4.
 * 具体的目标对象，负责把有关对象存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }


    @Override
    protected void notifyObervers() {
        for(Observer o: observers){

//            System.out.println("状态信息："+subjectState);
//            System.out.println("状态信息："+subjectState);
            if("下雨".equals(subjectState)){

                if("女友".equals(((ConcreteObserver) o).getName())){
                    o.update(this);
                }
                if("母亲".equals(((ConcreteObserver) o).getName())){
                    o.update(this);
                }
            }

            if("下雪".equals(subjectState)){
                if("母亲".equals(((ConcreteObserver) o).getName())){
                    o.update(this);
                }

            }
        }
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObervers();
    }
}
