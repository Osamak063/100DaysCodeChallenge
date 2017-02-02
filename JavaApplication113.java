/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication113;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n,b,size=0,index=0,sum=0,a=0;
     int [] array;
     int test=in.nextInt();
     for(int i=0;i<test;i++){
     a=0;
     n=Integer.parseInt(in.next());
     b=Integer.parseInt(in.next());
     if(n<b){
     size=(b-n)-1;
     size=size+n;
     array= new int[size];
     a=0;
     for(int j=0;j<n;j++){
         a= Integer.parseInt(in.next());
         array[j]=a;
     }
     index=0;
     for(int j=n;j<array.length;j++){
         array[j]=array[index];
         index++;
     }
     sum=0;
     for(int k=0;k<array.length;k++){
           sum=sum+array[k];
     }
         System.out.println(sum);
     }
     else if(n>b){
     array= new int[n];
     a=0;
     for(int j=0;j<n;j++){
      a= Integer.parseInt(in.next());
         array[j]=a;
     }
     sum=0;
     for(int j=0;j<b-1;j++){
      sum=sum+array[j];
     }
         System.out.println(sum);
     }
     }
        
   
 
}
    }   
