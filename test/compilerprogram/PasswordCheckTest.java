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
public class PasswordCheckTest {
    
    public PasswordCheckTest() {
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
     * Test of testpasswordLength method, of class PasswordCheck.
     */
    @Test
    public void testTestpasswordLength() {
        System.out.println("testpasswordLength");
        String password = "";
        PasswordCheck instance = new PasswordCheck();
        instance.testpasswordLength(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testPasswordCase method, of class PasswordCheck.
     */
    @Test
    public void testTestPasswordCase() {
        System.out.println("testPasswordCase");
        String password = "";
        PasswordCheck instance = new PasswordCheck();
        instance.testPasswordCase(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testPasswordNumbers method, of class PasswordCheck.
     */
    @Test
    public void testTestPasswordNumbers() {
        System.out.println("testPasswordNumbers");
        String password = "";
        PasswordCheck instance = new PasswordCheck();
        instance.testPasswordNumbers(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testPasswordCharacters method, of class PasswordCheck.
     */
    @Test
    public void testTestPasswordCharacters() {
        System.out.println("testPasswordCharacters");
        String password = "";
        PasswordCheck instance = new PasswordCheck();
        instance.testPasswordCharacters(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
