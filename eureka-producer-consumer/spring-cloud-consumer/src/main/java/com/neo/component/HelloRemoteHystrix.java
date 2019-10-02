package com.neo.component;

import com.neo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "helloRemoteHystrix")
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" +name+", this message send failed ";
    }
}
