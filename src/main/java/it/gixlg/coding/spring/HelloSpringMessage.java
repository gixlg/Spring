package it.gixlg.coding.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 26/09/2017.
 */
@Component
public class HelloSpringMessage implements Message {
    @Override
    public void print() {
        System.out.println("Hello Spring");
    }
}
