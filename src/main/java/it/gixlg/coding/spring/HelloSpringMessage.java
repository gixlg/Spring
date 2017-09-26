package it.gixlg.coding.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by gixlg on 26/09/2017.
 */
@Component
@Qualifier("helloSpring")
public class HelloSpringMessage implements Message {
    @Override
    public void print() {
        System.out.println("Hello Spring");
    }
}
