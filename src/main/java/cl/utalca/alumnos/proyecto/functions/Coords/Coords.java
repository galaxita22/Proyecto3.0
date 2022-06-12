package cl.utalca.alumnos.proyecto.functions.Coords;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import cl.utalca.alumnos.proyecto.controllers.Controller;
import javafx.scene.paint.Color;

import static cl.utalca.alumnos.proyecto.functions.Draw.drawOper;

public class Coords {
    public static void DrawCoord(String Coordenadas, GraphicsContext gcCoordenadas, int posX) {
        switch(Coordenadas){
            case "1" -> {
                String[] coords = {"sA 12.5 137.5 5 5 0 360 OPEN", "sA 12.5 97.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords);
            }
            case "2" -> {
                String[] coords2 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords2);
            }
            case "3" -> {
                String[] coords3 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords3);
            }
            case "4" -> {
                String[] coords4 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 177.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords4);
            }
            case "5" -> {
                String[] coords5 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords5);
            }
            case "6" -> {
                String[] coords6 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 7.5 137.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords6);
            }
            case "7" -> {
                String[] coords7 = {"sA 7.5 97.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords7);
            }
            case "8" -> {
                String[] coords8 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords8);
            }
            case "9" -> {
                String[] coords9 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords9);
            }
            case "0" -> {
                String[] coords0 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords0);
            }
            case "+" -> {
                String[] coords = {"sA 17.5 117.5 5 5 0 360 OPEN", "sA 17.5 112.5 5 5 0 360 OPEN","sA 17.5 122.5 5 5 0 360 OPEN","sA 12.5 117.5 5 5 0 360 OPEN","sA 22.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords);
            }
            case "-" -> {

                String[] coords2 = {"sA 12.5 117.5 5 5 0 360 OPEN", "sA 22.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords2);
            }
            case "*" -> {
                String[] coords3 = {"sA 17.5 115 5 5 0 360 OPEN", "sA 22.5 120 5 5 0 360 OPEN", "sA 22.5 115 5 5 0 360 OPEN", "sA 17.5 120 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, coords3);
            }
            case "/" -> {
                String[] coords4 = {"lT 0 150", "lT 40 110"};
                drawOper(gcCoordenadas, posX, coords4);
            }
            case "(" -> {
                String[] coords5 = {"mT 30 100", "sA 15 95 10 50 70 180 OPEN"};
                drawOper(gcCoordenadas, posX, coords5);
            }
            case ")" -> {
                String[] coords6 = {"mT 30 100", "sA 15 95 10 50 280 180 OPEN"};
                drawOper(gcCoordenadas, posX, coords6);
            }
            default -> {
            }
        }
    }

}
