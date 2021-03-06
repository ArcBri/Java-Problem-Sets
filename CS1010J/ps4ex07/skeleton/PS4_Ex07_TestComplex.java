/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #07: PS4_Ex07_TestComplex.java
 * 
 * This program does addition, minus, multiplication and division
 * on two complex numbers.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class TestComplex {
  
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int real=sc.nextInt();
    int imag=sc.nextInt();
    // read and create the first complex number
    
    System.out.println("Complex number ("+real+ " + "+(imag +"i")+ ") created");
    
    Complex num1 = new Complex(real, imag);
    String cmd=sc.next();
   while(cmd.charAt(0)!='q'){
    if(cmd.charAt(0)=='+'){
      int real2=sc.nextInt();
      int imag2=sc.nextInt();
      Complex num2 = new Complex(real2, imag2);
      num1.add(num2);
      System.out.println("After addition: "+num1.toString() );
      cmd=sc.next();
    }else if(cmd.charAt(0)=='-'){
      int real2=sc.nextInt();
      int imag2=sc.nextInt();
      Complex num2 = new Complex(real2, imag2);
      num1.minus(num2);
      System.out.println("After subtraction: "+num1.toString() );
      cmd=sc.next();
    }else if(cmd.charAt(0)=='*'){
      int real2=sc.nextInt();
      int imag2=sc.nextInt();
      Complex num2 = new Complex(real2, imag2);
      num1.multiple(num2);
      System.out.println("After multiplication: " +num1.toString());
      cmd=sc.next();
    }else if(cmd.charAt(0)=='/'){
      int real2=sc.nextInt();
      int imag2=sc.nextInt();
      Complex num2 = new Complex(real2, imag2);
      num1.divide(num2);
      
      System.out.println("After division: " +num1.toString());
      cmd=sc.next();
    }
   }
    // read commands, each followed by a complex number
    // stop when "q" is read
    
    
    
    
    
    
    
    
  }
}