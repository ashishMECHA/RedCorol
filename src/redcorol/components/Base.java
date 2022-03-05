package redcorol.components;

import redcorol.components.bottombar.RCBottomBar;
import redcorol.components.componentListeners.BaseComponentListener;
import redcorol.components.menubar.RCMenuBar;
import redcorol.components.toolkit.RCToolkit;

import javax.swing.*;
import java.awt.*;


/**
 * Base class is main frame for application.
 *
 *
 */
public class Base extends JFrame{

    private BaseComponentListener componentListener;

    private RCMenuBar rcMenuBar;
    private RCBottomBar rcBottomBar;
    private RCToolkit rcToolkit;

    public Base(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("red Corol");

        this.setSize(new Dimension(1000,600));
        this.setMinimumSize(new Dimension(800,580));

        this.setLocationRelativeTo(null);

        this.componentListener = new BaseComponentListener();
        this.addComponentListener(this.componentListener);


        this.setLayout(new BorderLayout());

        /*
         * Add bar to app
         * */
        this.rcMenuBar = new RCMenuBar(this);
        this.add(this.rcMenuBar, BorderLayout.NORTH);

        /*
        * add bottom bar to app
        * */

        this.rcBottomBar = new RCBottomBar(this);
        this.add(rcBottomBar, BorderLayout.SOUTH);

        /*
        * Add Toolkit to app
        * */
        this.rcToolkit = new RCToolkit();
        this.add(rcToolkit,BorderLayout.WEST);

        this.setVisible(true);
    }

    public RCBottomBar getRcBottomBar() {
        return rcBottomBar;
    }

    public RCMenuBar getRCMenuBar() {
        return rcMenuBar;
    }
}
