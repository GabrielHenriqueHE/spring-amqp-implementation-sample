package dev.gabrielevaristo.messaging.modules.webhook.domain.objects.queue;

import dev.gabrielevaristo.messaging.modules.messaging.domain.objects.QueueMessage;

import java.util.Map;
import java.util.UUID;

public class WebhookQueueMessage extends QueueMessage<WebhookQueueMessage.Payload> {

    public WebhookQueueMessage(Payload payload, Map<String, Object> headers) {
        super(payload, headers);
    }

    public record Payload(
            UUID id,
            Map<String, Object> content
    ) {
    }
}
