package it.gixlg.coding.messagebean;

import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 22/09/2017.
 */
@Component
public class HelloWorldMessage implements Message {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}

