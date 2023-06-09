import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JPanel inpPan, btnPan;
    JTextField tf1;
    JLabel l1;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String txt = "";
    Double op1, op2;
    String operator, s0, s1, s2;

    Calculator() {
        // Input Panel
        s0 = "";
        s1 = "";
        s2 = "";
        inpPan = new JPanel(new GridLayout(1, 1));
        tf1 = new JTextField(30);
        tf1.setEditable(false);
        inpPan.add(tf1);
        add(inpPan);

        // Button Panel
        btnPan = new JPanel(new GridLayout(5, 5));

        b7 = new JButton("7");
        b7.addActionListener(this);
        btnPan.add(b7);

        b8 = new JButton("8");
        b8.addActionListener(this);
        btnPan.add(b8);

        b9 = new JButton("9");
        b9.addActionListener(this);
        btnPan.add(b9);

        b10 = new JButton("+");
        b10.addActionListener(this);
        btnPan.add(b10);

        b4 = new JButton("4");
        b4.addActionListener(this);
        btnPan.add(b4);

        b5 = new JButton("5");
        b5.addActionListener(this);
        btnPan.add(b5);

        b6 = new JButton("6");
        b6.addActionListener(this);
        btnPan.add(b6);

        b11 = new JButton("-");
        b11.addActionListener(this);
        btnPan.add(b11);

        b1 = new JButton("1");
        b1.addActionListener(this);
        btnPan.add(b1);

        b2 = new JButton("2");
        b2.addActionListener(this);
        btnPan.add(b2);

        b3 = new JButton("3");
        b3.addActionListener(this);
        btnPan.add(b3);

        b12 = new JButton("*");
        b12.addActionListener(this);
        btnPan.add(b12);

        b13 = new JButton("/");
        b13.addActionListener(this);
        btnPan.add(b13);

        b14 = new JButton(".");
        b14.addActionListener(this);
        btnPan.add(b14);

        b0 = new JButton("0");
        b0.addActionListener(this);
        btnPan.add(b0);

        b15 = new JButton("C");
        b15.addActionListener(this);
        btnPan.add(b15);

        b16 = new JButton("=");
        b16.setPreferredSize(new Dimension(50, 30));
        b16.addActionListener(this);
        btnPan.add(b16);

        add(btnPan);

        // Basic Frame Structure
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setLocation(100, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String op = ((JButton) e.getSource()).getText();
        if ((op.charAt(0) >= '0' && op.charAt(0) <= '9' || op.charAt(0) == '.')) {
            if (!s1.equals(""))
                s2 = s2 + op;
            else
                s0 = s0 + op;
            txt = s0 + s1 + s2;
            tf1.setText("" + txt);
        } else if (op.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            tf1.setText(s0 + s1 + s2);
        } else if (op.charAt(0) == '=') {
            double te = 0d;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("*"))
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));

            tf1.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = op;
            else {
                double te = 0d;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("*"))
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));

                tf1.setText(s0 + s1 + s2 + "=" + te);

                s0 = Double.toString(te);
                s1 = op;
                s2 = "";
            }
        }
        tf1.setText(s0 + s1 + s2);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}