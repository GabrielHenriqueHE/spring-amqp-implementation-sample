package dev.gabrielevaristo.messaging.modules.messaging.application.handler;

import dev.gabrielevaristo.messaging.modules.messaging.domain.objects.QueueMessage;

public interface MessageHandler<T extends QueueMessage<?>> {

    void handle(T message);
}
