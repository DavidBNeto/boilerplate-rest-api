package com.davidbneto.boilerplaterestapi.infrastructure.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.davidbneto.boilerplaterestapi.infrastructure.repository.persistence")
public class MongoConfig {

  @Bean
  @ConditionalOnProperty(value="spring.data.mongodb.transactional", havingValue = "true")
  public MongoTransactionManager transactionManager(MongoDbFactory dbFactory) {
    return new MongoTransactionManager(dbFactory);
  }
}