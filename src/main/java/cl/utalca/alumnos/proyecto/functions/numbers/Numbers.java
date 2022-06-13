package cl.utalca.alumnos.proyecto.functions.numbers;

import cl.utalca.alumnos.proyecto.functions.Draw;
import javafx.scene.canvas.GraphicsContext;

public class Numbers extends Draw {
	public static void draw(int number, GraphicsContext gc, int posX, int posY) {
		switch (number) {
			case 1 -> {
				String[] coords1 = {"mT 15 100", "lT 15 140"};
				drawNum(gc, posX, posY, coords1);
			}
			case 2 -> {
				String[] coords2 = {"mT 10 100", "lT 30 100", "lT 30 120", "lT 10 120", "lT 10 140", "lT 30 140"};
				drawNum(gc, posX, posY, coords2);
			}
			case 3 -> {
				String[] coords3 = {"mT 10 100", "lT 30 100", "lT 30 120", "lT 10 120", "lT 10 120", "mT 30 120", "lT 30 140", "lT 10 140", "lT 10 140"};
				drawNum(gc, posX, posY, coords3);
			}
			case 4 -> {
				String[] coords4 = {"mT 10 100", "lT 10 120", "lT 30 120", "lT 30 100", "lT 30 140"};
				drawNum(gc, posX, posY, coords4);
			}
			case 5 -> {
				String[] coords5 = {"mT 30 100", "lT 10 100", "lT 10 120", "lT 30 120", "lT 30 140", "lT 10 140"};
				drawNum(gc, posX, posY, coords5);
			}
			case 6 -> {
				String[] coords6 = {"mT 30 100", "lT 10 100", "lT 10 120", "lT 30 120", "lT 30 140", "lT 10 140", "lT 10 120"};
				drawNum(gc, posX, posY, coords6);
			}
			case 7 -> {
				String[] coords7 = {"mT 10 100", "lT 30 100", "lT 30 140"};
				drawNum(gc, posX, posY, coords7);
			}
			case 8 -> {
				String[] coords8 = {"mT 10 100", "lT 30 100", "lT 30 140", "lT 10 140", "lT 10 100", "mT 10 120", "lT 30 120"};
				drawNum(gc, posX, posY, coords8);
			}
			case 9 -> {
				String[] coords9 = {"mT 30 140", "lT 30 100", "lT 10 100", "lT 10 120", "lT 30 120"};
				drawNum(gc, posX, posY, coords9);
			}
			default -> {
				String[] coords = {"mT 10 100", "lT 30 100", "lT 30 140", "lT 10 140", "lT 10 100"};
				drawNum(gc, posX, posY, coords);
			}
		}
	}
}
