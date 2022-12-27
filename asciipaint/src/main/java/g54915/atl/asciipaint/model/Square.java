/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

/**
 * This is the Square class.
 *
 * @author g54915
 */
public class Square extends Rectangle {

    /**
     * Simple constructor of a Square
     *
     * @param upperLeft point representing the upper left part of the Square.
     * @param side size of a side of the Square.
     * @param color color of the Square.
     */
    public Square(Point upperLeft, double side, char color) {
        super(upperLeft, side, side, color);
    }
}
