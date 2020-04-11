package com.tz.single.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName Test1Controller
 * @Description
 * @Date 14:23 2020/4/11
 **/
@RestController
@RequestMapping("/test1")
public class Test1Controller {
    private Logger logger = new Logger();

    public Test1Controller() throws IOException {
    }


    @GetMapping("/hello")
    public String hello() throws IOException {
        logger.info("test1 hello");
        return "test1";
    }
}