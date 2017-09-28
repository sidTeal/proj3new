/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SellBookFrame extends JFrame {

    JLabel sellLabel;
    static JComboBox bookList;
    JButton confirmButton, cancelButton;

    public SellBookFrame(ArrayList<Book> books) {
        JPanel mainPanel = new JPanel();
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Sell Book");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainPanel.setLayout(new GridBagLayout());
        ArrayList<Book> currentBooks = books;
        String[] bookTitles = new String[currentBooks.size()+1];
        bookTitles[0] = "";

        for (int i = 0; i < currentBooks.size(); i++) {
            bookTitles[i+1] = currentBooks.get(i).getTitle();
        }
        
        sellLabel = new JLabel("   Sell: ");
        bookList = new JComboBox(bookTitles);
        
        confirmButton = new JButton("Confirm");
        cancelButton = new JButton("Cancel");  

        GUIBuilder.addComponent(mainPanel, sellLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, bookList, 1, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, confirmButton, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, cancelButton, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(300, 400);
        this.setResizable(true);
    }

}
