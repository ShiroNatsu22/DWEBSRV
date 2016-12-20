package Practica5;

import java.awt.*;

public abstract class FiguraGeometrica {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;



   public FiguraGeometrica(int codi, String nom, Color color) {
      this.codi = codi;
      this.nom = nom;
      this.color = color;
   }

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }

   public int getCodi () {
      return codi;
   }

   public String getNom () {
      return nom;
   }

   public Color getColor () {
      return color;
   }



   @Override
   public String toString() {
      return "FiguraGeometrica{" +
              "codi=" + codi +
              ", nom='" + nom + '\'' +
              ", color=" + color +
              '}';
   }



}