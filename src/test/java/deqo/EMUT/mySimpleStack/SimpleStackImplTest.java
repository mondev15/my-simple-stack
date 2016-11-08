package deqo.EMUT.mySimpleStack;

import deqo.emut.mySimpleStack.Item;
import deqo.emut.mySimpleStack.SimpleStack;
import deqo.emut.mySimpleStack.SimpleStackImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mundial on 08/11/2016.
 */
public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception{
        /*exécuté avant chaque test*/
      simpleStack = new SimpleStackImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true,simpleStack.isEmpty());
        String elt = "element";
        simpleStack.push( new Item(elt));
        assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String elt1 = "element1";
        String elt2 = "element2";
        simpleStack.push(new Item(elt1));
        simpleStack.push(new Item(elt2));
        assertEquals(2,simpleStack.getSize());

    }

    @Test
    public void testPush() throws Exception {
        Item it = new Item(new Integer(8));
        assertEquals(0,simpleStack.getSize());

        simpleStack.push(it);
        assertEquals(1,simpleStack.getSize());

        Item o = simpleStack.peek();
        assertTrue(o.getValue() instanceof Integer);

        Integer i = (Integer) o.getValue();
        assertEquals(8,i.intValue());
        //assertEquals(it.getValue(), it);
    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new Integer(5));
        assertEquals(0,simpleStack.getSize());

        simpleStack.push(item);
        assertEquals(1,simpleStack.getSize());

        Item o = simpleStack.peek();
        assertTrue(o.getValue() instanceof Integer);

        Integer i = (Integer) o.getValue();
        assertEquals(5,i.intValue());
        //assertEquals(item.getValue(), item);
    }

    @Test
    public void testPop() throws Exception {

        Item item = new Item(new Integer(3));
        assertEquals(0,simpleStack.getSize());

        simpleStack.push(item);
        assertEquals(1,simpleStack.getSize());

        Item o = simpleStack.pop();
        assertEquals(0,simpleStack.getSize());


        assertTrue(o.getValue() instanceof Integer);

        Integer i = (Integer) o.getValue();
        assertEquals(3,i.intValue());
        //assertEquals(item.getValue(), item);
    }

}