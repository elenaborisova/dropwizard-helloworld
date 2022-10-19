package com.github.sullis.dropwizard.helloworld.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.github.sullis.dropwizard.helloworld.api.Message;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class HelloResource {
    private final String template;
    private final String defaultName;

    public HelloResource(String template, final String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
    }

    @GET
    public Message sayHello(@QueryParam("name") Optional<String> name) {
        Message message = new Message();
        message.setText(String.format(template, name.orElse(defaultName)));
        return message;
    }
}
