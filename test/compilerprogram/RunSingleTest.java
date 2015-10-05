/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mazayan
 */
public class RunSingleTest {
    
    String fileName = "";
    String expResult = "";
    
    public RunSingleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fileName = "/Users/Mazayan/NetBeansProjects/FinalProject/students/fisher/ArrayLoops.java";
        //expResult = 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProcessOutput method, of class RunSingle.
     */
    @Test
    public void testGetProcessOutput() {
        System.out.println("getProcessOutput");
        RunSingle instance = new RunSingle();
        String expResult = "";
        String result = instance.getProcessOutput(fileName);
        assertEquals(expResult, result);
    }
    
}
