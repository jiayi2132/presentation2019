package com.example.demo.gateway;

import com.example.demo.domain.OrderItem;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "readJsonGateway", defaultRequestChannel = "readJsonRequestChannel",

        defaultReplyChannel = "readJsonReplyChannel", defaultReplyTimeout = "10000")
public interface ReadJsonFromFileGateway {
       @Gateway
       public String processReadRequest();
}

