package redcorol.components.menubar;

import javax.swing.*;
import java.awt.*;


/**
 *
 * Menu for Menu bar
 *
 * Contains menu items
 */
public class Menu extends JMenu {

    Menu(String name){
        this.setBackground(Color.BLUE);
        this.setText(name);



        this.setVisible(true);
    }
}
