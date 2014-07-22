package com.rabbit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rabbit.server.MessageSender;

public class MessageSendTest {

	private ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"classpath:spring-*.xml"});
	
	@Test
	public void sendMessage(){
		MessageSender sender = context.getBean(MessageSender.class);
		while(true){
			sender.sendMessage("今晚有雨，请带好雨伞！===============================================");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
