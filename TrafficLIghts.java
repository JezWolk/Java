package OOP;

import java.awt.*;
public class TrafficLIghts {
    public TrafficLIghts(int x, int y, Graphics g) {
    }
    /**
     * Draws the yellow box for the traffic lights
     * @param x - Top left x coordinate of the Traffic Light
     * @param y - Top left y coordinate of the Traffic Light
     * @param g - Graphics Object
     */
    public void drawBox(int x, int y, Graphics g) {
        //Drawing the yellow rectangle
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 200, 500);
    }
    /**
     * Draws all the gray lights
     * @param x - Top left x coordinate of the Traffic Light
     * @param y - Top left y coordinate of the Traffic Light
     * @param g - Graphics Object
     */
    public void goLights(int x, int y, Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval(50, 50, 100, 100);
        g.fillOval(50, 200, 100, 100);
        g.fillOval(50, 350, 100, 100);
    }
    /**
     * Draws the green light
     * @param x - Top left x coordinate of the Traffic Light
     * @param y - Top left y coordinate of the Traffic Light
     * @param g - Graphics Object
     * @throws InterruptedException - Thrown when a thread is sleeping
     */
    public void goRed(int x, int y, Graphics g) throws InterruptedException {
        //Drawing the green light
        g.setColor(Color.RED);
        Thread.sleep(1000);
        g.fillOval(x, y, 100,100 );
    }
    /**
     * Draws the yellow light
     * @param x - Top left x coordinate of the Traffic Light
     * @param y - Top left y coordinate of the Traffic Light
     * @param g - Graphics Object
     * @throws InterruptedException - Thrown when a thread is sleeping
     */
    public void goYellow(int x, int y, Graphics g) throws InterruptedException {
        //Drawing the yellow light
        g.setColor(Color.ORANGE);
        Thread.sleep(1000);
        g.fillOval(x, y, 100, 100);
    }
    /**
     * Draws the red light
     * @param x - Top left x coordinate of the Traffic Light
     * @param y - Top left y coordinate of the Traffic Light
     * @param g - Graphics Object
     * @throws InterruptedException - Thrown when a thread is sleeping
     */
    public void goGreen(int x, int y, Graphics g) throws InterruptedException {
        //Drawing the red light
        g.setColor(Color.GREEN);
        Thread.sleep(1000);
        g.fillOval(x, y,100, 100);
    }
}
