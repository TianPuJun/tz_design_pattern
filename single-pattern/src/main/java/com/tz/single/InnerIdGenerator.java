package com.tz.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName InnerIdGenerator
 * @Description 静态内部类形式创建单例
 * @Date 15:32 2020/4/11
 **/
public class InnerIdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private InnerIdGenerator() {
    }

    private static class InnerIdGeneratorHolder{
        private static final InnerIdGenerator instance = new InnerIdGenerator();
    }

    public static InnerIdGenerator getInstance(){
        return InnerIdGeneratorHolder.instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
