package it.gixlg.coding.spring;

import it.gixlg.coding.messagebean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by gixlg on 22/09/2017.
 */
public class MessageWriter {
    Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    public void writeMessage(){
        System.out.println(message.getMessage());
    }
}
