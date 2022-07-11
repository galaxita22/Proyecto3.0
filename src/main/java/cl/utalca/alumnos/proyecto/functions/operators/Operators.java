package cl.utalca.alumnos.proyecto.functions.operators;

import cl.utalca.alumnos.proyecto.functions.Draw;
import javafx.scene.canvas.GraphicsContext;

public class Operators extends Draw {
	public static void draw(String operator, GraphicsContext gc, int posX, int posY) {
		switch (operator) {
			case "+" -> {
				String[] coords = {"mT 20 120", "lT 20 115", "lT 20 125", "lT 20 120", "lT 15 120", "lT 25 120"};
				drawOper(gc, posX, posY, coords);
			}
			case "-" -> {
				String[] coords2 = {"lT 15 120", "lT 25 120"};
				drawOper(gc, posX, posY, coords2);
			}
			case "*" -> {
				String[] coords3 = {"lT 20 117.5", "lT 25 122.5", "mT 25 117.5", "lT 20 122.5"};
				drawOper(gc, posX, posY, coords3);
			}
			case "/" -> {
				String[] coords4 = {"lT 0 150", "lT 40 150"};
				drawOper(gc, posX, posY, coords4);
			}
			case "(" -> {
				String[] coords5 = {"mT 30 100", "sA 15 95 10 50 90 180 OPEN"};
				drawOper(gc, posX, posY,coords5);
			}
			case ")" -> {
				String[] coords6 = {"mT 30 100", "sA 15 95 10 50 270 180 OPEN"};
				drawOper(gc, posX, posY, coords6);
			}
			case "Sin" -> {
				String[] coords7 = {"mT 30 120", "lT 15 120", "lT 15 130", "lT 30 130", "lT 30 140", "lT 15 140", "mT 40 120", "lT 40 140", "mT 50 140", "lT 50 120", "lT 65 140", "lT 65 120"};
				drawOper(gc, posX, posY, coords7);
				posX+=60;

			}
			case "Cos" -> {
				String[] coords8 = {"mT 30 120", "lT 17 120", "lT 17 140", "lT 30 140", "mT 35 140", "lT 35 120", "lT 50 120", "lT 50 140", "lT 35 140", "mT 70 120", "lT 55 120", "lT 55 130", "lT 70 130", "lT 70 140", "lT 55 140"};
				drawOper(gc, posX, posY, coords8);
				posX+=60;

			}
			case "Tan" -> {
				String[] coords9 = {"mT 10 120", "lT 30 120", "mT 20 115", "lT 20 140", "mT 35 140", "lT 45 120", "lT 55 140", "mT 50 130", "lT 40 130", "mT 60 140", "lT 60 120", "lT 75 140", "lT 75 120"};
				drawOper(gc, posX, posY, coords9);
				posX+=70;

			}
			case "°" -> {
				String[] coordsgr = {"sA 10 90 5 5 0 360 OPEN"};
				drawOper(gc, posX, posY, coordsgr);
			}
			case "x!" -> {
				String[] coordsFac = {"mT 10 100", "lT 10 134", "sA 7.5 140 5 5 0 360 OPEN"};
				drawOper(gc, posX, posY, coordsFac);
			}
			case "." -> {
				String[] coordsComa = {"sA 7.5 140 5 5 0 360 OPEN"};
				drawOper(gc, posX, posY, coordsComa);
			}
			case "√" -> {
				String[] coords = {"mT 5 125", "lT 10 145", "lT 20 85", "lT 50 85"};
				drawOper(gc, posX, posY, coords);
			}
			case "_" -> {
				String[] coordsR = {"mT 0 85", "lT 30 85"};
				drawOper(gc, posX, posY, coordsR);
			}
			default -> {
			}
		}
	}
}
