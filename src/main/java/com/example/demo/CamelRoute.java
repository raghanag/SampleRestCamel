package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:Count")
                .process(exchange -> {
                    String input = exchange.getIn().getBody(String.class);
                    int result = BalancedSubstringProcessor.countBalancedSubstrings(input);
                    exchange.getIn().setBody("Number of balanced substrings:"+result);
                })
                .to("file:/Users/nagaraghavarapu/Downloads?fileName=result.txt");

    }
}
