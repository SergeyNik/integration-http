package com.sergeynik.integrationhttp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;

public class MessagePrinter {

    @Autowired
    private SimpleGateway gateway;

    public String print(Message<?> message) {
        gateway.execute("1");
        return "From the inbound gateway:  1 message worked";
    }

    public void printConsole(Message<?> message) {
        System.out.println("Message was passed to printConsole method.");
        System.out.println(message);
    }
}
