package Practica7;

/**
 * Created by Joshua on 05/10/2016.
 */

public class Main {
    public static void main (String[] args){
        Student student = new Student();


        Interfaç i1 = new Miquel();
        Interfaç i2 = new Pep();

        i1.addStrudent(student);
        i2.addStrudent(student);
    }
}