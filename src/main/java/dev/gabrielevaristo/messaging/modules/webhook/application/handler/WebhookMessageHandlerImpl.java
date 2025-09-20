package dev.gabrielevaristo.messaging.modules.webhook.application.handler;

import dev.gabrielevaristo.messaging.modules.webhook.application.handler.interfaces.WebhookMessageHandler;
import dev.gabrielevaristo.messaging.modules.webhook.domain.objects.queue.WebhookQueueMessage;
import org.springframework.stereotype.Component;

@Component
public class WebhookMessageHandlerImpl implements WebhookMessageHandler {

    @Override
    public void handle(WebhookQueueMessage message) {
        System.out.println("Deserialized message: " + message.getContent());
    }
}
