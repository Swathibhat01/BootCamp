package CrackingCodingInterview.Queues;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/25/15.
 */
public class DynamicCircularArrayImplementationTest {
    DynamicCircularArrayImplementation s = new DynamicCircularArrayImplementation(6);


    @Test
    public void test(){
        s.enQueue(7);
        Assert.assertEquals(s.size(), 1);
        Assert.assertEquals(s.toString(), "[ 7\t ]");

        s.enQueue(8);
        s.enQueue(9);
        s.enQueue(6);
        s.enQueue(3);
        s.enQueue(9);
        Assert.assertTrue(s.isFull());
        s.enQueue(3);
        s.enQueue(9);

        Assert.assertEquals(s.deQueue(), 7);
        Assert.assertEquals(s.deQueue() , 8);
        Assert.assertEquals(s.deQueue() , 9);
        Assert.assertEquals(s.deQueue() , 6);
        Assert.assertEquals(s.deQueue() , 3);
        Assert.assertEquals(s.deQueue() , 9);
        Assert.assertEquals(s.size() , 2);

    }

}