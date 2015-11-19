package sketch.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

@SuppressWarnings("serial")
class SketchPanel extends JPanel {
    private Polygon polygon;

    Random randomizer = new Random();

    //Color values (range 0-255).
    private int red;
    private int green;
    private int blue;

    //Randomized parameters.
    private int randomIterations;

    public SketchPanel(int width, int height) {
    	this.setPreferredSize(new Dimension(width, height));
    	this.setBackground(Color.WHITE);
    	this.setVisible(true);
    	
        polygon = new Polygon();
        
        //Draw a random polygon shape.
        randomDraw();
        
        //Enable drawing a polygon shape with mouse clicks.
        clickDraw();
    }

    private void draw(Graphics g) {
        //Type cast the graphics object.
        Graphics2D g2d = (Graphics2D) g;
        //Create and set a random color for the polygon.
        setRandomColor(g2d);
        //Draw the shape.
        g2d.drawPolygon(polygon);
        //Fill the shape.
        g2d.fillPolygon(polygon);
    }

    private void setRandomColor(Graphics2D g2d) {
        red = randomizer.nextInt(255);
        green = randomizer.nextInt(255);
        blue = randomizer.nextInt(255);
        g2d.setColor(new Color(red, green, blue));
    }

    private void clickDraw() {
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //Add user specified x and y points to the polygon coordinate array.
                polygon.addPoint(e.getX(), e.getY());
                repaint();
            }

        });
    }

    private void randomDraw() {
        //Random iterations through the for loop decides how many points will be added to the polygon.
        randomIterations = randomizer.nextInt(100);

        for (int i = 0; i < randomIterations; i++) {
            //Add random x and y points to the polygon coordinate array within the frame size.
            polygon.addPoint(
                    randomizer.nextInt(500), // x points
                    randomizer.nextInt(500)  // y points
            );
            repaint();
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
        //Call custom draw method.
        draw(g);
    }

}