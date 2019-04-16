package com.vkc.si.demo.service.activators;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MyServiceActivator {

	public Message<String> get(Message<?> inputMsg)
	{
		System.out.println("INput is:"+ inputMsg);
		//System.out.println(inputMsg.getPayload());
		
		return MessageBuilder.withPayload("{\r\n" + 
				"\r\n" + 
				"	\"window\": {\r\n" + 
				"		\"title\": \"Sample Konfabulator Widget\",\r\n" + 
				"		\"name\": \"main_window\",\r\n" + 
				"		\"width\": 500,\r\n" + 
				"		\"height\": 500\r\n" + 
				"	}\r\n" + 
				"}").build();
	}
}
