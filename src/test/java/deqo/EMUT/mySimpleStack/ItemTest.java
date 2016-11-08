package deqo.EMUT.mySimpleStack;

import deqo.emut.mySimpleStack.Item;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by mundial on 08/11/2016.
 */
public class ItemTest {

    Item item;

    @Before
    public void setUp() throws Exception {
      item = new  Item( new Integer(5));
    }

    @Test
    public void testGetValue() throws Exception {
        Integer i = (Integer) item.getValue();
        assertTrue(item.getValue() instanceof Integer);
        assertEquals(5,i.intValue());
    }

    @Test
    public void testSetValue() throws Exception {

        Integer i = (Integer) item.getValue();
        assertTrue(item.getValue()instanceof Integer);
        assertEquals(5,i.intValue());

        Item it = new Item(new Integer(3));
        item.setValue(it);
        Integer j = (Integer) it.getValue();
        assertEquals(3,j.intValue());
    }

}