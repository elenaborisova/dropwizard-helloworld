package com.github.sullis.dropwizard.helloworld.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String message = String.format(template, "TEST");

        if (!message.contains("TEST")) {
            return Result.unhealthy("Template does not include a name!");
        }

        return Result.healthy();
    }
}
