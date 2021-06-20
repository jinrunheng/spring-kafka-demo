package com.github.springkafkademo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"test"})
    public void receiveMessage(ConsumerRecord record) {
        System.out.println(record.value());
    }
}
