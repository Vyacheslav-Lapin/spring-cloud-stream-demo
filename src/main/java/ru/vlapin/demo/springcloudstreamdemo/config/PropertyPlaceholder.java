package ru.vlapin.demo.springcloudstreamdemo.config;

import ru.vlapin.demo.springcloudstreamdemo.model.JavaConfigBasedSetterPropertiesPlaceholderExample;
import ru.vlapin.demo.springcloudstreamdemo.model.JavaConfigBasedSetterPropertiesPlaceholderExampleImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConfigurationPropertiesScan("ru.vlapin.demo.springcloudstreamdemo")
public class PropertyPlaceholder {

  @Bean
  @ConfigurationProperties("my-properties2")
  JavaConfigBasedSetterPropertiesPlaceholderExample mySetterProperties2() {
    return new JavaConfigBasedSetterPropertiesPlaceholderExampleImpl();
  }
}
