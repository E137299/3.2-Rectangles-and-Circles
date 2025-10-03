import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 100);

        g.setColor(Color.BLUE);
        g.fillRect(250, 50, 100, 200);

        g.setColor(Color.GREEN);
        g.fillOval(100, 250, 100, 100);

        g.setColor(Color.YELLOW);
        g.fillOval(300, 300, 150, 150);
    }
}
