/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.io.*;
import java.util.*;

public class RunBatch 
{
    int compiled;
    int run;
    String fileName;
    String studentName;
    String programName;
    ArrayList<String> compileResults = new ArrayList<String>();
    ArrayList<String> inputLines = new ArrayList<String>();
    ArrayList<String> results = new ArrayList<String>();
    ArrayList<String> outputs = new ArrayList<String>();
    ArrayList<String> students = new ArrayList<String>();
    
    //*****************GET LIST OF ALL FOLDERS IN FOLDER************
    //
    //
    //
    public ArrayList<String> getFolders(String folderName)
    {
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();
        
        for (File file : listOfFiles) 
        {
            if (file.isDirectory()) 
            {
                results.add(file.getName());
                students.add(file.getName());
            }
        }
        return results;
    } 
    //*****************************************************************
    //
    //
    
    
    
    
    //**********************RUN BATCH************************
    //
    //
    //
    public ArrayList<String> getBatchOutput(ArrayList<String> inputs, String directory, String fileName)
    {
        
        //Get each folder name, in this case student names
        for(int i = 0; i < students.size();)
        {
            studentName = students.get(i);
            
            try
            {
                String folderName = (directory + "/" + studentName);

                    //Choose application to run
                    ProcessBuilder pb = new ProcessBuilder("java",fileName);

                    //Set Directory
                    pb.directory(new File(folderName));
                    pb.redirectErrorStream(true);

                    //Run processbuilder
                    Process process = pb.start();

                    OutputStream os = process.getOutputStream();
                    InputStream is = process.getInputStream();

                    BufferedReader in = new BufferedReader(new InputStreamReader(is));
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

                    String inputLine;
                    run = 0;

                    while ((inputLine = in.readLine()) != null) 
                    {
                        writer.write(inputs.get(0)); 
                        writer.newLine();
                        writer.flush();
                        inputLines.add(inputLine);
                        run++;
                    }
                 
                    outputs.add(inputLines.get(run - 1));
                    i++;
                }


            catch (IOException e) 
            {
            // TODO Auto-generated catch block
            e.printStackTrace();
            } 
        }

            return outputs;
    }
    //***********************************************************************************
    //
    //
    
    
    
    //*******************COMPILE ALL FOLDERS CONTAINED WITHIN SELECTED FOLDERD************
    //
    //
    public ArrayList<String> batchCompile(String folderName, String programName)
    {
        for(int i = 0; i < students.size(); i++)
        {
            studentName = students.get(i);
            
            fileName = folderName + studentName + "/" + programName;
            
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

                compileResults.add(studentName + " program compiled");  //Would like to look into coloring green and red based on success / fail
            } 

            catch (IOException e) 
            {
                e.printStackTrace();
                compileResults.add(studentName + " program did not compile");
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
                compileResults.add(studentName + " program did not compile");
            }
        }
        return compileResults;
    }
    
}

