# Bridge for Shaded SLF4J API of Apache RocketMQ

[![License][license-image]][license-url]
[![build][build-image]][build-url]
[![Maven Central][maven-image]][maven-url]

## Introduction

This project bridges standard [SLF4J API](https://github.com/qos-ch/slf4j) to the shaded SLF4j API revealed
in [rocketmq-logging](https://github.com/aliyunmq/rocketmq-logging).

Basically, the project hijacks the implementation of the shaded SLF4J and delegates it to implement
the standard SLF4j API.

## Requirements

- Java 1.8 or later

## Getting Started

Add the following dependency to your project. Remember to:

* Replace `ROCKETMQ-SHADED-SLF4J-API-BRIDGE-VERSION` with
  the [latest release](https://search.maven.org/search?q=g:io.github.aliyunmq%20AND%20a:rocketmq-shaded-slf4j-api-bridge)
  .

```xml

<dependencies>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>2.0.3</version>
    </dependency>
    <dependency>
        <groupId>io.github.aliyunmq</groupId>
        <artifactId>rocketmq-shaded-slf4j-api-bridge</artifactId>
        <version>ROCKETMQ-SHADED-SLF4J-API-BRIDGE-VERSION</version>
    </dependency>
</dependencies>
```

## Manual Release

Set the password in your `settings.xml` for repositories: `sonatype-nexus-snapshots-aliyunmq`
and `sonatype-nexus-staging-aliyunmq`, then execute the command below:

```bash
mvn clean deploy -Prelease
```

Sign in [nexus repository manager](https://s01.oss.sonatype.org/#stagingRepositories) and check the artifact, then
determine whether to release it.

## Related Projects

* [rocketmq-logging](https://github.com/aliyunmq/rocketmq-logging): Logging for Apache RocketMQ.
* [rocketmq-slf4j-api-bridge](https://github.com/aliyunmq/rocketmq-slf4j-api-bridge): Bridge for SLF4J API of Apache RocketMQ.

## License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) Apache Software Foundation

[license-image]: https://img.shields.io/badge/license-Apache%202-4EB1BA.svg

[license-url]: https://www.apache.org/licenses/LICENSE-2.0.html

[build-image]: https://github.com/aliyunmq/rocketmq-shaded-slf4j-api-bridge/actions/workflows/build.yml/badge.svg

[build-url]: https://github.com/aliyunmq/rocketmq-shaded-slf4j-api-bridge/actions/workflows/build.yml

[maven-image]: https://maven-badges.herokuapp.com/maven-central/io.github.aliyunmq/rocketmq-shaded-slf4j-api-bridge/badge.svg

[maven-url]: https://maven-badges.herokuapp.com/maven-central/io.github.aliyunmq/rocketmq-shaded-slf4j-api-bridge
