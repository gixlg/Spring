package it.gixlg.coding.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"it.gixlg.coding.spring","it.gixlg.coding.messagebean"}) //or @ComponentScan("it.gixlg.coding")
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		MessageWriter messageWriter = applicationContext.getBean(MessageWriter.class);
		messageWriter.writeMessage();
	}
}
