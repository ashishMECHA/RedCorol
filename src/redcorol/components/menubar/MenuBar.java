package redcorol.components.menubar;

import redcorol.components.Base;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {
    private Base base;

    private Color backgroundColor = new Color(108, 114, 128);

    private Menu file;
    private Menu edit;
    private Menu help;
    private Menu about;

    public MenuBar(Base base) {
        this.setBackground(this.backgroundColor);
        this.base = base;

        // add components here
        file = new Menu("File");
        this.add(file);

        edit = new Menu("Edit");
        this.add(edit);

        help = new Menu("Help");
        this.add(help);

        about = new Menu("about");
        this.add(about);



        this.setVisible(true);
    }

    public Base getBase() {
        return base;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Menu getFileMenu() {
        return file;
    }

    public Menu getEditMenu() {
        return edit;
    }

    public Menu getHelpMenu() {
        return help;
    }

    public Menu getAboutMenu() {
        return about;
    }
}
