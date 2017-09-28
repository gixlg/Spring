package it.gixlg.coding.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import it.gixlg.coding.messagebean.CustomMessage;
import it.gixlg.coding.messagebean.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Currency;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTests {

    @InjectMocks
    MessageWriter messageWriter;

    @Mock
    CustomMessage customMessage;

    @Test
    public void MessageWriterCheck() {
        Mockito.when(customMessage.getMessage()).thenReturn("Mocked Message");
        assertEquals("Mocked Message", messageWriter.message.getMessage());
    }


}
