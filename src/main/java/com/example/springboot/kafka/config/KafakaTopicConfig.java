package com.example.springboot.kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafakaTopicConfig {

    @Bean
    public NewTopic buildKafkaTopic(){
        return TopicBuilder.name("kafka101").build();
    }

    @Bean
    public NewTopic buildKafkaJsonTopic(){
        return TopicBuilder.name("kafkajson101").build();
    }

}
