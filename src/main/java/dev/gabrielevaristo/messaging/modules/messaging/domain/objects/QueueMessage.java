package dev.gabrielevaristo.messaging.modules.messaging.domain.objects;

import java.util.Map;

public abstract class QueueMessage<T> {

    protected final T content;
    protected final Map<String, Object> headers;

    public QueueMessage(T content, Map<String, Object> headers) {
        this.content = content;
        this.headers = headers;
    }

    public T getContent() {
        return this.content;
    }

    public Map<String, Object> getHeaders() {
        return this.headers;
    }
}
