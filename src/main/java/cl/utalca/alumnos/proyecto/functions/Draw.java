package cl.utalca.alumnos.proyecto.functions;

import cl.utalca.alumnos.proyecto.controllers.Controller;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Draw {
    //private static final int[] valores = {0,30,60,90,120,150,180,210,240,270};

    /*dibujos para num y oper
//    la altura está entre 100 y 140*/
    public static double size, sizeY;
    public static void setSize(double size) {
        Draw.size = size;
    }
    public static void setSizeY(double sizeY) {
        Draw.sizeY = sizeY;
    }

    public static void drawNum(GraphicsContext gc, int posX, int posY, String[] numbers) {
        gc.beginPath();
        Color colorNumber = Controller.getColorNum();

        // lT AA BB -> lineTo(AA,BB)
        // mT AA BB -> moveTo(AA,BB)
        for (String number : numbers) {
            double start = Integer.parseInt(number.split(" ")[1]) + posX;
            double end = Integer.parseInt(number.split(" ")[2]) + posY;

            if (number.contains("lT")) {
                gc.lineTo(start, end);
            } else {
                gc.moveTo(start, end);
            }
        }

        gc.setStroke(colorNumber);
        gc.stroke();
    }

    public static void drawOper(GraphicsContext gc, int posX, int posY, String[] operators) {
        gc.beginPath();
        Color colorOp = Controller.getColorOp();

        // lT AA BB -> lineTo(AA,BB)
        // mT AA BB -> moveTo(AA,BB)
        // sA AA BB -> strokeArc(AA,BB,CC,DD,EE,FF,TYPE)

        for (String operator : operators) {
            double start = Double.parseDouble(operator.split(" ")[1]) + posX; //->AA
            double end = Double.parseDouble(operator.split(" ")[2]); //->BB

            if (operator.contains("lT")) {
                gc.lineTo(start, end);
            } else if (operator.contains("mT")) {
                gc.moveTo(start, end);
            } else {
                double CC = Double.parseDouble(operator.split(" ")[3]);
                double DD = Double.parseDouble(operator.split(" ")[4]);
                double EE = Double.parseDouble(operator.split(" ")[5]);
                double FF = Double.parseDouble(operator.split(" ")[6]);

                ArcType TYPE = ArcType.valueOf(operator.split(" ")[7]);

                gc.strokeArc(start, end, CC, DD, EE, FF, TYPE);
            }
        }

        gc.setStroke(colorOp);
        gc.stroke();

    }

}
