/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author varshaa
 */
public class StringReversalTest {
    
    public StringReversalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class StringReversal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StringReversal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReverseString method, of class StringReversal.
     */
    @Test
    public void testReverseString() {
        System.out.println("ReverseString");
        String InputString = "JIP";
        String expResult = "PIJ";
        String result = StringReversal.ReverseString(InputString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
