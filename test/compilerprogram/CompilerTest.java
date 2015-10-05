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
public class CompilerTest {
    
    String [] fileNames = new String[1];
    
    public CompilerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.fileNames[0] = "ArrayLoops.java";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testCompile method, of class Compiler.
     */
    @Test
    public void testTestCompile() {
        System.out.println("testCompile");
        Compiler instance = new Compiler();
        int expResult = 1;
        int result = instance.testCompile(fileNames[0]);
        assertEquals(expResult, result);
    }
    
}
