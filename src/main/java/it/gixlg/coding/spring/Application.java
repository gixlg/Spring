package it.gixlg.coding.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"it.gixlg.coding.spring","it.gixlg.coding.messagebean"}) //or @ComponentScan("it.gixlg.coding")
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		MessageWriter messageWriter1 = applicationContext.getBean(MessageWriter.class);
		MessageWriter messageWriter2 = applicationContext.getBean(MessageWriter.class);

		compareObjectInstances(messageWriter1, messageWriter2);
	}

	public static void compareObjectInstances(Object obj1, Object obj2){
		System.out.println(String.format("Is %sthe same Object",obj1==obj2 ? "" : "NOT "));
	}
}
