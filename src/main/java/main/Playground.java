package main;

import javax.swing.*;
import java.awt.*;

public class Playground  {

    public Playground(Color color) {

        Calculator.frame = new JFrame("Calculator"); // new frame

        Calculator calc= new Calculator(); // new object

        Calculator.text = new JTextField(20); // new textfield

        Calculator.frame.setResizable(false);

        //Creating buttons

        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
        JButton bsum,bmult,bsub,bdiv,bdot,bequal,bclear;

        //Number buttons

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        //Operation buttons

        bequal = new JButton("=");
        bsum = new JButton("+");
        bsub = new JButton("-");
        bdiv = new JButton("/");
        bmult = new JButton("x");
        bclear = new JButton("C");
        bdot = new JButton(".");

        //Creating panel

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        //Action Listeners

//        panel1.setPreferredSize(new Dimension(350,100));

        b0.addActionListener(calc);
        b1.addActionListener(calc);
        b2.addActionListener(calc);
        b3.addActionListener(calc);
        b4.addActionListener(calc);
        b5.addActionListener(calc);
        b6.addActionListener(calc);
        b7.addActionListener(calc);
        b8.addActionListener(calc);
        b9.addActionListener(calc);
        bsum.addActionListener(calc);
        bmult.addActionListener(calc);
        bsub.addActionListener(calc);
        bdiv.addActionListener(calc);
        bdot.addActionListener(calc);
        bequal.addActionListener(calc);
        bclear.addActionListener(calc);


        //defining button size


        b0.setPreferredSize(new Dimension (80,80));
        b1.setPreferredSize(new Dimension (80,80));
        b2.setPreferredSize(new Dimension (80,80));
        b3.setPreferredSize(new Dimension (80,80));
        b4.setPreferredSize(new Dimension (80,80));
        b5.setPreferredSize(new Dimension (80,80));
        b6.setPreferredSize(new Dimension (80,80));
        b7.setPreferredSize(new Dimension (80,80));
        b8.setPreferredSize(new Dimension (80,80));
        b9.setPreferredSize(new Dimension (80,80));
        bsum.setPreferredSize(new Dimension (80,80));
        bmult.setPreferredSize(new Dimension (80,80));
        bsub.setPreferredSize(new Dimension (80,80));
        bdiv.setPreferredSize(new Dimension (80,80));
        bdot.setPreferredSize(new Dimension (80,80));
        bequal.setPreferredSize(new Dimension (80,80));
        bclear.setPreferredSize(new Dimension (80,80));


        //Adding elements to panel

        panel1.add(Calculator.text);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(bsum);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(bsub);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(bmult);
        panel2.add(b0);
        panel2.add(bdot);
        panel2.add(bclear);
        panel2.add(bdiv);
        panel2.add(bequal);



        Font font1 = new Font("SansSerif", Font.BOLD, 20);


        Calculator.text.setFont(font1);

        Calculator.text.setPreferredSize(new Dimension(320,75));

        //Background of panel
        panel1.setBackground(color);
        panel2.setBackground(color);

        Calculator.frame.add(panel1,BorderLayout.NORTH);
        Calculator.frame.add(panel2);
        Calculator.frame.setLocation(100,100);
        Calculator.frame.setSize(400,600);
        Calculator.frame.show();




    }
}
