package it.gixlg.coding.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"it.gixlg.coding.spring","it.gixlg.coding.messagebean"}) //or @ComponentScan("it.gixlg.coding")
public class Application {

	final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class)){ //This try call close at the end of block
			MessageWriter messageWriter1 = applicationContext.getBean(MessageWriter.class);
			MessageWriter messageWriter2 = applicationContext.getBean(MessageWriter.class);

			compareObjectInstances(messageWriter1, messageWriter2);
		}
	}

	public static void compareObjectInstances(Object obj1, Object obj2){
		LOGGER.info("Is {}the same Object", obj1==obj2 ? "" : "NOT ");
	}
}
