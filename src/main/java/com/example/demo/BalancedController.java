package com.example.demo;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalancedController {

    @Autowired
    ProducerTemplate producerTemplate;

    @GetMapping("/count")
    public int countBalancedSubstring(@RequestParam String s){

        String result = producerTemplate.requestBody("direct:Count",s, String.class);
        return Integer.parseInt(result);
    }
}
