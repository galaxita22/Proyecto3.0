package cl.utalca.alumnos.proyecto.controllers.helper;

import cl.utalca.alumnos.proyecto.controllers.Controller;
import cl.utalca.alumnos.proyecto.functions.numbers.Numbers;
import cl.utalca.alumnos.proyecto.functions.operators.Operators;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Objects;

public class ReDraw {
	public static void reDraw(ArrayList<String> text, GraphicsContext gc, int posX, int posY) {
		for (int i = 0; i < text.size(); i++) {
			if (Objects.equals(text.get(i), "+") || Objects.equals(text.get(i), "-") || Objects.equals(text.get(i), "*") || Objects.equals(text.get(i), "/") || Objects.equals(text.get(i), "(") || Objects.equals(text.get(i), ")")) {
				Operators.draw(text.get(i), gc, posX, posY);
			} else {
				int num = Integer.parseInt(text.get(i));
				Numbers.draw(num, gc, posX, posY);
			}
			posX += 30;
		}
	}
}
