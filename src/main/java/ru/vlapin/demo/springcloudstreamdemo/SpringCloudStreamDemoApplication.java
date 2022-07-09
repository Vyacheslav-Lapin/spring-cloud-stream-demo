package ru.vlapin.demo.springcloudstreamdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import ru.vlapin.demo.springcloudstreamdemo.model.Cat;

@SpringBootApplication
@EnableBinding(Source.class)
public class SpringCloudStreamDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudStreamDemoApplication.class, args);
  }

  @Bean
  @InboundChannelAdapter(
      channel = Source.OUTPUT,
      poller = @Poller(fixedDelay = "5000", maxMessagesPerPoll = "2"))
  public MessageSource<Cat> simpleToDo() {
    return () -> MessageBuilder
                     .withPayload(new Cat("Мурка"))
                     .build();
  }
}
