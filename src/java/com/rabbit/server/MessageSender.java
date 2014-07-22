package com.rabbit.server;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

	@Resource(name="rabbitTemplate")
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(String message){
		
		/**
		 * 1、第一个参数代表Exchange(交换机)的名称，随便定义
		 * 2、第二个参数代表routingkey(路由key)的名称，随便定义
		 * 3、第三个参数代表是要发送的消息
		 */
		//rabbitTemplate.convertAndSend("msg.topic","msg.queue",message);
		rabbitTemplate.convertAndSend(message);
		System.out.println("发送消息成功：msg:"+message);
	}
}
