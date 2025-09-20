package dev.gabrielevaristo.messaging.modules.webhook.infrastructure.messaging.broker.rabbitmq.listener;

import dev.gabrielevaristo.messaging.modules.messaging.application.handler.MessageHandler;
import dev.gabrielevaristo.messaging.modules.messaging.application.serializer.MessageSerializer;
import dev.gabrielevaristo.messaging.modules.messaging.infrastructure.broker.rabbitmq.listener.RabbitAbstractQueueListener;
import dev.gabrielevaristo.messaging.modules.webhook.domain.objects.queue.WebhookQueueMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitWebhookQueueListener extends RabbitAbstractQueueListener<WebhookQueueMessage> {

    protected RabbitWebhookQueueListener(MessageSerializer<Message, WebhookQueueMessage> serializer, MessageHandler<WebhookQueueMessage> handler) {
        super(serializer, handler);
    }

    @RabbitListener(queues = "notifications.webhook")
    @Override
    public void listen(Message message) {
        super.listen(message);
    }
}
