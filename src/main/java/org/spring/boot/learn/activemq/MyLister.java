package org.spring.boot.learn.activemq;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyLister {

	@JmsListener(destination = "myLister")
	public void myLister(TextMessage message) {
		try {
			System.out.println(message.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
