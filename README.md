# dropwizard-helloworld


"Hello world" application -- [Dropwizard](https://dropwizard.io) version 2.x


# Java runtime
This project requires `Java 8` or higher


# Build

```
mvn package
```

# Run the application

```
java -jar target/app.jar server config/hello-world.yml
```

# "hello" endpoint

in your web browser, visit this URL:

http://localhost:8080/hello-world?name=Elena
