package com.leone.boot.common.design.behavior.observer;


/**
 * <p>抽象被观察者接口 声明了添加、删除、通知观察者方法
 *
 * @author leone
 * @since 2018-08-22
 **/
public interface BeObserver {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}