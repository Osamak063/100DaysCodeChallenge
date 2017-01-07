/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Scanner;

/**
 *
 * @auth
 * or Osama Khalid
 */
public class JavaApplication109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int test=in.nextInt(); 
         int q,p;
         double off=0.1,ans=0,temp=0;
         double[] count = new double[100];
       for(int k=0;k<test;k++){
           q=Integer.parseInt(in.next());
           p=Integer.parseInt(in.next());
           ans=q*p;
           if(q>1000){
           temp=off*ans;
           ans=ans-temp;
           count[k]=ans;
           }
           else
           count[k]=ans;    
       }
    
       for(int j=0;j<test;j++){
           System.out.println(count[j]);
       
       }
    }
    
}
