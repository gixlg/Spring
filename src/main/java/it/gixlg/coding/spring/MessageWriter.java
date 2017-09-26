package it.gixlg.coding.spring;

import it.gixlg.coding.messagebean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
}
