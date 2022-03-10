import javax.swing.*;
import java.awt.*;

public class Lab16 extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Home");
        Canvas canvas = new Lab16();
        canvas.setSize(800, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        g.drawLine(25, 300, 425, 300);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(225, 175, 125, 75);
        g.drawPolyline(
                new int[]{150, 150, 175, 175},
                new int[]{100, 75, 75, 125}, 4);
        g.drawArc(275, 50, 150, 200, -80, 340);
        g.drawLine(335, 300, 335, 248);
        g.drawLine(365, 300, 365, 248);
    }
}