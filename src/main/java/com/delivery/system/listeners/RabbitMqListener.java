package com.delivery.system.listeners;


import com.delivery.system.json.Json;
import com.delivery.system.models.CoordinatesUpdatedInput;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    private final SimpMessagingTemplate messagingTemplate;

    public RabbitMqListener(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @RabbitListener(id = "order.cordinates-updated", queues = "order.cordinates-updated")
    public void orderDeliveredListener(String anIn) {
        final var coordinatesUpdatedInput = Json.readValue(anIn, CoordinatesUpdatedInput.class);
        this.messagingTemplate.convertAndSend("/topic/orders/" + coordinatesUpdatedInput.idOrder() + "/coordinates/updated", coordinatesUpdatedInput);
    }

}
