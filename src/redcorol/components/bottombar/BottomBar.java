package redcorol.components.bottombar;

import redcorol.components.Base;

import javax.swing.*;
import java.awt.*;

public class BottomBar extends JPanel {
    private Base base;
    private Color backgroundColor = new Color(108, 114, 128);

    public BottomBar(Base base){
        this.setBackground(this.backgroundColor);
        this.base = base;

        

        this.setVisible(true);
    }


}
