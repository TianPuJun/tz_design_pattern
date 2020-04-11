package com.tz.single;


import java.util.concurrent.atomic.AtomicLong;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName DoubleCheckIdGenerator
 * @Description 双重检查锁机制
 * @Date 15:26 2020/4/11
 **/
public class DoubleCheckIdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static DoubleCheckIdGenerator instance ;

    private DoubleCheckIdGenerator() {
    }

    public static DoubleCheckIdGenerator getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckIdGenerator.class) {
                if (instance == null) {
                    instance = new DoubleCheckIdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
