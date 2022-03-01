package redcorol.components;

import redcorol.components.bottombar.BottomBar;
import redcorol.components.componentListeners.BaseComponentListener;
import redcorol.components.menubar.MenuBar;

import javax.swing.*;
import java.awt.*;


public class Base extends JFrame{

    private BaseComponentListener componentListener;

    private MenuBar menuBar;
    private BottomBar bottomBar;

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
        this.menuBar = new MenuBar(this);
        this.add(this.menuBar, BorderLayout.NORTH);

        /*
        * add bottom bar to app
        * */

        this.bottomBar = new BottomBar(this);
        this.add(bottomBar, BorderLayout.SOUTH);

        this.setVisible(true);
    }


    public MenuBar getMyMenuBar() {
        return menuBar;
    }
}
