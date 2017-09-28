package it.gixlg.coding.messagebean;

import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 22/09/2017.
 */
public class CustomMessage implements Message {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

