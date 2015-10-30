/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Mazayan
 */
public class ActionEvents extends MainFrame {
    
    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileActionPerformed
        //Folder chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(chooserTitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile() != null) {
            folderName = (chooser.getSelectedFile().toString());
            singleDirectoryField.setText(folderName);

            //Get list of students in folder
            studentNames = batch.getFolders(folderName);
            studentCombo.removeAllItems();

            for (int i = 0; i < studentNames.size(); i++) {
                studentCombo.addItem(studentNames.get(i));
            }
        } else {
            folderName = "";
            singleDirectoryField.setText("No Selection");
        }

    }//GEN-LAST:event_selectFileActionPerformed

    private void runActionPerformed(java.awt.event.ActionEvent evt, String event) {//GEN-FIRST:event_runActionPerformed

        if (event.equals("Single")) {
            studentName = studentCombo.getSelectedItem().toString();

            if (folderName == null || fileName == null || studentName == null) {
                displayResults.setText("Missing required field");
            } else {
                String results = single.getProcessOutput(folderName, fileName, studentName, inputs);
                displayResults.setText(results);
            }
        }
        if (event.equals("Batch")) {

            if (folderName == null || programName == null) {
                batchRunText.setText("Required fields missing");
            } else {
                //Run batch run
                batchOutput = batch.getBatchOutput(inputs, folderName, programName);
                for (int i = 0; i < batchOutput.size(); i++) {
                    batchRunText.append(studentNames.get(i) + "\n" + batchOutput.get(i) + "\n\n");
                }
            }
        }

    }//GEN-LAST:event_runActionPerformed

    private void compileActionPerformed(java.awt.event.ActionEvent evt, String event) {//GEN-FIRST:event_compileActionPerformed

        if (event.equals("Single")) {
            fileName = programTextField.getText();
            int didCompile = 0;
            if (!fileName.isEmpty()) {
                didCompile = single.singleCompile(fileName);
            }

            if (didCompile == 1) {
                displayResults.setText("Compiled Succesfully");
            } else {
                displayResults.setText("File Failed to compile");
            }
        }
        if (event.equals("Batch")) {
            programName = programNameField.getText();

            if (folderName == null || programName == null) {
                batchCompileText.setText("Required fields missing");
            } else {
                //Run batch compile
                compileResults = batch.batchCompile(folderName, programName);

                for (int i = 0; i < compileResults.size(); i++) {
                    batchCompileText.append(compileResults.get(i) + "\n");
                }
            }
        }
    }//GEN-LAST:event_compileActionPerformed

    private void folderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folderListActionPerformed

        //Folder chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(chooserTitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile() != null) {
            folderName = (chooser.getSelectedFile().toString());
            directoryField.setText(folderName);

            //Get list of students in folder
            studentNames = batch.getFolders(folderName);
            int numberOfStudents = studentNames.size();
        } else {
            directoryField.setText("No Selection");
            folderName = "";
        }

    }//GEN-LAST:event_folderListActionPerformed

    private void selectTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTxtActionPerformed

        //Display file chooser for user to select inputs.txt
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new java.io.File("."));
        fileChooser.setDialogTitle("Choose a file");
        singlePanel.add(fileChooser);
        fileChooser.setVisible(true);

        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION && fileChooser.getSelectedFile() != null) {
            inputFile = fileChooser.getSelectedFile().toString();
            txtDirectory.setText(inputFile);
        } else {
            txtDirectory.setText("No Selection");
            inputFile = "";
        }

        // This will reference one line at a time
        String line = null;

        try {
            FileReader fileReader = new FileReader(inputFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                inputs.add(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }

    }//GEN-LAST:event_selectTxtActionPerformed

    private void inputsSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputsSelectionActionPerformed

        //Display file chooser for user to select inputs.txt
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        fileChooser.setCurrentDirectory(new java.io.File("."));

        singlePanel.add(fileChooser);
        fileChooser.setVisible(true);

        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION && fileChooser.getSelectedFile() != null) {
            inputFile = fileChooser.getSelectedFile().toString();
            inputsField.setText(inputFile);
        } else {
            inputsField.setText("No Selection");
            inputFile = "";
        }

        // This will reference one line at a time
        String line = null;

        try {
            FileReader fileReader = new FileReader(inputFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(Integer.parseInt(line));
                inputs.add(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }//GEN-LAST:event_inputsSelectionActionPerformed

    private void programNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programNameButtonActionPerformed

        System.out.println("Folder Name: " + folderName);
        System.out.println("Program Name: " + programName);
        if (folderName != null || !folderName.equals("") || programName != null) {
            programName = programNameField.getText();
            batchCompileText.setText("Batch will run all programs named: " + programName + "\nContained within the folder: " + folderName);
        } else {
            batchCompileText.setText("Please select a folder first");
        }
    }//GEN-LAST:event_programNameButtonActionPerformed
}
