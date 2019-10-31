package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.http.config.EnableIntegrationGraphController;
import org.springframework.integration.jms.JmsDestinationPollingSource;
import org.springframework.integration.jms.JmsSendingMessageHandler;
import org.springframework.integration.router.ExpressionEvaluatingRouter;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.servlet.HandlerExceptionResolver;

import javax.sql.DataSource;

@SpringBootApplication
@EnableIntegration
@IntegrationComponentScan("com.example.demo")
@EnableIntegrationGraphController(allowedOrigins = "http://localhost:8082")
@ImportResource({"classpath:META-INF/spring/integration/orderProcess.xml", "classpath:hsql_cfg.xml"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//	@ServiceActivator(inputChannel="requestChannel", poller = @Poller(fixedRate = "30000"))
//	@Bean
//	public JmsDestinationPollingSource inboundJmsAdapter(JmsTemplate jmsTemplate) {
//		JmsDestinationPollingSource source = new JmsDestinationPollingSource(jmsTemplate);
//		source.setDestinationName("in.message.queue.name");
//		return source;
//	}
//
//	@Router(inputChannel = "inChannel")
//	@Bean
//	public ExpressionEvaluatingRouter router() {
//		ExpressionEvaluatingRouter router = new ExpressionEvaluatingRouter("payload.colour");
//		router.setChannelMapping("RED", "redChannel");
//		router.setChannelMapping("YELLOW", "yellowChannel");
//		router.setChannelMapping("GREEN", "greenChannel");
//		return router;
//	}

}



