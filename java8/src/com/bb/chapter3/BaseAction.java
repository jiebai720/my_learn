package com.bb.chapter3;

/**
 * Created by admin on 2016/11/8.
 */
public interface BaseAction {

    public void execute();


    default void hello(){
        System.out.println("hello world");
    }

}
