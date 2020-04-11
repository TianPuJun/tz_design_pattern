package com.tz.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName HungryExample
 * @Description 饿汉式id生成器单例演示
 * @Date 14:42 2020/4/11
 **/
public class HungryIdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static final HungryIdGenerator instance = new HungryIdGenerator();

    private HungryIdGenerator() {
    }

    public static HungryIdGenerator getInstance(){
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
