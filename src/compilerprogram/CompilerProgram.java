/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author h_laessig
 */
public class CompilerProgram 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame newFrame = new JFrame();
        newFrame.setVisible(true);
        LoginPanel theLoginPanel = new LoginPanel(newFrame);
        newFrame.add(theLoginPanel);
        newFrame.setSize(500, 500);
    }
    
}
