package redcorol.components.toolkit;

import javax.swing.*;
import java.awt.*;


/**
 *  This class makes tools for Toolkit
 */
public class RCTool extends JLabel {

    public RCTool(String iconName){
        this.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/tools/" + iconName)));

        this.setPreferredSize(new Dimension(30, 30));
        this.setFocusable(false);
    }



}
