# Spring2 sample application

Experiments with Spring2

# Project Status

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6cc5dad1b53f454a9ccb2beea8056d28)](https://www.codacy.com/app/antonionoca/spring2-sampleapp?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=antonionoca/spring2-sampleapp&amp;utm_campaign=Badge_Grade)
[![CircleCI](https://circleci.com/gh/antonionoca/spring2-sampleapp/tree/master.svg?style=svg)](https://circleci.com/gh/antonionoca/spring2-sampleapp/tree/master)

## Prerequisites

- Java 8

## Installing

```
mvn install
```

## Getting Started

Start the application

```
mvn install tomcat:run
```

This will initialize the application on http://localhost:8080/

## Technologies

- Spring 2.5
- JUnit

## Running the tests

```
mvn integration-test
```

## Todolist

- Spring bean lists.
- Mock MVC and functional tests.
- Spring REST Docs.
- Default 404 page.
- Produces only JSON
- Implement some business logic for the REST API.

- Make repositories return the hardcoded lists.
- Monitor application health using JMX.
- Spring persistence.
- Add flyway and HSQLDB.
- Map beans and add tests.
- Website using spring and a templating engine.

# Author

Antonio Noca
[@antonionoca](http://twitter.com/antonionoca)

# License

This project is licensed under the Apache 2 licence - see [LICENSE](LICENSE) file for details.

# Reference

https://docs.spring.io/docs/petclinic.html
https://flywaydb.org/documentation/database/hsql
https://flywaydb.org/getstarted/
http://javabeat.net/integrating-spring-framework-with-hibernate-orm-framework/
https://docs.spring.io/spring/docs/2.5.x/reference/mvc.html
