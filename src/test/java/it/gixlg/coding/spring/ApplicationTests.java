package it.gixlg.coding.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import it.gixlg.coding.messagebean.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations ="/applicationContext.xml")
public class ApplicationTests {

    @Autowired
    MessageWriter messageWriter;

    @Test
    public void contextLoads() {
        assertEquals("Hello Spring", messageWriter.message.getMessage());
    }

}
