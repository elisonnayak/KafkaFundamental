package com.example.springboot.kafka.controller;

import com.example.springboot.kafka.model.User;
import com.example.springboot.kafka.producer.JsonKafkaProducer;
import com.example.springboot.kafka.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class KafkaController {

    private KafkaProducer kafkaProducer;
    private JsonKafkaProducer jsonKafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer, JsonKafkaProducer jsonKafkaProducer) {
        this.kafkaProducer = kafkaProducer;
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to topic");
    }

    @PostMapping("/publishjson")
    public ResponseEntity<String> publishJson(@RequestBody User user){
            jsonKafkaProducer.sendMessage(user);
            return ResponseEntity.ok("Json message sent successfully");
    }

}
