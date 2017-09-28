package it.gixlg.coding.messagebean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 26/09/2017.
 */
@Component
@Qualifier("helloSpring")
public class HelloSpringMessage implements Message {
    @Override
    public String getMessage() {
        return "Hello Spring";
    }
}
