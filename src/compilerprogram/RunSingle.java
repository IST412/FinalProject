/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class RunSingle 
{
    String results;
    int compiled;
    
    
    public String getProcessOutput(String folderName, String programName, String studentName, ArrayList<String> inputs)
    {  
        String pathDirectory = (folderName + "/" + studentName);
        System.out.println(pathDirectory);
        System.out.println("java " + programName);
        try
        {
            //Choose application to run
            ProcessBuilder pb = new ProcessBuilder("java",programName);

            //Set Directory
            pb.directory(new File(pathDirectory));
            pb.redirectErrorStream(true);

            //Run processbuilder
            Process process = pb.start();

            OutputStream os = process.getOutputStream();
            InputStream is = process.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

            String inputLine;

            while ((inputLine = in.readLine()) != null) 
            {
                System.out.println(inputLine);
                writer.write(inputs.get(0));
                writer.newLine();
                writer.flush();
                results = inputLine;
            }

            System.err.println("next one");
        }
        
        
        catch (IOException e) 
        {
        // TODO Auto-generated catch block
        e.printStackTrace();
        } 

        return results;
    }
    
    public int singleCompile(String fileName)
    {
        try 
        {       
            ProcessBuilder compiler = new ProcessBuilder("javac",fileName);
            Process runCompiler = compiler.start();

            Reader reader = new InputStreamReader(runCompiler.getInputStream());
            int ch;
            while((ch = reader.read())!= -1)
                System.out.println((char)ch);
            reader.close();

            runCompiler.waitFor();

            compiled = 1;
        } 
        
        catch (IOException e) 
        {
        // TODO Auto-generated catch block
        e.printStackTrace();
        compiled = 0;
        } 
        catch (InterruptedException e) 
        {
        // TODO Auto-generated catch block
        e.printStackTrace();
        compiled = 0;
        }
    return compiled;
    }
}