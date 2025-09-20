package dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.gabrielevaristo.messaging.modules.messaging.application.serializer.MessageSerializer;
import dev.gabrielevaristo.messaging.modules.messaging.domain.objects.QueueMessage;
import org.springframework.amqp.core.Message;

public abstract class RabbitAbstractMessageSerializer<T extends QueueMessage<?>> implements MessageSerializer<Message, T> {

    protected final ObjectMapper mapper;

    public RabbitAbstractMessageSerializer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public abstract T deserialize(Message message);
}
