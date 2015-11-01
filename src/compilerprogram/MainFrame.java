package compilerprogram;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    private final RunBatch batch = new RunBatch();
    private final RunSingle single = new RunSingle();
    private JFileChooser chooser;
    private String fileName, programName, folderName, inputFile, studentName, chooserTitle;
    private ArrayList<String> compileResults, batchOutput, studentNames, inputs;
    private JButton CompileBatch, compileSingle, folderList, programNameButton, inputsSelection;
    private JButton runBatch, runSingle, selectFile, selectTxt;
    private JCheckBox batchArgsCheck, singleArgsCheck, batchScannerCheck, singleScannerCheck;
    private ButtonGroup buttonGroupSingle, buttonGroupBatch;
    private JTextArea batchCompileText, batchRunText, displayResults;
    private JTextField directoryField, programTextField, programNameField, inputsField, txtDirectory, singleDirectoryField;
    private JLabel OutputsLabel, javaProgramLabel, programNameLabel, selectStudentLabel, selectInputsSingleLabel;
    private JLabel folderStudentSubdirectoriesLabel, txtFileInputsLabel, CompileOutputLabel, RunOutputLabel;
    private JLabel selectInputsBatchLabel, selectBatchFolderLabel, inputTextFileLabel;
    private JPanel singlePanel, batchPanel, singleUpperPanel, singleLowerPanel, batchUpperPanel, batchLowerPanel;
    private JScrollPane singleScrollPane, batchRunScrollPane, batchCompileScrollPane;
    private JTabbedPane jTabbedPane2;
    private JComboBox studentCombo;
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        buttonGroupSingle = new ButtonGroup();
        buttonGroupBatch = new ButtonGroup();
        jTabbedPane2 = new JTabbedPane();
        singlePanel = new JPanel();
        singleUpperPanel = new JPanel();
        selectFile = new JButton();
        singleDirectoryField = new JTextField();
        selectTxt = new JButton();
        txtDirectory = new JTextField();
        singleArgsCheck = new JCheckBox();
        singleScannerCheck = new JCheckBox();
        selectInputsSingleLabel = new JLabel();
        programTextField = new JTextField();
        folderStudentSubdirectoriesLabel = new JLabel();
        txtFileInputsLabel = new JLabel();
        programNameLabel = new JLabel();
        studentCombo = new JComboBox();
        selectStudentLabel = new JLabel();
        singleLowerPanel = new JPanel();
        singleScrollPane = new JScrollPane();
        displayResults = new JTextArea();
        compileSingle = new JButton();
        runSingle = new JButton();
        OutputsLabel = new JLabel();
        batchPanel = new JPanel();
        batchUpperPanel = new JPanel();
        folderList = new JButton();
        directoryField = new JTextField();
        inputsSelection = new JButton();
        inputsField = new JTextField();
        selectInputsBatchLabel = new JLabel();
        batchArgsCheck = new JCheckBox();
        batchScannerCheck = new JCheckBox();
        programNameField = new JTextField();
        selectBatchFolderLabel = new JLabel();
        inputTextFileLabel = new JLabel();
        javaProgramLabel = new JLabel();
        programNameButton = new JButton();
        batchLowerPanel = new JPanel();
        batchCompileScrollPane = new JScrollPane();
        batchCompileText = new JTextArea();
        batchRunScrollPane = new JScrollPane();
        batchRunText = new JTextArea();
        CompileBatch = new JButton();
        runBatch = new JButton();
        CompileOutputLabel = new JLabel();
        RunOutputLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        singleUpperPanel.setBorder(BorderFactory.createEtchedBorder());

        selectFile.setText("Select Folder");
        selectFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });

        selectTxt.setText("Select Inputs");
        selectTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                selectTxtActionPerformed(evt);
            }
        });

        buttonGroupSingle.add(singleArgsCheck);
        singleArgsCheck.setText("ARGS Inputs");

        buttonGroupSingle.add(singleScannerCheck);
        singleScannerCheck.setSelected(true);
        singleScannerCheck.setText("Scanner Inputs");

        selectInputsSingleLabel.setText("Select which inputs the program uses (doesnt work)");

        programTextField.setToolTipText("Example: ArrayLoops");

        folderStudentSubdirectoriesLabel.setText("Select folder containing student subdirectories");

        txtFileInputsLabel.setText("Select .txt file with inputs");

        programNameLabel.setText("Enter name of program to be ran");

        studentCombo.setModel(new DefaultComboBoxModel(new String[]{"Choose folder first"}));

        selectStudentLabel.setText("Select student you would like to run program for");

        GroupLayout singleUpperPanelLayout = new GroupLayout(singleUpperPanel);
        singleUpperPanel.setLayout(singleUpperPanelLayout);
        singleUpperPanelLayout.setHorizontalGroup(
                singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, singleUpperPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                        .addComponent(selectFile, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(folderStudentSubdirectoriesLabel)
                                                .addComponent(singleDirectoryField, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(GroupLayout.Alignment.LEADING, singleUpperPanelLayout.createSequentialGroup()
                                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                                        .addComponent(selectTxt, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtDirectory, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtFileInputsLabel)))
                                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                                        .addGap(69, 69, 69)
                                                        .addComponent(singleArgsCheck)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(singleScannerCheck))
                                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                                        .addGap(26, 26, 26)
                                                        .addComponent(selectInputsSingleLabel)))
                                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(programTextField)
                                                                .addComponent(studentCombo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                                                                        .addComponent(programNameLabel)
                                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                                .addGroup(GroupLayout.Alignment.TRAILING, singleUpperPanelLayout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(selectStudentLabel)
                                                        .addGap(15, 15, 15)))))
                        .addGap(91, 91, 91))
        );
        singleUpperPanelLayout.setVerticalGroup(
                singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(singleUpperPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(folderStudentSubdirectoriesLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(selectFile, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addComponent(singleDirectoryField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFileInputsLabel)
                                .addComponent(programNameLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDirectory, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addComponent(programTextField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectTxt, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(selectInputsSingleLabel)
                                .addComponent(selectStudentLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(singleUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(singleArgsCheck)
                                .addComponent(singleScannerCheck)
                                .addComponent(studentCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
        );

        singleLowerPanel.setBorder(BorderFactory.createEtchedBorder());

        singleScrollPane.setViewportView(displayResults);

        compileSingle.setText("Compile");
        compileSingle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                compileActionPerformed(evt, "Single");
            }
        });

        runSingle.setText("Run");
        runSingle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                runActionPerformed(evt, "Single");
            }
        });

        OutputsLabel.setText("Outputs");

        GroupLayout singleLowerPanelLayout = new GroupLayout(singleLowerPanel);
        singleLowerPanel.setLayout(singleLowerPanelLayout);
        singleLowerPanelLayout.setHorizontalGroup(
                singleLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, singleLowerPanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(singleScrollPane, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                .addGroup(singleLowerPanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(compileSingle, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runSingle, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                .addGroup(singleLowerPanelLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(OutputsLabel)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singleLowerPanelLayout.setVerticalGroup(
                singleLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(singleLowerPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(OutputsLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(singleScrollPane, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(singleLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(compileSingle, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addComponent(runSingle, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
        );

        GroupLayout singlePanelLayout = new GroupLayout(singlePanel);
        singlePanel.setLayout(singlePanelLayout);
        singlePanelLayout.setHorizontalGroup(
                singlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(singlePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(singlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(singleUpperPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(singleLowerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );
        singlePanelLayout.setVerticalGroup(
                singlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(singlePanelLayout.createSequentialGroup()
                        .addComponent(singleUpperPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(singleLowerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Single", singlePanel);

        batchUpperPanel.setBorder(BorderFactory.createEtchedBorder());

        folderList.setText("Select Folder");
        folderList.setMaximumSize(new java.awt.Dimension(137, 29));
        folderList.setMinimumSize(new java.awt.Dimension(137, 29));
        folderList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                folderListActionPerformed(evt);
            }
        });

        inputsSelection.setText("Select Inputs");
        inputsSelection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputsSelectionActionPerformed(evt);
            }
        });

        selectInputsBatchLabel.setText("Select which inputs the program uses (doesnt work yet)");

        buttonGroupBatch.add(batchArgsCheck);
        batchArgsCheck.setText("ARGS Inputs");

        buttonGroupBatch.add(batchScannerCheck);
        batchScannerCheck.setSelected(true);
        batchScannerCheck.setText("Scanner Inputs");

        programTextField.setToolTipText("Example: ArrayLoops");

        selectBatchFolderLabel.setText("Select folder containing batch folders to process");

        inputTextFileLabel.setText("Select text file containing inputs");

        javaProgramLabel.setText("Enter name of java program");

        programNameButton.setText("Enter");
        programNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                programNameButtonActionPerformed(evt);
            }
        });

        GroupLayout batchUpperPanelLayout = new GroupLayout(batchUpperPanel);
        batchUpperPanel.setLayout(batchUpperPanelLayout);
        batchUpperPanelLayout.setHorizontalGroup(
                batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(folderList, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputsSelection, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(inputTextFileLabel))
                                                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(inputsField, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        //.addComponent(programNameButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(programNameField, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(javaProgramLabel))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(selectBatchFolderLabel)
                                                .addComponent(directoryField, GroupLayout.PREFERRED_SIZE, 663, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(batchUpperPanelLayout.createSequentialGroup()
                                                                .addComponent(batchArgsCheck)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(batchScannerCheck))
                                                        .addComponent(selectInputsBatchLabel)))
                                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        batchUpperPanelLayout.setVerticalGroup(
                batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchUpperPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(selectBatchFolderLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(folderList, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addComponent(directoryField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(inputTextFileLabel)
                                .addComponent(javaProgramLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(inputsSelection, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputsField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addComponent(programNameField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        //  .addComponent(programNameButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGap(31, 31, 31)
                        .addComponent(selectInputsBatchLabel)
                        // .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(batchUpperPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(batchArgsCheck)
                                .addComponent(batchScannerCheck))
                        .addContainerGap())
        );

        batchLowerPanel.setBorder(BorderFactory.createEtchedBorder());

        batchCompileText.setEditable(false);
        batchCompileText.setColumns(20);
        batchCompileText.setLineWrap(true);
        batchCompileText.setRows(5);
        batchCompileScrollPane.setViewportView(batchCompileText);

        batchRunText.setEditable(false);
        batchRunText.setColumns(20);
        batchRunText.setRows(5);
        batchRunScrollPane.setViewportView(batchRunText);

        CompileBatch.setText("CompileBatch");
        CompileBatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                compileActionPerformed(evt, "Batch");
            }
        });

        runBatch.setText("RunBatch");
        runBatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                runActionPerformed(evt, "Batch");
            }
        });

        CompileOutputLabel.setText("Compiler Output");

        RunOutputLabel.setText("Run Output");

        GroupLayout batchLowerPanelLayout = new GroupLayout(batchLowerPanel);
        batchLowerPanel.setLayout(batchLowerPanelLayout);
        batchLowerPanelLayout.setHorizontalGroup(
                batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchLowerPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(CompileBatch, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runBatch, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                .addGroup(GroupLayout.Alignment.TRAILING, batchLowerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(batchCompileScrollPane, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                                .addComponent(CompileOutputLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(RunOutputLabel)
                                .addComponent(batchRunScrollPane, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
        batchLowerPanelLayout.setVerticalGroup(
                batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchLowerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(CompileOutputLabel)
                                .addComponent(RunOutputLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(batchCompileScrollPane, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(batchRunScrollPane))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(batchLowerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(runBatch, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(CompileBatch, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );

        GroupLayout batchPanelLayout = new GroupLayout(batchPanel);
        batchPanel.setLayout(batchPanelLayout);
        batchPanelLayout.setHorizontalGroup(
                batchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(batchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(batchLowerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(batchUpperPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        batchPanelLayout.setVerticalGroup(
                batchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(batchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(batchUpperPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batchLowerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        jTabbedPane2.addTab("Batch", batchPanel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2))
        );

        pack();
    }                      

    private void selectFileActionPerformed(ActionEvent evt) {                                           
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
    }                                          

    private void runActionPerformed(ActionEvent evt, String event) {                                    

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
    }                                   

    private void compileActionPerformed(ActionEvent evt, String event) {                                        

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
    }                                       

    private void folderListActionPerformed(ActionEvent evt) {                                           

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

    }                                          

    private void selectTxtActionPerformed(ActionEvent evt) {                                          
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
    }                                         

    private void inputsSelectionActionPerformed(ActionEvent evt) {                                                

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
    }                                               

    private void programNameButtonActionPerformed(ActionEvent evt) {                                                  

        System.out.println("Folder Name: " + folderName);
        System.out.println("Program Name: " + programName);
        if (folderName != null || !folderName.equals("") || programName != null) {
            programName = programNameField.getText();
            batchCompileText.setText("Batch will run all programs named: " + programName + "\nContained within the folder: " + folderName);
        } else {
            batchCompileText.setText("Please select a folder first");
        }
    }                                                 

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }                    
}