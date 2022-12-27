package g54915.atl.asciipaint.model;

/**
 * This is the Circle class.
 *
 * @author g54915
 */
public class Circle extends ColoredShape {

    private double radius;
    private Point center;

    /**
     * Simple constructor of a Circle.
     *
     * @param center a given point representing the center of the circle.
     * @param radius a number representing the radius of the circle.
     * @param color a character representing the color of the circle.
     */
    public Circle(Point center, double radius, char color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive"
                    + ", received: " + radius);
        }
        this.radius = radius;
        this.center = center;
    }

    /**
     * This method checks if a given point is inside of ths Shape or not.
     *
     * @param p a given point.
     * @return true if the point is inside and false otherwise.
     */
    @Override
    public boolean isInside(Point p) {
        return p.distanceTo(center) < radius;
    }

    /**
     * This method moves a shape.
     *
     * @param dx x after the move.
     * @param dy y after the move.
     */
    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

}
