package it.gixlg.coding.spring;

import it.gixlg.coding.messagebean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by gixlg on 22/09/2017.
 */
@Component

public class MessageWriter {

    @Autowired
    @Qualifier("helloSpring") //or @Qualifier("helloSpringMessage")
    Message message;


    public void writeMessage(){
        message.print();
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("postConstruct method is called");
    }

    @PreDestroy //Not Called if the beans have Prototype Scoper
    private void preDestroy(){
        System.out.println("preDestroy method is called");
    }
}
