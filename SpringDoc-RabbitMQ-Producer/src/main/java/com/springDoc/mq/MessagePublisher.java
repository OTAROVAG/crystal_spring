/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springDoc.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alfa
 */
@RestController
public class MessagePublisher {
    @Autowired
    private RabbitTemplate template;
    
    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage message){
        template.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY, message);
        
        return "The message from Springbok to the RabbitMQ queue has been successfully sent";
    }
}
