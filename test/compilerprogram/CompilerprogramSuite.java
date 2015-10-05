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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mazayan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({compilerprogram.CompilerTest.class, compilerprogram.RunSingleTest.class, compilerprogram.MainFrameTest.class, compilerprogram.LoginPanelTest.class, compilerprogram.CompilerProgramTest.class, compilerprogram.PasswordCheckTest.class})
public class CompilerprogramSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
