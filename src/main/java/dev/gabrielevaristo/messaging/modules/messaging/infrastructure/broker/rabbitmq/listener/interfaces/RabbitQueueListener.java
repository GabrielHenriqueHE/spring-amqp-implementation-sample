package dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.listener.interfaces;

import dev.gabrielevaristo.messaging.modules.messaging.application.listener.QueueListener;
import org.springframework.amqp.core.Message;

public interface RabbitQueueListener extends QueueListener<Message> {
}
