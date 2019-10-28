package com.example.demo.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "readJsonGateway", defaultRequestChannel = "readJsonRequestChannel", defaultReplyChannel = "readJsonReplyChannel")
public interface ReadJsonFromFileGateway {

        @Gateway
        String processReadRequest();
}


