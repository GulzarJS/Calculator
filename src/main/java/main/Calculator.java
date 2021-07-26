package main;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Calculator implements ActionListener {

    static JFrame frame; // creating frame
    static JTextField text; // creating textfield


    String S1, S2, S3; // strings for keeping operators and operands

    //default constructor
    Calculator()
    {
        S1=S2=S3="";
    }


    public void actionPerformed(ActionEvent e) {
        String takenstring = e.getActionCommand();

        if (takenstring.charAt(0) >= '0' && takenstring.charAt(0) <= '9' || takenstring.charAt(0) == '.') {
            if (!S2.equals(""))
                S3 = S3 + takenstring;
            else
                S1 = S1 + takenstring;

            text.setText(S1 + S2 + S3);
        }
        else if (takenstring.charAt(0) == 'C') {
            // clear the one letter
            S1 = S2 = S3 = "";

            // set the value of text
            text.setText(S1 + S2 + S3);
        } else if (takenstring.charAt(0) == '=') {
            double answer;

            if (S2.equals("+"))
                answer = (Double.parseDouble(S1) + Double.parseDouble(S3));
            else if (S2.equals("-"))
                answer = (Double.parseDouble(S1) - Double.parseDouble(S3));
            else if (S2.equals("/"))
                answer = (Double.parseDouble(S1) / Double.parseDouble(S3));
            else
                answer = (Double.parseDouble(S1) * Double.parseDouble(S3));


            text.setText(S1 + S2 + S3 + "=" + answer);

            S1 = Double.toString(answer);

            S2 = S3 = "";

        } else {

            if (S2.equals("") || S3.equals(""))
                S2 = takenstring;
                // else evaluate
            else {
                double answer;

                // store the value in 1st
                if (S2.equals("+"))
                    answer = (Double.parseDouble(S1) + Double.parseDouble(S3));
                else if (S2.equals("-"))
                    answer = (Double.parseDouble(S1) - Double.parseDouble(S3));
                else if (S2.equals("/"))
                    answer = (Double.parseDouble(S1) / Double.parseDouble(S3));
                else
                    answer = (Double.parseDouble(S1) * Double.parseDouble(S3));


                S1 = Double.toString(answer);

                S2 = takenstring;

                S3 = "";
            }

            text.setText(S1 + S2 + S3);
        }

    }

}

