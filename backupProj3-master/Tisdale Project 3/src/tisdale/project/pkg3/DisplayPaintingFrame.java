/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DisplayPaintingFrame extends JFrame{
    JLabel displayLabel;
    static JComboBox paintingList;
    JTextField displayTextField;
    JButton okButton;
    
    public DisplayPaintingFrame(ArrayList<Painting> paintings) {
        JPanel mainPanel = new JPanel();
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Display Painting");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainPanel.setLayout(new GridBagLayout());
        ArrayList<Painting> currentPaintings = paintings;
        String[] paintingTitles = new String[currentPaintings.size()+1];
        paintingTitles[0] = "";

        for (int i = 0; i < currentPaintings.size(); i++) {
            paintingTitles[i+1] = currentPaintings.get(i).getTitle();
        }
        
        displayLabel = new JLabel("   Display: ");
        paintingList = new JComboBox(paintingTitles);
        displayTextField = new JTextField(10);
        okButton = new JButton("OK");
 
        GUIBuilder.addComponent(mainPanel, displayLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, paintingList, 1, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, displayTextField, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, okButton, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(300, 400);
        this.setResizable(true);
    }
}
