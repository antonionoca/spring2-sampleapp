# Spring2 sample application

Experiments with Spring2

# Project Status

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6cc5dad1b53f454a9ccb2beea8056d28)](https://www.codacy.com/app/antonionoca/spring2-sampleapp?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=antonionoca/spring2-sampleapp&amp;utm_campaign=Badge_Grade)
[![CircleCI](https://circleci.com/gh/antonionoca/spring2-sampleapp/tree/master.svg?style=svg)](https://circleci.com/gh/antonionoca/spring2-sampleapp/tree/master)
[![codebeat badge](https://codebeat.co/badges/e0fd32f2-de05-4902-a3f8-b3f7c982cd26)](https://codebeat.co/projects/github-com-antonionoca-spring2-sampleapp-master)

## Prerequisites

- Java 8

## Installation

```
mvn install
```

## Start the application

```
mvn tomcat:run
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

- Monitor application health using JMX.

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
