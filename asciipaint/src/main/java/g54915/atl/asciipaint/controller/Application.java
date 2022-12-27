/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54915.atl.asciipaint.controller;

import g54915.atl.asciipaint.model.AsciiPaint;
import g54915.atl.asciipaint.view.View;
import java.util.Scanner;

/**
 * This is the Application class.
 *
 * @author g54915
 */
public class Application {

    private AsciiPaint paint;
    private View v;

    /**
     * This method adds the shape wanted by the user.
     *
     * @param command command entered by the user.
     */
    public void addShape(String[] command) {
        int x = Integer.parseInt(command[2]);
        int y = Integer.parseInt(command[3]);
        String command1 = command[1].toLowerCase();
        switch (command1) {
            case "rectangle":
                double width = Double.parseDouble(command[4]);
                double height = Double.parseDouble(command[5]);
                char color = command[6].charAt(0);
                paint.newRectangle(x, y, width, height, color);
                break;
            case "square":
                int side = Integer.parseInt(command[4]);
                char color1 = command[5].charAt(0);
                paint.newSquare(x, y, side, color1);
                break;
            case "circle":
                int radius = Integer.parseInt(command[4]);
                char color2 = command[5].charAt(0);
                paint.newCircle(x, y, radius, color2);
                break;
        }
    }

    /**
     * This method shows either the drawing or the available commands based on
     * the user's wish.
     *
     * @param command command entered by the user.
     */
    public void showDrawingOrHelp(String command) {
        if (command.equals("show")) {
            try {
                System.out.println(paint.asAscii());
            } catch (Exception e) {
                System.out.println("No added shapes to show.");
            }
        }
        if (command.equals("commands")) {
            v.displayCommands();
        }
    }

    /**
     * This method starts the application and initializes a drawing with a
     * height and a width.
     */
    public void start() {
        Scanner kbd = new Scanner(System.in);
        int width = 100;
        int height = 25;
        v = new View();
        boolean end = false;
        paint = new AsciiPaint(width, height);
        v.displayTitle();
        v.displayCommands();
        while (!end) {
            v.displayEnterCommand();
            String command = kbd.nextLine().toLowerCase();
            String[] splittedCommand = command.split(" ");
            switch (splittedCommand[0]) {
                case "add":
                    try {
                    addShape(splittedCommand);
                } catch (Exception e) {
                    System.out.println("Can't add that.");
                }
                break;
                case "shapes":
                    v.displayAddingShapes();
                    break;
                case "surface":
                    v.displayAvailableSurface(height, width);
                    break;
            }
            showDrawingOrHelp(command);
            if (command.equals(
                    "exit")) {
                end = true;
            }
        }//@srv gérer les erreurs (par ex. try/catch
    }
}
