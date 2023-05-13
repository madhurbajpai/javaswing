import javax.swing.*;

public class Exmp1 {
    public static void main(String args[]) {
        JFrame f = new JFrame("Example1");
        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}