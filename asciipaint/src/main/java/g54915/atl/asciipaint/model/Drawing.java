/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Drawing class.
 *
 * @author g54915
 */
public class Drawing {

    private List<Shape> shapes;
    private int height;
    private int width;
    private static final int DEFAULT_WIDTH = 30;
    private static final int DEFAULT_HEIGHT = 30;

    /**
     * Simple constructor of a drawing without parameters.
     */
    public Drawing() {
        this(DEFAULT_HEIGHT, DEFAULT_WIDTH);
    }

    /**
     * Simple constructor of a drawing.
     *
     * @param height height of the drawing.
     * @param width width of the drawing.
     */
    public Drawing(int height, int width) {
        this.shapes = new ArrayList<>();
        this.height = height;
        this.width = width;
    }

    /**
     * This method adds a shape in the list of shapes.
     *
     * @param shape the shape we want to add to the list.
     */
    public void addShape(Shape shape) { //@srv pas public. Les méthodes qui modifient le modèle passe par la facade.
        this.shapes.add(shape);
    }

    /**
     * This method checks if a shape is in the list of shapes and gets it.
     *
     * @param p point of a shape.
     * @return the shape if it's in the list or null if it's not.
     */
    public Shape getShape(Point p) {
        int i = 0;
        int shapeSize = shapes.size();
        Shape s = shapes.get(i);

        while (i < shapeSize && !(s.isInside(p))) {
            i++;
        }
        if (i < shapeSize) {
            return s;
        }
        return null;
    }

    /**
     * Simple getter of the height of the drawing.
     *
     * @return the height of the drawing.
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Simple getter of the width of the drawing.
     *
     * @return the width of the drawing.
     */
    public int getWidth() {
        return this.width;
    }

}
