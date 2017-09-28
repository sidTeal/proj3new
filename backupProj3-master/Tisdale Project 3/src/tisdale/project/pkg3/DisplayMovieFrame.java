/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DisplayMovieFrame extends JFrame{
    JLabel displayLabel;
    static JComboBox movieList;
    JTextField displayTextField;
    JButton okButton;
    
    public DisplayMovieFrame(ArrayList<Movie> movies) {
        JPanel mainPanel = new JPanel();
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Display Movie");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainPanel.setLayout(new GridBagLayout());
        ArrayList<Movie> currentMovies = movies;
        String[] movieTitles = new String[currentMovies.size()+1];
        movieTitles[0] = "";

        for (int i = 0; i < currentMovies.size(); i++) {
            movieTitles[i+1] = currentMovies.get(i).getTitle();
        }
        
        displayLabel = new JLabel("   Display: ");
        movieList = new JComboBox(movieTitles);
        displayTextField = new JTextField(10);
        okButton = new JButton("OK");
 
        GUIBuilder.addComponent(mainPanel, displayLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, movieList, 1, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, displayTextField, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        GUIBuilder.addComponent(mainPanel, okButton, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(300, 400);
        this.setResizable(true);
    }
}
