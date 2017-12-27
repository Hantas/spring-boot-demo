package com.example.demo.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 10742 on 2017/12/27.
 */
@ConfigurationProperties("hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
