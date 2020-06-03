package org.spring.boot.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		JmsTemplate jmsTemplate=context.getBean(JmsTemplate.class);
		while(true) {
			jmsTemplate.convertAndSend("myLister", "test");
		}
	}
}
