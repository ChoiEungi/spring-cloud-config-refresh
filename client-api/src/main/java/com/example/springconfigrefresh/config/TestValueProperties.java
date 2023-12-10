package com.example.springconfigrefresh.config;

import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
@ConfigurationProperties
@Configuration
@Getter
@Setter
@RefreshScope
@Slf4j
public class TestValueProperties {

  // get my.value from config properties
  private ValueProperties my;

  @PostConstruct
  void init(){
    log.info("-------------------------------- my properties value --------------------------------");
    log.info(my.toString());
    log.info("-------------------------------- my properties value --------------------------------");
  }

  @Getter
  @Setter
  @ToString
  public static class ValueProperties{
    private String value;
  }

}
