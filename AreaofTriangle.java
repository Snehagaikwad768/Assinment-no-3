/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class AreaofTriangle {
    public static void main(String[] args) {
      // sides of a triangle
      double s1, s2, s3;
      double area, resArea;
      // three sides of a triangle
      s1 = 15191235.0;
      s2 = 15191235.0;
      s3 = 1.01235479;
      area = (s1+s2+s3)/2.0d;
      resArea = Math.sqrt(area* (area - s1) * (area - s2) * (area - s3));
      System.out.println("Area of Triangle = " + resArea);
   }
}

