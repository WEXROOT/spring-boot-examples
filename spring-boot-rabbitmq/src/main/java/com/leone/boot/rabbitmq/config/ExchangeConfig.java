package com.leone.boot.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitMQ交换机配置
 *
 * @author leone
 * @since 2018-05-05
 **/
@Configuration
public class ExchangeConfig {

    // ----------------------主题交换机:Topic exchange----------------------
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(RabbitMQConstant.TOPIC_EXCHANGE);
    }

    // ----------------------扇形交换机(广播):Fanout ----------------------
    @Bean
    public FanoutExchange fanoutExchange() {
//        return (FanoutExchange) ExchangeBuilder.fanoutExchange(RabbitMQConstant.FANOUT_EXCHANGE).durable(true).build();
        return new FanoutExchange(RabbitMQConstant.FANOUT_EXCHANGE);
    }

    // ----------------------首部交换机:Headers exchange----------------------
    @Bean
    public HeadersExchange headersExchange() {
        return new HeadersExchange(RabbitMQConstant.HEADERS_EXCHANGE);
    }

    // ----------------------直连交换机:Direct exchange----------------------
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(RabbitMQConstant.DIRECT_EXCHANGE);
    }

}
