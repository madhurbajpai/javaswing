import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements ActionListener {

    int x = 0, y = 0, color = 0;
    int xSpeed = 1, ySpeed = 1;
    Timer timer;
    Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.PINK };

    BouncingBall() {
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(colors[color]);
        g.fillOval(x, y, 30, 30);
    }

    public void actionPerformed(ActionEvent e) {
        x += xSpeed;
        y += ySpeed;
        if (x < 0 || x > getWidth() - 30) {
            xSpeed = -xSpeed;
            color = (color + 1) % colors.length;
        }
        if (y < 0 || y > getHeight() - 30) {
            ySpeed = -ySpeed;
            color = (color + 1) % colors.length;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Bouncing Ball");
        BouncingBall ball = new BouncingBall();
        f.add(ball);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLocation(100, 100);
        f.setVisible(true);
    }
}
