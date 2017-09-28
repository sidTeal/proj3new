/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SellPaintingFrame extends JFrame{
    JLabel sellLabel;
    static JComboBox paintingList;
    JButton confirmButton, cancelButton;
    
    public SellPaintingFrame(ArrayList<Painting> paintings) {
        JPanel mainPanel = new JPanel();
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Sell Painting");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainPanel.setLayout(new GridBagLayout());
        
        ArrayList<Painting> currentPaintings = paintings;
        String[] paintingTitles = new String[currentPaintings.size() + 1];
        paintingTitles[0] = "";

        for (int i = 0; i < currentPaintings.size(); i++) {
            paintingTitles[i + 1] = currentPaintings.get(i).getTitle();
        }

        sellLabel = new JLabel("   Sell: ");
        paintingList = new JComboBox(paintingTitles);

        confirmButton = new JButton("Confirm");
        cancelButton = new JButton("Cancel");

        GUIBuilder.addComponent(mainPanel, sellLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, paintingList, 1, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, confirmButton, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, cancelButton, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(300, 400);
        this.setResizable(true);
    }
}
