/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication108;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int[] array= new int[100];
       int[] count = new int[10];
       for(int j=0;j<count.length;j++){
           count[j]=0;
       }
       int i;
       int test=in.nextInt(); 
       for(int k=0;k<test;k++){
           int input=in.nextInt();
            i=0;
       while(true){
       array[i]=input%10;
       input=input/10;
       if(input==0){
       break;
       }
       i++;
       }
       for(int j=0;j<=i;j++){
       if(array[j]==4){
       ++count[k];
       }
       
       }
    }
       for(int j=0;j<test;j++){
           System.out.println(count[j]);
       
       }
    }
}
