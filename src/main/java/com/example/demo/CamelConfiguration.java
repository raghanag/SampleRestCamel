package com.example.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.engine.DefaultProducerTemplate;
import org.apache.camel.language.bean.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfiguration {
    @Autowired
    CamelContext camelContext;
    @Bean(ref = "")
    public ProducerTemplate producerTemplate() {
        return new DefaultProducerTemplate(new DefaultCamelContext());
    }
}
