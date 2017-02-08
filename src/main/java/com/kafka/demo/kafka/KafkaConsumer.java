package com.kafka.demo.kafka;

/**
 * Created by yuanguanghui on 2017/2/8.
 */
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumer implements MessageListener<Integer, String>{

    //@Override
    public void onMessage(ConsumerRecord<Integer, String> record) {
        System.out.println(record);
        System.out.println(record.key());
        System.out.println(record.value());
    }

}
