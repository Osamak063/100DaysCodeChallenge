/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int num1,num2,multiple=1,a=0,ans=0,count=0;
    num1=in.nextInt();
    num2=in.nextInt();
    while(true){
     if(num1==num2){
    break;
     }
    if(num1>num2){
        //count++;
        
        while(true){
    ans=multiple*num2;
    a=num1-ans;
         System.out.println("num1="+num1);
            System.out.println("ans="+ans);
        System.out.println("mul="+multiple);
            System.out.println("a="+a);
    if(a<0){
    --multiple;
    ans=multiple*num2;
    num1=num1-ans;
    count++;
    System.out.println("count1="+count);
    break;
    } 
    if(a==0){
        count++;
        System.out.println("count1="+count);
        num1=num1-ans;
    break;
    }
    else if(a>0){
    multiple++;
    }
        }
    }
    else if(num1<num2)
    { 
        
    
    while(true){
    ans=multiple*num1;
    a=num2-ans;
     

    if(a<0){
    --multiple;
    ans=multiple*num1;
    num2=num2-ans;
    count++;
    break;
    } 
    if(a==0){
        count++;
       
        num2=num2-ans;
    break;
    }
    else if(a>0){
    multiple++;
    }
        }
    }
    if(num1==0 || num2==0){
    break;
    }
    multiple=1;
    }
    if(count%2==0){
        System.out.println("Ollie wins !");
    }
    else 
        System.out.println("Stan wins");
    
    }
    
}
