package com.github.sullis.dropwizard.helloworld;

import com.github.sullis.dropwizard.helloworld.resources.HelloResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

//import com.example.helloworld.health.TemplateHealthCheck;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        final HelloResource resource = new HelloResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        environment.jersey().register(resource);
    }

}
