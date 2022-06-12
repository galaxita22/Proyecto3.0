package cl.utalca.alumnos.proyecto.functions.operators;

import cl.utalca.alumnos.proyecto.functions.Draw;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Operators extends Draw {

    public static void draw(String operator, GraphicsContext gc, int posX) {
        switch (operator) {
            case "+" -> {
                String[] coords = {"mT 20 120", "lT 20 115", "lT 20 125", "lT 20 120", "lT 15 120", "lT 25 120"};
                drawOper(gc, posX, coords);
            }
            case "-" -> {
                String[] coords2 = {"lT 15 120", "lT 25 120"};
                drawOper(gc, posX, coords2);
            }
            case "*" -> {
                String[] coords3 = {"lT 20 117.5", "lT 25 122.5", "lT 25 117.5", "lT 20 122.5"};
                drawOper(gc, posX, coords3);
            }
            case "/" -> {
                String[] coords4 = {"lT 0 150", "lT 40 150"};
                drawOper(gc, posX, coords4);
            }
            case "(" -> {
                String[] coords5 = {"mT 30 100", "sA 15 95 10 50 90 180 OPEN"};
                drawOper(gc, posX, coords5);
            }
            case ")" -> {
                String[] coords6 = {"mT 30 100", "sA 15 95 10 50 270 180 OPEN"};
                drawOper(gc, posX, coords6);
            }
            default -> {
            }
        }
    }
}
