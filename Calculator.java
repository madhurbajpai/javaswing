import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.*;

public class Calculator extends JFrame {
    JPanel inpPan, btnPan;
    JTextField tf1;
    JLabel l1;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    Calculator() {
        // Input Panel

        inpPan = new JPanel(new GridLayout(1, 1));
        tf1 = new JTextField(40);
        tf1.setEditable(false);
        inpPan.add(tf1);
        add(inpPan);

        // Button Panel
        btnPan = new JPanel(new GridLayout(5, 5));
        b7 = new JButton("7");
        btnPan.add(b7);

        b8 = new JButton("8");
        btnPan.add(b8);

        b9 = new JButton("9");
        btnPan.add(b9);

        b10 = new JButton("+");
        btnPan.add(b10);

        b4 = new JButton("4");
        btnPan.add(b4);

        b5 = new JButton("5");
        btnPan.add(b5);

        b6 = new JButton("6");
        btnPan.add(b6);

        b11 = new JButton("-");
        btnPan.add(b11);

        b1 = new JButton("1");
        btnPan.add(b1);

        b2 = new JButton("2");
        btnPan.add(b2);

        b3 = new JButton("3");
        btnPan.add(b3);

        b12 = new JButton("*");
        btnPan.add(b12);

        b13 = new JButton("/");
        btnPan.add(b13);

        b14 = new JButton(".");
        btnPan.add(b14);

        b0 = new JButton("0");
        btnPan.add(b0);

        b15 = new JButton("C");
        btnPan.add(b15);

        b16 = new JButton("=");
        b16.setPreferredSize(new Dimension(50, 30));
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

    public static void main(String[] args) {
        new Calculator();
    }
}