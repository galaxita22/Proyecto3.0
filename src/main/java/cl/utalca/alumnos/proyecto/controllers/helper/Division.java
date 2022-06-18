package cl.utalca.alumnos.proyecto.controllers.helper;

import cl.utalca.alumnos.proyecto.functions.operators.Operators;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;

public class Division {
	public static int dibujaDivision(ArrayList<String> text, GraphicsContext gc, int posX, int posY) {
		int i = text.size()-1;
		int PA = 0, PC = 0;
		int posXAux = posX;


		if (text.get(i-1).equals(")")) {//comienza el conteo de parentesis para saber donde empezar a dibujar
			posX -= 30;
			i--;
			while(i>=0){
				if (text.get(i).equals(")")) {
					PC++;
					i--;
					posX -= 30;
				}
				if (text.get(i).equals("(")) {
					PA++;//aumenta la variable de parentesis abierto
					if (PA == PC) {// si pa
						posXAux = posX;

						System.out.println(posXAux);
						System.out.println(posX);
						posX -= 30;
						for (int j = i; j < text.size()-1; j++) {
							posX += 30;
							Operators.draw("/", gc, posX, posY);
						}
						break;
					}
					else {
						i--;
						posX -= 30;
					}
				}
				i--;//Resta la posicion del texto para seguir buscando por un parentesis
				posX -= 30;
			}
		}
		else{ 
			while (i >= 0) {
				if (text.get(i).equals("+") || text.get(i).equals("-") || text.get(i).equals("*")) {
					posX += 30;
					posXAux = posX;
					System.out.println("A");
					for (int j = i + 1; j < text.size() - 1; j++) {
						Operators.draw("/", gc, posX, posY );
						posX += 30;
					}
					break;
				}
				if (i == 0) {
					posX = 0;
					posXAux = posX;
					for (int j = 0; j < text.size() - 1; j++) {
						Operators.draw("/", gc, posX, posY);
						posX += 30;
					}
					break;
				}
				else {
					i--;
					posX -= 30;
				}
			}
		}
		posX = posXAux;
	return posX;
	}
}
