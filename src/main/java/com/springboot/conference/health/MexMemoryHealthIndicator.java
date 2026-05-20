package com.springboot.conference.health;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.boot.health.contributor.Status;
import org.springframework.stereotype.Component;

@Component
public class MexMemoryHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        boolean invalid = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
        Status status = invalid ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }
}
