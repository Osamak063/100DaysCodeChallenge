/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication110;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int count=0;
       String[] ans=new String[100];
       String know=in.nextLine();
       int noOfWords=in.nextInt();
       String book;
       char[] arrayknow = new char [100];
       arrayknow=know.toCharArray();
       char[] array1;
       for(int i=0;i<noOfWords;i++){
           count=0;
       book= in.next();
       array1=book.toCharArray();
       for(int j=0;j<array1.length;j++){
       for(int k=0;k<arrayknow.length;k++){
       if(array1[j]==arrayknow[k]){
       count++;
       }
       
       }
       }
       if(count==array1.length){
       ans[i]="Yes";
       }
       else 
        ans[i]="No";   
       }
       for(int i=0;i<noOfWords;i++){
           System.out.println(ans[i]);
       }
       
       
       
       
    }
    
}
