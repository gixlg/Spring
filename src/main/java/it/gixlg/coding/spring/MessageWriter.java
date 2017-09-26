package it.gixlg.coding.spring;

import it.gixlg.coding.messagebean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 22/09/2017.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MessageWriter {

    @Autowired
    @Qualifier("helloSpring") //or @Qualifier("helloSpringMessage")
    Message message;


    public void writeMessage(){
        message.print();
    }
}
