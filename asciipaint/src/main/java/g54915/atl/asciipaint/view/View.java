/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.view;

/**
 * This is the View class.
 *
 * @author g54915
 */
public class View {

    /**
     * This method displays the title of the application.
     */
    public void displayTitle() {
        System.out.println("            [ASCIIPAINT]");
    }

    /**
     * This method displays the available commands of the application.
     */
    public void displayCommands() {
        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("Available Commands:");
        System.out.println("");
        System.out.println("#shapes - shows how to add a shape properly to the list");
        System.out.println("#surface - shows the available surface to draw on");
        System.out.println("#add - adds a shape to the list of shapes");
        System.out.println("#show - shows the shape(s)");
        System.out.println("#commands - displays the available commands");
        System.out.println("#exit - leaves the application");
    }

    /**
     * This method displays how to add a shape properly.
     */
    public void displayAddingShapes() {
        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("add circle 'x' 'y' 'radius' 'color'");
        System.out.println("add rectangle 'x' 'y' 'width' 'height' 'color'");
        System.out.println("add square 'x' 'y' 'side' 'color'");
    }

    /**
     * This method displays the available surface to draw on.
     *
     * @param height height of the sruface.
     * @param width width of the sruface.
     */
    public void displayAvailableSurface(int height, int width) {
        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
    }

    /**
     * This method asks the user to enter a command.
     */
    public void displayEnterCommand() {
        System.out.println("______________________________________");
        System.out.println("Enter a command :");
    }

    //@srv ajouter displayDrawing(Drawing drawing) ...
}
