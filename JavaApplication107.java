/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication107;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication107 {
private static int findGCD(int number1, int number2) {  
    if(number2>number1){
    int temp=number1;
    number1=number2;
    number2=temp;
    }
    
   if(number2 == 0)
   { return number1; 
   } 
return findGCD(number2, number1%number2); 
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = new String[10];
        int[] input= new int[100];
         int test,num=0,divisor=0;
       int[] ans= new int[100];
       test=in.nextInt();
     for(int i=0;i<test;i++){
     num=Integer.parseInt(in.next());
     
        for(int j=0;j<num;j++){
        input[j]=Integer.parseInt(in.next());
        }
        // System.out.println(input[1]);
         divisor=0;
       for(int k=0;k<num;k++){
        
       divisor=findGCD(input[k],divisor);
          
       }
       for(int z=0;z<num;z++){
           
       ans[z]=input[z]/divisor;
       System.out.print(ans[z]+" ");
       } 
         System.out.println("");
    }
      
    }
    
}
