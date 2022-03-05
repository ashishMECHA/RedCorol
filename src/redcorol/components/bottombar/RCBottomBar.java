package redcorol.components.bottombar;

import redcorol.components.Base;

import javax.swing.*;
import java.awt.*;


/**
 * Bottom bar for frame
 *
 * Contains information about cursor location on canvas and other metadata
 */
public class RCBottomBar extends JPanel {
    private Base base;

    public RCBottomBar(Base base){
        this.setBackground(new Color(108, 114, 128));
        this.base = base;



        this.setVisible(true);
    }


}
