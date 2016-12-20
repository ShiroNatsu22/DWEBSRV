package Practica5;

import Practica5.FiguraGeometrica;

import java.awt.Color;

public class Cercle extends FiguraGeometrica {
   private double radi=0;

   public Cercle (int ncodi, String nnom, Color ncolor, double nradi) {
      super (ncodi, nnom, ncolor);
       this.radi = nradi;
   }





   public void setRadi (double nouRadi) {
      if (nouRadi>=0) radi = nouRadi;
   }

   public double getRadi () {
      return radi;
   }

   public double perimetre () {
      return 2*Math.PI*radi;
   }

   public double area () {
      return Math.PI * radi * radi;
   }

   public void visualitzar () {
      System.out.println ("Soc un cercle");
      System.out.println ("*************");

      System.out.println ("Radi..........:" + radi);
      System.out.println ("Longitud......:" + perimetre());
      System.out.println ("Area..........:" + area());
   }

   public static void main (String args[]) {

      Cercle c = new Cercle (1, "Cercle", Color.red, 50);
      c.visualitzar();
   }
}