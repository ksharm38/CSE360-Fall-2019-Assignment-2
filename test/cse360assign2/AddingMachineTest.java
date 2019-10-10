/*
 *Kunal Sharma
 * CSE 360 Assignment 2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assign2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kunal Sharma
 * CSE 360 Assignment 2
 */
public class AddingMachineTest {
    
    public AddingMachineTest() {
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
     * Test of getTotal method, of class AddingMachine.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        AddingMachine instance = new AddingMachine();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class AddingMachine.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int value = 26;   // value to be added
        AddingMachine instance = new AddingMachine();
        instance.add(value);  // calling add function
        int expected = 26;  // expected output
       int result = instance.getTotal();  // get total value after adding
        assertEquals(result, expected);   // check whether expeected output is equal to actual output.
       
    }

    /**
     * Test of subtract method, of class AddingMachine.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int value = 26; // giving value to subtract
        int expected = -26;  // expected output
        AddingMachine instance = new AddingMachine();
        instance.subtract(value);  // calling subtract method
       int result = instance.getTotal();  // getting total
        assertEquals(expected, result); // matching expected output with actual
    }

    /**
     * Test of toString method, of class AddingMachine.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AddingMachine instance = new AddingMachine();
        instance.add(1); // adding 1 to total 
        instance.add(2);   // adding 2 to total
        instance.subtract(3);  // subtracting 3 to total
        instance.add(4);  // adding 4 to tal
        String expResult = "0 + 1 + 2 - 3 + 4";  // expeced output
        String result = instance.toString();  // getting transaction history
        assertEquals(expResult, result); // Checking whether expected out put mactches with actual.
       
    }

    /**
     * Test of clear method, of class AddingMachine.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        String expected = "0";      // Expected Output
        AddingMachine instance = new AddingMachine();
        instance.clear();   // calling clear method.
       String transaction = instance.toString();   // stores output of to string function to match with expected out put.
        assertEquals(transaction, expected); // Matches expected output with actual output - transaction
        
    }
    
}
