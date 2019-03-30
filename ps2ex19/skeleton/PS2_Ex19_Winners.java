/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #19: PS2_Ex19_Winners.java
 * 
 * <Given n numbers, find amount of numbers divisible by f and contains digit m >
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Winners {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter factor-digit: ");
    
    int f= sc.nextInt();
    
    System.out.print("Enter must-have-digit: ");
    
    int m =sc.nextInt(); 
    
    System.out.print("Enter the number of participants: ");
    
    int n=sc.nextInt();
    
    int p; //variable for participant
    int winners=0;
    
    for(p=1; p<n+1; p++){
      if(p%f==0){
        if(contains(p,m)){
          winners++; 
        }
      }
    }
    System.out.println("Number of winners: " + winners);
  }
  
  // Return true if number contains the mustHaveDigit, or false otherwise
  public static boolean contains(int number, int mustHaveDigit) {
    for(int check=number; check>0; check=check/10){ //check>0 to see if there is any single digit numbers that satisfy
      if(check%10==mustHaveDigit){
        return true;
      }
      
    }
    return false;
  }
}



