package com.learn.self;

import learn.self.IHello;

public class HelloImpl implements IHello {

    @Override
    public String sayHi(String msg) {
        return "hello:"+msg;
    }
}
