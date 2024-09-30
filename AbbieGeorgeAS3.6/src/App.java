import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
public class App {
    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            
            JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            
            // Draw sun
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(50, 50, 100, 100);
            // Draw sun rays
            g2d.setColor(Color.BLUE);
            for (int i = 0; i < 360; i += 45) {
            double radian = Math.toRadians(i);
            int x1 = 100 + (int) (Math.cos(radian) * 50);
            int y1 = 100 + (int) (Math.sin(radian) * 50);
            int x2 = 100 + (int) (Math.cos(radian) * 80);
            int y2 = 100 + (int) (Math.sin(radian) * 80);
            g2d.drawLine(x1, y1, x2, y2);
            }
            
            // Draw smiley face
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(75, 75, 50, 50);
            g2d.setColor(Color.BLUE);
            g2d.drawArc(80, 90, 40, 20, -180, 180);
            
            // Draw Eyes on the Sun
            //sets eye color to black
            g2d.setColor(Color.BLACK);

            //fills the eyes with the color black and sets the position of the left eye
            //also sets width and height
            g2d.fillOval(84, 80, 10, 10);

            //fills the eyes with the color black and sets the position of the right eye
            //also sets width and height
            g2d.fillOval(104, 80, 10, 10);

            // Draw a square House to the bottom right of the sun

            //sets color of house object as gray
            g2d.setColor(Color.GRAY);

            //fills house object with gray color and sets x,y position
            //also sets width and height of house object
            g2d.fillRect(200, 250, 100, 100);
            
            // Draw red door

            //sets door object color as red
            g2d.setColor(Color.RED);

            //fills door object with red color and sets the x,y positions
            //also sets with and height of door object
            g2d.fillRect(230, 298, 40, 50);

            //doorknob for door. This is just extra stuff to make the house feel complete. 
            //Not a requirement for assignment.
            //sets doorknob object color to black
            g2d.setColor(Color.BLACK);
            //fills doorknob object with color black and sets x,y position for doorknob
            //also sets width and height of object
            g2d.fillOval(254, 320, 8, 8);

            // Draw door outline
            
            //sets door outline color to black
            g2d.setColor(Color.BLACK);
            //sets the thickness of the outline, creating a thicker outline and making it more prominent. I like it.
            g2d.setStroke(new BasicStroke(3));
            //sets rectangle (door outline) x,y positions and sets width and height of object
            g2d.drawRect(230, 298, 40, 50);

        }
        };
            
            frame.add(canvas);
            frame.setVisible(true);
    });
    }
}
