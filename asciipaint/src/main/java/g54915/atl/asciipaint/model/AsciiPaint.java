/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.model;

/**
 * This is the AsciiPaint class.
 *
 * @author g54915
 */
public class AsciiPaint {

    private final Drawing drawing;

    /**
     * Simple constructor of AsciiPaint.
     */
    public AsciiPaint() {
        this.drawing = new Drawing();
    }

    /**
     * Simple constructor of AsciiPaint.
     *
     * @param width width of the drawing.
     * @param height height of the drawing.
     */
    public AsciiPaint(int width, int height) {
        this.drawing = new Drawing(height, width);
    }

    /**
     * This method creates a Circle and adds its shape in the list of shapes.
     *
     * @param x coordinate x of the upper left point.
     * @param y coordinate y of the upper left point.
     * @param radius a number representing the radius of the circle.
     * @param color a character representing the color of the circle.
     */
    public void newCircle(int x, int y, double radius, char color) {
        //@srv vérifiere les params. tout ce qui entre dans le modèle doit être vérifié: radius >0
        Circle circle = new Circle(new Point(x, y), radius, color);
        this.drawing.addShape(circle);
    }

    /**
     * This method creates a Rectangle and adds its shape in the list of shapes.
     *
     * @param x coordinate x of the upper left point.
     * @param y coordinate y of the upper left point.
     * @param width width of the rectangle.
     * @param height height of the rectangle.
     * @param color a character representing the color of the rectangle.
     */
    public void newRectangle(int x, int y, double width, double height, char color) {
        Rectangle rectangle = new Rectangle(new Point(x, y), width, height,
                color);
        this.drawing.addShape(rectangle);
    }

    /**
     * This method creates a Square and adds its shape in the list of shapes.
     *
     * @param x coordinate x of the upper left point.
     * @param y coordinate y of the upper left point.
     * @param side size of a side of the Square.
     * @param color color of the Square.
     */
    public void newSquare(int x, int y, double side, char color) {
        Square square = new Square(new Point(x, y), side, color);
        this.drawing.addShape(square);
    }

    /**
     * Simple getter of the drawing.
     *
     * @return the drawing.
     */
    public Drawing getDrawing() {
        return this.drawing;
    }

    /**
     * This method goes through the drawing and verifys if the shape points are
     * in the list and if they're it adds the color of the shape in the string
     * called "ascii" and adds a space in the string otherwise.
     *
     * @return a string made of the color of the shape or made of spaces.
     */
    public String asAscii() {
        String ascii = "";
        Drawing d = getDrawing();
        int drawHeight = d.getHeight();
        int drawWidth = d.getWidth();
        Point p = new Point(0, drawHeight - 1);

        for (int i = 0; i < drawWidth * drawHeight; i++) {
            Shape s = d.getShape(p);
            if (s != null && s.isInside(p)) {
                ascii += s.getColor();
            } else {
                ascii += " ";
            }
            if (p.getX() == drawWidth - 1) {
                p.move(-p.getX(), -1);
            } else {
                p.move(1, 0);
            }
            if (i % drawWidth == 0) {
                ascii += "\n";
            }
        }
        return ascii;
    }
}
