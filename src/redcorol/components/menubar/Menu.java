package redcorol.components.menubar;

import javax.swing.*;
import java.awt.*;

public class Menu extends JMenu {

    private Color backgroundColor = Color.BLUE;

    Menu(String name){
        this.setBackground(this.backgroundColor);
        this.setText(name);



        this.setVisible(true);
    }
}
