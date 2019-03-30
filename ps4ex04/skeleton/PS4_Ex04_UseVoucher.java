/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #04: PS4_Ex04_UseVoucher.java
 * 
 * This program helps Mr. Tan to use a couple of vouchers
 * wisely together with cash such that there is no overpay anytime.
 * 
 * <Type your name here>
 */

import java.util.*;

class UseVoucher {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter voucher name: ");
    String voucher=sc.next();
    
    System.out.print("Enter voucher face value: $");
    int value=sc.nextInt();
    
    System.out.print("Enter the number of vouchers: ");
    int amount=sc.nextInt();
    
    Voucher v = new Voucher(voucher, value, amount);
    
    // create a Voucher object with 3 values read
    
    
    System.out.print("Enter the price to pay: $");
    int price=sc.nextInt();
    int cash=0;
    int used=0;
    if(price<value*amount){
      if(price<value){
        cash=price;
         used=0;
      }else{
        used=v.getAmt(price);
         cash=v.useVoucher(price);
      }
    }else{
      used=amount;
      cash=price-(value*amount);
    }
        
    
    // Call userVoucher() method to compute the number
    // of vouchers to be used
    
    
    System.out.println("Use " +used+" " +voucher +  " voucher(s)");
    System.out.println("Cash payment: $"+cash );
    System.out.println("There remains " + (amount - used) +" voucher(s)");
  }
}