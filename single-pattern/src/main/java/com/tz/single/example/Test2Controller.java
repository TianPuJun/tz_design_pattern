package com.tz.single.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author https://github.com/TianPuJun @无痕
 * @ClassName Test2Controller
 * @Description
 * @Date 14:23 2020/4/11
 **/
@RestController
@RequestMapping("/test2")
public class Test2Controller {
    private Logger logger = new Logger();

    public Test2Controller() throws IOException {
    }

    @GetMapping("/hello")
    public String hello() throws IOException {
        logger.info("test2 hello");
        return "test2";
    }
}
