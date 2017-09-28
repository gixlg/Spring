package it.gixlg.coding.spring;

import it.gixlg.coding.messagebean.CustomMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		try (ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){ //This try call close at the end of block
			LOGGER.info("Bean loaded {}", (Object) applicationContext.getBeanDefinitionNames());
			CustomMessage customMessage = applicationContext.getBean(CustomMessage.class);
			LOGGER.info("customMessage {}", customMessage.getMessage());
		}
	}

	public static void compareObjectInstances(Object obj1, Object obj2){
		LOGGER.info("Is {}the same Object", obj1==obj2 ? "" : "NOT ");
	}
}
