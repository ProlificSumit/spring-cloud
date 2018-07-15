package com.prolific.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloServer {

    @GetMapping
    public String hello() {
        return "Hello From Server";
    }
}
