package cl.utalca.alumnos.proyecto.controllers;

import cl.utalca.alumnos.proyecto.Main;
import cl.utalca.alumnos.proyecto.controllers.helper.Division;
import cl.utalca.alumnos.proyecto.controllers.helper.ReDraw;
import cl.utalca.alumnos.proyecto.functions.Coords.Coords;
import cl.utalca.alumnos.proyecto.functions.Draw;
import cl.utalca.alumnos.proyecto.functions.numbers.Numbers;
import cl.utalca.alumnos.proyecto.functions.operators.Operators;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	private static int posX, posY;

	@FXML
	private TextField textInput;
	public int statusA = 2, statusB = 2, statusParentesis = 0, posXDenominador, posXNumerador, PAdiv, PCdiv;
	public ArrayList<String> text = new ArrayList<>();
	//StatusA = evitar poner 2 operadores seguidos
	//StatusB = auxiliar de A

	@FXML
	private ColorPicker ColorPickerNumber;
	@FXML
	private ColorPicker ColorPickerOperator;
	public static Color currentColorNumber;
	public static Color currentColorOperator;

	@FXML
	public Canvas canvas;
	@FXML
	public Canvas canvasCoordenadas;

	private GraphicsContext gc;
	private GraphicsContext gcCoordenadas;
	private int ContCoord = 0;
	private int Base = 0;
	private String size = "N";

	@FXML
	Button Standard;
	@FXML
	Button Scientific;

	public void ClickBorrarTodo(ActionEvent borratodo) {
		textInput.setText("");
		statusA = 2;
		statusB = statusA;
		gc.clearRect(0, 0, 515, 313);
		gcCoordenadas.clearRect(0, 0, 515, 313);
		ContCoord = 0;
		Base = 0;
		posX = 0;
		posY = 0;
		text.clear();
	}

	public void ClickBorrar(ActionEvent borrauno) {
		String borrar = textInput.getText();
		if (borrar != null && borrar.length() > 0) {
			borrar = borrar.substring(0, borrar.length() - 1);
			textInput.setText(borrar);
			statusA = statusB;
			System.out.println(text);
			text.remove(text.size() - 1);
			gc.clearRect(0, 0, 515, 313);

			posX = 0;
			posY = 0;


			ReDraw.reDraw(text, gc, posX, posY);

			if (text.size() == 0) {
				gcCoordenadas.clearRect(0, 0, 515, 313);
			}
		}
	}

	public void ClickCambioBase(ActionEvent cambioBase) {
		if (Base == 0) {
			//Si se apreta el botón, el canvas se borra
			gc.clearRect(0, 0, 515, 313);

			posX = 0;
			int textosize = 0;
			StringBuilder builder = new StringBuilder();

			//Mientras la variable contador sea menor o igual al tamaño del array texto
			while (textosize <= text.size()) {
				//Si el siguiente index del contador es mayor al tamaño del array imprime lo último guardado del stringbuilder
				if (textosize + 1 > text.size()) {
					String num = Integer.toBinaryString(Integer.parseInt(builder.toString()));

					for (int i = 0; i < num.length(); i++) {
						Numbers.draw(Integer.parseInt(String.valueOf(num.charAt(i))), gc, posX, posY);
						posX += 30;
					}
					//Aumentamos la base pues no hay nada mas para transformar
					Base++;
					return;
				}

				//Si encontramos un operador en el índice del contador
				if (text.get(textosize).matches("\\+|-|\\*|/|")) { //TODO: Comparar a más operadores
					//Se imprime primero el número que está antes del operador
					String num = Integer.toBinaryString(Integer.parseInt(builder.toString()));

					for (int i = 0; i < num.length(); i++) {
						Numbers.draw(Integer.parseInt(String.valueOf(num.charAt(i))), gc, posX, posY);
						posX += 30;
					}
					//Se imprime el operador
					Operators.draw(text.get(textosize), gc, posX, posY);
					posX += 30;
					//Reiniciamos el stringBuilder pues no ha terminado de escanear
					builder = new StringBuilder("");
				}

				//Si el indice del array coincide con un dígito (\\d) entonces lo agregamos al stringBuilder
				if (text.get(textosize).matches("\\d")) {
					builder.append(text.get(textosize));
				}

				textosize++;
			}
		} else {
			int posXAux = posX;
			gc.clearRect(0, 0, 515, 313);
			posX = 0;
			ReDraw.reDraw(text, gc, posX, posY);
			posX = posXAux;
			Base = 0;
		}
	}

	public void ClickSize(ActionEvent size){
		this.size = ((Button) size.getSource()).getText();
		switch (this.size) {
			case "MP":
				Draw.setSize(0.25);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "P":
				Draw.setSize(0.5);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "G":
				Draw.setSize(1.25);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "MG":
				Draw.setSize(1.5);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			default:
				Draw.setSize(1);
				Draw.setSizeY(1);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
		}
	}

	public void ClickCambioCientifica(ActionEvent cambioescena) throws IOException {
		Main.cambiarEscena("Scientific");
		posX =0;
	}

	public void ClickCambioEstandar(ActionEvent cambioescena) throws IOException {
		Main.cambiarEscena("Standard");
		posX=0;
	}

	public void ClickCambioColor(ActionEvent cambiocolor) {
		Controller.setColorNum(ColorPickerNumber.getValue());
		Color test = ColorPickerNumber.getValue();
		System.out.println(test);

		Controller.setColorOp(ColorPickerOperator.getValue());
		Color test2 = ColorPickerOperator.getValue();
		System.out.println(test2);
		int posXAux = posX;
		posX = 0;
		posY = 0;

		ReDraw.reDraw(text, gc, posX, posY);
		posX = posXAux;
	}

	public static void setColorNum(Color colorNumber) {//setter de color de numeros
		currentColorNumber = colorNumber;
	}

	public static Color getColorNum() {//getter de color de numeros
		return currentColorNumber;
	}

	public static void setColorOp(Color colorOperator) {//setter de color de operadores
		currentColorOperator = colorOperator;
	}

	public static Color getColorOp() {//getter de color de operadores
		return currentColorOperator;
	}

	public void ClickCoordenadas(ActionEvent coord) {
		if (ContCoord == 0) {
			posX = 0;
			for (int i = 0; i < text.size(); i++) {
				Coords.DrawCoord(text.get(i), gcCoordenadas, posX, posY);
				if (text.get(i).equals("Sin") || text.get(i).equals("Cos") || text.get(i).equals("Tan")){
				posX += 80;
				ContCoord++;}
				else{
					posX+=30;
					ContCoord++;

				}
			}
		} else {
			gcCoordenadas.clearRect(0, 0, 515, 313);
			ContCoord = 0;
		}
	}

	public void ClickNumero(ActionEvent num) {
		String numero = ((Button) num.getSource()).getText();
		textInput.setText(textInput.getText() + numero);
		text.add(numero);
		statusB = statusA;
		statusA = 1;

		if(posY != 0){
			posXDenominador +=30;
			if(posXDenominador > posXNumerador){
				Operators.draw("/", gc, posX, posY+60);
			}
		}
		switch (this.size) {
			case "MP":
				Draw.setSize(0.25);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "P":
				Draw.setSize(0.5);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "G":
				Draw.setSize(1.25);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			case "MG":
				Draw.setSize(1.5);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
			default:
				Draw.setSize(1);
				Draw.setSizeY(1);
				gc.clearRect(0, 0, 515, 313);
				ReDraw.reDraw(text, gc, 0, posY);
				break;
		}
		switch (numero) {
			case "1" -> {
				Numbers.draw(1, gc, posX, posY);
				posX += 30;

			}
			case "2" -> {
				Numbers.draw(2, gc, posX, posY);
				posX += 30;

			}
			case "3" -> {
				Numbers.draw(3, gc, posX, posY);
				posX += 30;

			}
			case "4" -> {
				Numbers.draw(4, gc, posX, posY);
				posX += 30;

			}
			case "5" -> {
				Numbers.draw(5, gc, posX, posY);
				posX += 30;

			}
			case "6" -> {
				Numbers.draw(6, gc, posX, posY);
				posX += 30;

			}
			case "7" -> {
				Numbers.draw(7, gc, posX, posY);
				posX += 30;

			}
			case "8" -> {
				Numbers.draw(8, gc, posX, posY);
				posX += 30;

			}
			case "9" -> {
				Numbers.draw(9, gc, posX, posY);
				posX += 30;

			}
			default -> {
				if (posY != 60) {
					Numbers.draw(0, gc, posX, posY);
					posX += 30;
				}
			}
		}
	}

	public void ClickTrigonometrica(ActionEvent trig){
		String operador = ((Button) trig.getSource()).getText();
		textInput.setText(textInput.getText() + operador);
		text.add(operador);
		statusParentesis ++;

		switch(operador){
			case "Sin" -> {
				Operators.draw("Sin", gc, posX, posY);
				posX+=80;
			}
			case "Cos" -> {
				Operators.draw("Cos", gc, posX, posY);
				posX+=80;
			}
			case "Tan" -> {
				Operators.draw("Tan", gc, posX, posY);
				posX+=90;
			}
			case "-" -> {
				Operators.draw("-", gc, posX, posY);
				posX += 30;
				posY = 0;
			}
			case "!" -> {
				Operators.draw("x!", gc, posX, posY);
				posX += 15;
				posY = 0;
			}
		}
	}

	public void ClickOperadores(ActionEvent oper) {
		if (statusA != 2 ) {
			String operador = ((Button) oper.getSource()).getText();
			textInput.setText(textInput.getText() + operador);
			text.add(operador);
			statusB = statusA;
			statusA = 2;

			/*switch (operador) {
				case "+" -> {

					posY = 0;
				}
				case "*" -> {
					posY= 0;
				}
			}*/
			switch (this.size) {
				case "MP":
					Draw.setSize(1/4);
					break;
				case "P":
					Draw.setSize(0.5);
					break;
				case "G":
					Draw.setSize(1.25);
					break;
				case "MG":
					Draw.setSize(1.5);
					break;
				default:
					Draw.setSize(1);
					Draw.setSizeY(1);
					break;
			}
			switch (operador) {
				case "+" -> {
					Operators.draw("+", gc, posX, posY);
					posX += 30;
					posY = 0;

				}
				case "*" -> {
					Operators.draw("*", gc, posX, posY);
					posX += 30;
					posY = 0;

				}
				case "/" -> {
					posXDenominador = posX;
					Division.dibujaDivision(text, gc, posX, posY);
					posY += 60;
					this.posX = Division.dibujaDivision(text, gc, posX, posY);//this.posX = posX2; se utiliza para que el operador se dibuje en la misma linea que la division
					System.out.println(posX);
					int posXNumerador = posX;
					posXNumerador =posXDenominador - posXNumerador;
				}
				case "°" -> {
					Operators.draw("°", gc, posX, posY);
					posX +=15;
				}
			}
		}
			if(posY > 0){
			posXDenominador +=30;
				if(posXDenominador > posXNumerador){
					Operators.draw("/", gc, posX, posY +60);
				}
			}
		}

	public void ClickPrimerParentesis(ActionEvent par) {
		String parentesis = ((Button) par.getSource()).getText();
		textInput.setText(textInput.getText() + parentesis);
		statusB = statusA;
		statusA = 3;
		text.add(parentesis);
		statusParentesis += 1;

		Operators.draw("(", gc, posX, posY);
		posX += 30;
	}

	public void ClickSegundoParentesis(ActionEvent par2) {
		String parentesis = ((Button) par2.getSource()).getText();
		if (statusParentesis > 0) {//si hay un parentesis abierto
			statusParentesis -= 1;
			textInput.setText(textInput.getText() + parentesis);
			statusB = statusA;
			statusA = 3;
			text.add(parentesis);
			Operators.draw(")", gc, posX, posY);
			posX += 30;
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		gc = canvas.getGraphicsContext2D();
		gcCoordenadas = canvasCoordenadas.getGraphicsContext2D();
	}

}