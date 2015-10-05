/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
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
public class LoginPanelTest {
    
    String file = "";
    JFrame frame;
    
    public LoginPanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.file = "loginCheck.txt";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fileWriter method, of class LoginPanel.
     */
    @Test
    public void testFileWriter() throws Exception {
        System.out.println("fileWriter");
        LoginPanel instance = new LoginPanel(frame);
        instance.fileWriter();
    }

    /**
     * Test of fileReader method, of class LoginPanel.
     */
    @Test
    public void testFileReader() {
        System.out.println("fileReader");
        LoginPanel instance = new LoginPanel(frame);
        instance.fileReader(file);
    }

    /**
     * Test of actionPerformed method, of class LoginPanel.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        LoginPanel instance = new LoginPanel(frame);;
        instance.actionPerformed(e);
    }
    
}
