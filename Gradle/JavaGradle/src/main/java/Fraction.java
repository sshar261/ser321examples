import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      if(denominator !=0) {
         this.denominator = denominator;
      } else {
         System.out.println("Denominator can not be 0");
         System.exit(0);
      }
   }

   public Fraction() {
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         if(args.length == 0) {
         Fraction frac = new Fraction(num,den);
         frac.setNumerator(1);
         frac.setDenominator(3);
         } else {
         int num = Integer.parseInt(args[0]);
         int den = Integer.parseInt(args[1]);
         Fraction frac = new Fraction(num, den);
         }

         

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

