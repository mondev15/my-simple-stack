package deqo.emut.mySimpleStack;

import java.lang.Object;

/**
 * created by mundial on 9/11/2016
 * un commentaire répondant à l'exigence 1
 */

public class Item{

    private Object value;

    public Item (Object value){
        setValue(value);
    }

    /**
     *  un commentaire réponsant à l'exigence11
     * @return
     */
    public Object getValue(){
      return value;
    }

    public void setValue(Object value){
        this.value= value;
    }
}