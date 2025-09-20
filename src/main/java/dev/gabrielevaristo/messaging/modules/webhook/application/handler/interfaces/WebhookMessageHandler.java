package dev.gabrielevaristo.messaging.modules.webhook.application.handler.interfaces;

import dev.gabrielevaristo.messaging.modules.messaging.application.handler.MessageHandler;
import dev.gabrielevaristo.messaging.modules.webhook.domain.objects.queue.WebhookQueueMessage;

public interface WebhookMessageHandler extends MessageHandler<WebhookQueueMessage> {
}
