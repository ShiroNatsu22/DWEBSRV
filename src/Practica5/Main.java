package Practica5;

import java.awt.*;

/**
 * Created by Joshua on 20/12/2016.
 */

public class Main {
    public static void main (String[] args){
        Cercle c = new Cercle(3,"Cercle",Color.black,2);
        c.visualitzar();

        Rectangle r = new Rectangle (1, "Rectangle", Color.blue, 5,8);
        r.visualitzar();

        Triangle t = new Triangle(1, "Triangle", Color.blue, 5,8);
        t.visualitzar();
    }
}