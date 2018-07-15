package com.prolific.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/rest/hello/client")
@RestController
public class HelloResource {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getMsg(@Value("${message: Default Message}") final String message) {
        System.out.println("message : " + message);
        String url = "http://hello-server/rest/hello/server";
        return restTemplate.getForObject(url, String.class);
    }
}
