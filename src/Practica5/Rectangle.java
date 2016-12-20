package Practica5;

import Practica5.FiguraGeometrica;
import com.sun.org.apache.regexp.internal.RE;

import java.awt.Color;

public class Rectangle extends FiguraGeometrica {
   private double base=0, altura=0;

   public Rectangle (int ncodi, String nnom, Color ncolor, double nbase, double naltura) {
      super (ncodi, nnom, ncolor);
      if (nbase>0) base=nbase;
      if (naltura>0) altura=naltura;
   }


   public Rectangle (Rectangle r) {
      this (r.codi, r.nom, r.color, r.base, r.altura);
   }

   public void setBase (double novaBase) {
      if (novaBase>=0) base = novaBase;
   }

   public void setAltura (float novaAltura) {
      if (novaAltura>=0) altura = novaAltura;
   }

   public double getBase() {
      return base;
   }

   public double getAltura() {
      return altura;
   }

   public double perimetre () {
      return base*2+altura*2;
   }

   public double area () {
      return base*altura;
   }

   public void visualitzar () {
      System.out.println ("S�c un rectangle");
      System.out.println ("****************");
      System.out.println ("Base..........:" + base);
      System.out.println ("Altura........:" + altura);
      System.out.println ("Per�metre.....:" + perimetre());
      System.out.println ("�rea..........:" + area());
   }



   public static void main (String args[]) {

            Rectangle r = new Rectangle (1, "Rectangle", Color.blue, 5,8);
            r.visualitzar();

         }



}