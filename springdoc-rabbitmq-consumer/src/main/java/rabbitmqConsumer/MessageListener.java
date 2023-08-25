/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbitmqConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alfa
 */
@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }
}
