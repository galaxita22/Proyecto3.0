package cl.utalca.alumnos.proyecto.functions.Coords;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import cl.utalca.alumnos.proyecto.controllers.Controller;
import javafx.scene.paint.Color;

import static cl.utalca.alumnos.proyecto.functions.Draw.drawOper;

public class Coords {
    public static void DrawCoord(String Coordenadas, GraphicsContext gcCoordenadas, int posX, int posY) {
        switch(Coordenadas){
            case "1" -> {
                String[] coords = {"sA 12.5 137.5 5 5 0 360 OPEN", "sA 12.5 97.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords);
            }
            case "2" -> {
                String[] coords2 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords2);
            }
            case "3" -> {
                String[] coords3 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords3);
            }
            case "4" -> {
                String[] coords4 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords4);
            }
            case "5" -> {
                String[] coords5 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords5);
            }
            case "6" -> {
                String[] coords6 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 7.5 137.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords6);
            }
            case "7" -> {
                String[] coords7 = {"sA 7.5 97.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords7);
            }
            case "8" -> {
                String[] coords8 = {"sA 27.5 97.5 5 5 0 360 OPEN","sA 7.5 97.5 5 5 0 360 OPEN", "sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN","sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords8);
            }
            case "9" -> {
                String[] coords9 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 117.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 117.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords9);
            }
            case "0" -> {
                String[] coords0 = {"sA 7.5 97.5 5 5 0 360 OPEN","sA 7.5 137.5 5 5 0 360 OPEN", "sA 27.5 97.5 5 5 0 360 OPEN", "sA 27.5 137.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords0);
            }
            case "+" -> {
                String[] coords = {"sA 17.5 117.5 5 5 0 360 OPEN", "sA 17.5 112.5 5 5 0 360 OPEN","sA 17.5 122.5 5 5 0 360 OPEN","sA 12.5 117.5 5 5 0 360 OPEN","sA 22.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords);
            }
            case "-" -> {

                String[] coords2 = {"sA 12.5 117.5 5 5 0 360 OPEN", "sA 22.5 117.5 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords2);
            }
            case "*" -> {
                String[] coords3 = {"sA 17.5 115 5 5 0 360 OPEN", "sA 22.5 120 5 5 0 360 OPEN", "sA 22.5 115 5 5 0 360 OPEN", "sA 17.5 120 5 5 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords3);
            }
            case "/" -> {
                String[] coords4 = {"lT 0 150", "lT 40 110"};
                drawOper(gcCoordenadas, posX, posY, coords4);
            }
            case "(" -> {
                String[] coords5 = {"mT 30 100", "sA 15 95 10 50 70 180 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords5);
            }
            case ")" -> {
                String[] coords6 = {"mT 30 100", "sA 15 95 10 50 280 180 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords6);
            }
            case "Sin" -> {
                String[] coords7S = {"sA 27.5 118.5 3 3 0 360 OPEN","sA 13.5 118.5 3 3 0 360 OPEN","sA 13.5 128.5 3 3 0 360 OPEN", "sA 27.5 128.5 3 3 0 360 OPEN","sA 27.5 138.5 3 3 0 360 OPEN", "sA 13.5 138.5 3 3 0 360 OPEN" };
                drawOper(gcCoordenadas, posX, posY, coords7S);
                String[] coords7I = {"sA 38.5 118.5 3 3 0 360 OPEN","sA 38.5 137.5 3 3 0 360 OPEN" };
                drawOper(gcCoordenadas, posX, posY, coords7I);
                String[] coords7N = {"sA 48.5 138.5 3 3 0 360 OPEN","sA 48.5 118.5 3 3 0 360 OPEN","sA 63.5 138.5 3 3 0 360 OPEN","sA 63.5 118.5 3 3 0 360 OPEN" };
                drawOper(gcCoordenadas, posX, posY, coords7N);
            }
            case "Cos" -> {
                String[] coords8C = {"sA 27.5 118.5 3 3 0 360 OPEN", "sA 15.5 118.5 3 3 0 360 OPEN", "sA 15.5 138.5 3 3 0 360 OPEN", "sA 27.5 138.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords8C);
                String[] coords8O = {"sA 33.5 138.5 3 3 0 360 OPEN", "sA 33.5 118.5 3 3 0 360 OPEN", "sA 47.5 118.5 3 3 0 360 OPEN", "sA 47.5 138.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords8O);
                String[] coords8S = {"sA 67.5 118.5 3 3 0 360 OPEN", "sA 53.5 118.5 3 3 0 360 OPEN", "sA 53.5 128.5 3 3 0 360 OPEN", "sA 67.5 128.5 3 3 0 360 OPEN", "sA 67.5 138.5 3 3 0 360 OPEN","sA 53.5 138.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords8S);
            }
            case "Tan" -> {
                String[] coords9T = {"sA 8.5 118.5 3 3 0 360 OPEN", "sA 27.5 118.5 3 3 0 360 OPEN", "sA 18.5 113.5 3 3 0 360 OPEN", "sA 18.5 138.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords9T);
                String[] coords9A = {"sA 33.5 138.5 3 3 0 360 OPEN", "sA 43.5 118.5 3 3 0 360 OPEN", "sA 53.5 138.5 3 3 0 360 OPEN", "sA 48.5 128.5 3 3 0 360 OPEN", "sA 38.5 128.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords9A);
                String[] coords9N = {"sA 58.5 138.5 3 3 0 360 OPEN", "sA 58.5 118.5 3 3 0 360 OPEN", "sA 73.5 138.5 3 3 0 360 OPEN", "sA 73.5 118.5 3 3 0 360 OPEN"};
                drawOper(gcCoordenadas, posX, posY, coords9N);
            }
            default -> {
            }
        }
    }

}
