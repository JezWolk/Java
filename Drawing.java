package OOP;
import java.awt.*;
import javax.swing.JFrame;
/**
 * Description: Traffic lights that change every 2 seconds
 * @author Jeremiah Wolkiewicz
 * @version 10/15/2022
 */
public class Drawing extends Canvas {
    public static void main(String[] args){
        //setting up the canvas properties
        JFrame frame = new JFrame("Traffic Lights Program!");
        Canvas canvas = new Drawing();
        canvas.setSize(500, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * Main paint method which calls all the other drawing methods
     * @param g - Graphics Object
     */
    public void paint(Graphics g) {
        //Creating the background and calling all the methods
        TrafficLIghts lights = new TrafficLIghts(0, 0, g);
        this.setBackground(Color.WHITE);
        lights.drawBox(0, 0, g);
        lights.goLights(0, 0, g);
        try {
            lights.goRed(50, 50, g);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            lights.goYellow(50, 200, g);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            lights.goGreen(50, 350, g);
            lights.goGreen(50, 350, g);
            System.out.println("Green");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

