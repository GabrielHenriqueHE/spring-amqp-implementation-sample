package dev.gabrielevaristo.messaging.modules.webhook.infrastructure.messaging.broker.rabbitmq.serializer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.serializer.RabbitAbstractMessageSerializer;
import dev.gabrielevaristo.messaging.modules.webhook.domain.objects.queue.WebhookQueueMessage;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;

@Component
public class RabbitWebhookMessageSerializer extends RabbitAbstractMessageSerializer<WebhookQueueMessage> {
    public RabbitWebhookMessageSerializer(ObjectMapper mapper) {
        super(mapper);
    }

    @Override
    public WebhookQueueMessage deserialize(Message message) {
        try {
            WebhookQueueMessage.Payload payload = this.mapper.readValue(message.getBody(), new TypeReference<WebhookQueueMessage.Payload>() {
            });

            return new WebhookQueueMessage(payload, message.getMessageProperties().getHeaders());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
