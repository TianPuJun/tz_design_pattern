package com.tz.single.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName Logger
 * @Description 全局日志记录类
 * @Date 14:19 2020/4/11
 **/
public class Logger {
    private FileWriter fileWriter;

    public Logger() throws IOException {
        File file = new File(System.getProperty("java.io.tmpdir") + "/tz_log.txt");
        fileWriter = new FileWriter(file,true);
    }

    public void info(String message) throws IOException {
        fileWriter.write(message);
    }
}
