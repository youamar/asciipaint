/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

/**
 * This is the ColoredShape class.
 *
 * @author g54915
 */
public abstract class ColoredShape implements Shape {

    private char color;

    /**
     * Simple constructor of a ColoredShape.
     *
     * @param color given character representing the color of the shape.
     */
    public ColoredShape(char color) {
        this.color = color;
    }

    /**
     * Simple getter of the color.
     *
     * @return the color of the shape.
     */
    @Override
    public char getColor() {
        return color;
    }

    /**
     * Simple setter of the color.
     *
     * @param color given character representing the color of the shape.
     */
    public void setColor(char color) {
        this.color = color;
    }

}
