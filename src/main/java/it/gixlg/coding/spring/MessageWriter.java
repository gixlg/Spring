package it.gixlg.coding.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 22/09/2017.
 */
@Component
public class MessageWriter {


    Message message;

    @Autowired
    public MessageWriter(Message helloSpringMessage){
        this.message= helloSpringMessage;
    }

    public void writeMessage(){
        message.print();
    }
}
