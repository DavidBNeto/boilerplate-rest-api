package com.davidbneto.boilerplaterestapi.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

  @Bean
  public OpenAPI customOpenAPI(
      @Value("#{buildProperties.get('version')}") final String appVersion) {

    return new OpenAPI()
        .info(new Info()
            .title("Meals Application")
            .version(appVersion)
            .description("Operations related to meals."));
  }

}