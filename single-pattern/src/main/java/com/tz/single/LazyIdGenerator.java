package com.tz.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName LazyIdGenerator
 * @Description 懒汉式单例加载
 * @Date 15:04 2020/4/11
 **/
public class LazyIdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static LazyIdGenerator instance ;

    private LazyIdGenerator() {
    }

    public static synchronized LazyIdGenerator getInstance(){
        if(null == instance){
            instance = new LazyIdGenerator();
        }
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
