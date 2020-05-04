package com.example.greeting.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "message")
public class MessageConfiguration {

  private String greeting = "Hi";

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(final String greeting) {
    this.greeting = greeting;
  }
}
