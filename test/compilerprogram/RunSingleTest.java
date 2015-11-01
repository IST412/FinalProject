/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.util.ArrayList;
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
    
    String fileName;
    int expResult;
    String folderName;
    String programName;
    String studentName;
    ArrayList<String> inputs = new ArrayList<String>();
    
    @BeforeClass
    public static void setupTests()
    {
        System.out.println("Starting Tests");
    }
    
    @Before
    public void setUp() {
        
        //fileName needs to be set to the path of a student java file
        folderName= "C:/Users/Cody/Documents/NetBeansProjects/FinalProject/students";
        programName = "ArrayLoops";
        studentName = "straffon";
        inputs.add("5");
        inputs.add("2");
        fileName = "C:/Users/Cody/Documents/NetBeansProjects/FinalProject/students/straffon";
        expResult = 1;
        
    }
    
    @Test
    public void testGetProcessOutput() {
        RunSingle program = new RunSingle();
        this.setUp();
        String result = program.getProcessOutput(folderName, programName, studentName, inputs);
        System.out.println("Test1: result = " + result);
        assertNotNull(result);
    }
    
    @Test
    public void testSingleCompile() {
        RunSingle program = new RunSingle();
        this.setUp();
        int result = program.singleCompile(fileName);
        System.out.println("Test1: result = " + result);
        assertEquals(expResult, result);
    }
        
    @After
    public void teardownTest(){
        this.fileName = null;
        System.out.println("Test Finished");
    }
    
    @AfterClass
    public static void teardownTests()
    {
        System.out.println("All Tests Finished");
    }
    
    
}


