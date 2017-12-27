package com.example.demo.hello;

/**
 * Created by 10742 on 2017/12/27.
 */
public class HelloService {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello() {
        return "Hello " + msg;
    }
}
