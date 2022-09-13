package com.delivery.system.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRabbitMQ {

    @Bean
    public Queue orderCreatedQueue() {
        return new Queue("order.cordinates-updated", true, false, false);
    }
}
