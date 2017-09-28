/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author student
 */
public class AddMovieFrame extends JFrame{
    JLabel titleLabel, dateAcquiredLabel, purchasePriceLabel, askingPriceLabel, directorLabel, instructionLabel, actorsLabel, actressesLabel;
    JTextField titleTextField, purchasePriceTextField, askingPriceTextField, directorTextField, actorsTextField, actressesTextField;
    JSpinner dateAcquiredSpin;
    JButton addButton, cancelButton;
    
    public AddMovieFrame(){
        JPanel mainPanel = new JPanel();
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Add Movie");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainPanel.setLayout(new GridBagLayout());
        
        Date todaysDate = new Date(); // get todays date
        
        titleLabel = new JLabel("   Title: ");
        dateAcquiredLabel = new JLabel("   Date Acquired: ");
        purchasePriceLabel = new JLabel("   Purchase Price: ");
        askingPriceLabel = new JLabel("   Asking Price: ");
        directorLabel = new JLabel("   Director: ");
        instructionLabel = new JLabel("Seperate actor and actress names with a comma.");
        actorsLabel = new JLabel("   Actors: ");
        actressesLabel = new JLabel("   Actresses: ");
        
        titleTextField = new JTextField(10);
        dateAcquiredSpin = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateAcquiredSpin, "dd/MM/yy"); // set date editor format
        dateAcquiredSpin.setEditor(dateEditor); // set editor to chosen format
        purchasePriceTextField = new JTextField(10);
        askingPriceTextField = new JTextField(10);
        directorTextField = new JTextField(10);
        actorsTextField = new JTextField(10);
        actressesTextField = new JTextField(10);
        
        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");  
        
        GUIBuilder.addComponent(mainPanel, titleLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, dateAcquiredLabel, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, purchasePriceLabel, 0, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, askingPriceLabel, 0, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, directorLabel, 0, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, instructionLabel, 1, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, actorsLabel, 0, 6, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, actressesLabel, 0, 7, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        
        GUIBuilder.addComponent(mainPanel, titleTextField, 1, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, dateAcquiredSpin, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, purchasePriceTextField, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, askingPriceTextField, 1, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, directorTextField, 1, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, actorsTextField, 1, 6, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, actressesTextField, 1, 7, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        
        GUIBuilder.addComponent(mainPanel, addButton, 1, 8, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, cancelButton, 0, 8, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(450, 400);
        this.setResizable(true);
    }
}
