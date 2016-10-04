package com.cn.Adapter;

/**
 * Created by typ on 2016/10/4.
 */
public class NoteBook {

    private  ThreePlugIF plug;

    public NoteBook(ThreePlugIF plug) {
        this.plug = plug;
    }

    public void charge(){
        plug.powerWithThree();
    }

    public   static void main(String[] args){
        GBTowPlug gbTowPlug=new GBTowPlug();
        ThreePlugIF threePlugIF=new TwoPlugAdapter(gbTowPlug);
        NoteBook noteBook=new NoteBook(threePlugIF);
        noteBook.charge();

        threePlugIF=new TwoplugAdapterExtends();
        noteBook=new NoteBook(threePlugIF);
        noteBook.charge();

    }
}
