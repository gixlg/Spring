package it.gixlg.coding.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 22/09/2017.
 */
@Component
public class MessageWriter {

    @Autowired
    Message message;

    public void writeMessage(){
        message.print();
    }
}
