/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

/**
 * This is the Shape interface.
 *
 * @author g54915
 */
public interface Shape {

    /**
     * This method moves a shape.
     *
     * @param dx x after the move.
     * @param dy y after the move.
     */
    void move(double dx, double dy);

    /**
     * This method checks if a given point is inside of ths Shape or not.
     *
     * @param p a given point.
     * @return true if the point is inside and false otherwise.
     */
    boolean isInside(Point p);

    /**
     * Simple getter of color.
     *
     * @return a display character.
     */
    char getColor();
}
