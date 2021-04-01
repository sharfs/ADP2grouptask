/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author SharfaaAnthony
 */
public class Consumers {
    
    private Consumers consumer1, consumer2, consumer3;
    
    public Consumers() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        consumer1 = new Consumers();
        consumer2 = new Consumers();
        consumer3 = new Consumers();
        consumer1 = consumer3;
        
    }
    
    @Test
    void testIdentity()
    {
        assertSame(consumer1, consumer3);
    }

    @Test
     void testEquality()
    {
        assertEquals(consumer1, consumer3);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(consumer1, consumer3);

    }

    @Test
    void testFail()
    {
        assertSame(consumer1, consumer2);
    }


    @Test
    @Timeout(24)
    void timeoutCheck()
    {
        for (int i =0 ; i<12 ; i++)
            System.out.println(i);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
