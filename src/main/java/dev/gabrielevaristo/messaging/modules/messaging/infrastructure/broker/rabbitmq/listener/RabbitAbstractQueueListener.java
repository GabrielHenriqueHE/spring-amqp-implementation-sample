package dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.listener;

import dev.gabrielevaristo.messaging.modules.messaging.application.handler.MessageHandler;
import dev.gabrielevaristo.messaging.modules.messaging.application.serializer.MessageSerializer;
import dev.gabrielevaristo.messaging.modules.messaging.domain.objects.QueueMessage;
import dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.listener.interfaces.RabbitQueueListener;
import org.springframework.amqp.core.Message;

public abstract class RabbitAbstractQueueListener<T extends QueueMessage<?>> implements RabbitQueueListener {

    protected final MessageSerializer<Message, T> serializer;
    protected final MessageHandler<T> handler;

    protected RabbitAbstractQueueListener(MessageSerializer<Message, T> serializer, MessageHandler<T> handler) {
        this.serializer = serializer;
        this.handler = handler;
    }

    public void listen(Message message) {
        T deserialized = this.serializer.deserialize(message);

        this.handler.handle(deserialized);
    }
}
