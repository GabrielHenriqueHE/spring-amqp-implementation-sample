package dev.gabrielevaristo.messaging.modules.webhook.domain;

import java.net.URI;
import java.util.UUID;

public class Webhook {

    private final UUID id;
    private final URI target;

    public Webhook(UUID id, URI target) {
        this.id = id;
        this.target = target;
    }

    public UUID getId() {
        return id;
    }

    public URI getTarget() {
        return target;
    }
}
