import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}