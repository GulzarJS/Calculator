package view;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton{

    private JButton button;

    public Buttons(String name){
        this.button = new JButton(name);
        this.setPreferredSize(new Dimension(80,80));
    }
}
