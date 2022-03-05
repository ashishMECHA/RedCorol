package redcorol.components.toolkit;


import javax.swing.*;
import java.awt.*;

/**
 *  This is a class to store tools for application
 */
public class RCToolkit extends JPanel {

    private RCTool pen;
    private RCTool eraser;
    private RCTool line;
    private RCTool rectangle;


    public RCToolkit(){
        setBackground(new Color(0x9c9c9c));
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(80,1000));

        pen = new RCTool("pen.png");
        this.add(pen);

        eraser = new RCTool("pen.png");
        this.add(eraser);

        line = new RCTool("pen.png");
        this.add(line);

        rectangle = new RCTool("pen.png");
        this.add(rectangle);


    }
}
