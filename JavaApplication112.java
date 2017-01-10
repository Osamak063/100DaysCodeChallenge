/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication112;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int[] ans = new int[100];
      int input;
      int test= in.nextInt();
      for(int i=0;i<test;i++){
      input=in.nextInt();
      if(input==1){
          System.out.println("4LB");
      }
      if(input==2){
          System.out.println("5MB");
      }
      if(input==3){
          System.out.println("6UB");
      }
      if(input==4){
          System.out.println("1LB");
      }
      if(input==5){
          System.out.println("2MB");
      }
      if(input==6){
          System.out.println("3UB");
      }
      if(input==7){
          System.out.println("8SU");
      }
      if(input==8){
          System.out.println("7SL");
      }
      }
    }
    
}
