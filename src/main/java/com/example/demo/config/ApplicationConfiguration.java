package com.example.demo.config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.http.config.EnableIntegrationGraphController;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@Configuration
@ComponentScan("com.example.demo")
@EnableIntegration
@IntegrationComponentScan("com.example.demo")
@EnableIntegrationGraphController(allowedOrigins = "http://localhost:8082")
public class ApplicationConfiguration {

    @Bean
    public MessageChannel readJsonRequestChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel readJsonReplyChannel() {
        return new DirectChannel();
    }

}
