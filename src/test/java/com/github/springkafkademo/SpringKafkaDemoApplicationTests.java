package com.github.springkafkademo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = SpringKafkaDemoApplication.class)
class SpringKafkaDemoApplicationTests {

    @Autowired
    private KafkaProducer producer;

    @Test
    public void kafka() {
        producer.sendMessage("test", "hello");
        producer.sendMessage("test", "kafka");

        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
