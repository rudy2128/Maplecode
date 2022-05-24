package com.maple.code;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "code",
                    groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received: " +data+ " 💽");

    }
}
