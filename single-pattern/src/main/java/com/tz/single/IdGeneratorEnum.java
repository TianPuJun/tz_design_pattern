package com.tz.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName IdGeneratorEnum
 * @Description 枚举单例模式
 * @Date 15:26 2020/4/11
 **/
public enum IdGeneratorEnum {
    /**
     * 单例对象
     */
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public Long getId(){
        return id.incrementAndGet();
    }
}
