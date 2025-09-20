package dev.gabrielevaristo.messaging.modules.messaging.application.listener;

public interface QueueListener<M> {

    void listen(M message);
}
