/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

/**
 * This is the Rectangle class.
 *
 * @author g54915
 */
public class Rectangle extends ColoredShape {

    private final Point upperLeft;
    private final double width;
    private final double height;

    /**
     * Simple constructor of a Rectangle.
     *
     * @param upperLeft point representing the upper left part of the rectangle.
     * @param width width of the rectangle.
     * @param height height of the rectangle.
     * @param color a character representing the color of the rectangle.
     */
    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    /**
     * This method moves a shape.
     *
     * @param dx x after the move.
     * @param dy y after the move.
     */
    @Override
    public void move(double dx, double dy) {
        upperLeft.move(dx, dy);
    }

    /**
     * This method checks if a given point is inside of ths Shape or not.
     *
     * @param p a given point.
     * @return true if the point is inside and false otherwise.
     */
    @Override
    public boolean isInside(Point p) {

        double upperLeftX = this.upperLeft.getX();
        double upperLeftY = this.upperLeft.getY();

        return upperLeftX <= p.getX() && upperLeftY <= p.getY() && upperLeftX
                + this.width > p.getX() && upperLeftY + this.height > p.getY();
    }

}
