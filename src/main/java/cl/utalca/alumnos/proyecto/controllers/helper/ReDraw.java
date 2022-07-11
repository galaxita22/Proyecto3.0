package cl.utalca.alumnos.proyecto.controllers.helper;

import cl.utalca.alumnos.proyecto.functions.numbers.Numbers;
import cl.utalca.alumnos.proyecto.functions.operators.Operators;
import cl.utalca.alumnos.proyecto.controllers.Controller;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Objects;

public class ReDraw {
	public static void reDraw(ArrayList<String> text, GraphicsContext gc, int posX, int posY) {
		gc.clearRect(0, 0, 515, 313);
		for (int i = 0; i < text.size(); i++) {
			if (Objects.equals(text.get(i), "+") || Objects.equals(text.get(i), "-") || Objects.equals(text.get(i), "*") || Objects.equals(text.get(i), "(") || Objects.equals(text.get(i), ")")||Objects.equals(text.get(i), "^")) {
				Operators.draw(text.get(i), gc, posX, posY);
			}
			if (Objects.equals(text.get(i), "/")) {
				posY += 60;
				posX -=60;
				Division.dibujaDivision(text, gc, posX, posY);
				//posY+= 60;
				//posX -= 60;
				//Division.dibujaDivision(text, gc, posX, posY);
			}
			if(Objects.equals(text.get(i), "Cos")||Objects.equals(text.get(i), "Sin")||Objects.equals(text.get(i), "Tan")){
				Operators.draw(text.get(i), gc, posX, posY);
				if(Objects.equals(text.get(i), "Tan")){
					posX += 60;
				}
				else{
					posX += 50;
				}
			}
			if(Objects.equals(text.get(i), ".")){
				Operators.draw(text.get(i), gc, posX, posY);
			}
			if(Objects.equals(text.get(i), "√")){
				Operators.draw(text.get(i), gc, posX, posY);
			}
			if(Objects.equals(text.get(i), "0")||Objects.equals(text.get(i), "1")||Objects.equals(text.get(i), "2")||Objects.equals(text.get(i), "3")||Objects.equals(text.get(i), "4")||Objects.equals(text.get(i), "5")||Objects.equals(text.get(i), "6")||Objects.equals(text.get(i), "7")||Objects.equals(text.get(i), "8")||Objects.equals(text.get(i), "9")){
				int num = Integer.parseInt(text.get(i));
				Numbers.draw(num, gc, posX, posY);
			}

			posX += 30;
		}
	}
}
