package dev.gabrielevaristo.messaging.modules.messaging.application.serializer;

import dev.gabrielevaristo.messaging.modules.messaging.domain.objects.QueueMessage;

public interface MessageSerializer<M, T extends QueueMessage<?>> {

    T deserialize(M message);
}
