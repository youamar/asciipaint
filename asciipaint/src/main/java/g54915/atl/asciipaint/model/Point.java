/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
//@srv SUPPRIMEr les commentaires netbeans automatiques

package g54915.atl.asciipaint.model;

/**
 * Represents a Point with x and y coordinate.
 *
 * @author g54915
 */
public class Point {

    private double x;
    private double y;

    /**
     * Simple constructor of a Point.
     *
     * @param x the x coordinate of the point.
     * @param y the y coordinate of the point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Simple constructor of a Point with a given one.
     *
     * @param p a given point.
     */
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * This method moves a point.
     *
     * @param dx coordinate x after the move.
     * @param dy coordinate y after the move.
     */
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * Simple getter of x.
     *
     * @return coordinate x.
     */
    public double getX() {
        return x;
    }

    /**
     * Simple getter of y.
     *
     * @return coordinate y.
     */
    public double getY() {
        return y;
    }

    /**
     * This method calculates the distance between two points.
     *
     * @param other a point.
     * @return the distance between two points.
     */
    public double distanceTo(Point other) {
        return (Math.sqrt(Math.pow((other.x - this.x), 2)) 
                + Math.pow(other.y - this.y, 2));
    }
}
