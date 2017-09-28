/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author student
 */
public class GUIComboBoxActionHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == InventoryGUI.addItemList) {
                //System.out.println("What item u wana add?");

                String item = (String) InventoryGUI.addItemList.getSelectedItem();

                switch (item) {
                    case "Book":
                        AddBookFrame addBookFrame = new AddBookFrame();
                        System.out.println("adding book");
                        InventoryGUI.addItemList.setSelectedItem("");
                        break;
                    case "Movie":
                        AddMovieFrame addMovieFrame = new AddMovieFrame();
                        System.out.println("adding movie");
                        InventoryGUI.addItemList.setSelectedItem("");
                        break;
                    case "Painting":
                        AddPaintingFrame addPaintingFrame = new AddPaintingFrame();
                        System.out.println("adding painting");
                        InventoryGUI.addItemList.setSelectedItem("");
                        break;
                    default:
                        System.out.println("nothing to add");
                        break;
                }
            } else if (e.getSource() == InventoryGUI.sellItemList) {

                String item = (String) InventoryGUI.sellItemList.getSelectedItem();

                switch (item) {
                    case "Book":
                        SellBookFrame sellBookFrame = new SellBookFrame(InventoryGUI.books);
                        System.out.println("selling book");
                        InventoryGUI.sellItemList.setSelectedItem("");
                        break;
                    case "Movie":
                        SellMovieFrame sellMovieFrame = new SellMovieFrame(InventoryGUI.movies);
                        System.out.println("selling movie");
                        InventoryGUI.sellItemList.setSelectedItem("");
                        break;
                    case "Painting":
                        SellPaintingFrame sellPaintingFrame = new SellPaintingFrame(InventoryGUI.paintings);
                        System.out.println("selling painting");
                        InventoryGUI.sellItemList.setSelectedItem("");
                        break;
                    default:
                        System.out.println("nothing to sell");
                        break;
                }
            } else if (e.getSource() == InventoryGUI.displayItemList) {

                String item = (String) InventoryGUI.displayItemList.getSelectedItem();

                switch (item) {
                    case "Book":
                        DisplayBookFrame displayBookFrame = new DisplayBookFrame(InventoryGUI.books);
                        System.out.println("displaying book");
                        InventoryGUI.displayItemList.setSelectedItem("");
                        break;
                    case "Movie":
                        DisplayMovieFrame displayMovieFrame = new DisplayMovieFrame(InventoryGUI.movies);
                        System.out.println("displaying movie");
                        InventoryGUI.displayItemList.setSelectedItem("");
                        break;
                    case "Painting":
                        DisplayPaintingFrame displayPaintingFrame = new DisplayPaintingFrame(InventoryGUI.paintings);
                        System.out.println("displaying painting");
                        InventoryGUI.displayItemList.setSelectedItem("");
                        break;
                    default:
                        System.out.println("nothing to display");
                        break;
                }
            }
        }

    }