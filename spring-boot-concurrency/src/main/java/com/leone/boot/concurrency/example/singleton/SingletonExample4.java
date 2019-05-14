package com.leone.boot.concurrency.example.singleton;

import com.leone.boot.concurrency.annotations.NotRecommend;
import com.leone.boot.concurrency.annotations.NotThreadSafe;

/**
 * 双重单例锁模式，线程不安全
 * @author leone
 * @since 2018-05-06
 **/
@NotThreadSafe
@NotRecommend
public class SingletonExample4 {

    private SingletonExample4() {
    }

    private static SingletonExample4 instance = null;


    /**
     * 实例化一个对象的步骤
     * 1.memory=allocate() 分配内存空间
     * 2.初始化对象
     * 3.instance = memory 设置instance指向刚分配的内存
     */

    /**
     * JVM 和 CPU 优化，发生指令重排
     */

    /**
     * 2.初始化对象
     * 1.memory=allocate() 分配内存空间
     * 3.instance = memory 设置instance指向刚分配的内存
     */

    //静态工厂
    //双层判断加锁机制
    public static SingletonExample4 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample4.class) {
                if (instance == null) {
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }


}
