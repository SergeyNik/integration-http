package com.sergeynik.integrationhttp;

import org.springframework.messaging.Message;

public class MessagePrinter {

	public String print(Message<?> message)	{
		return "From the inbound gateway:  1 message worked";
	}
}
