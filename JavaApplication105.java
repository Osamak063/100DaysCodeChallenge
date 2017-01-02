/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication105;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int withdraw,total;
       double charges=0.5,ans;
       withdraw=in.nextInt();
       total=in.nextInt();
       if(withdraw%5==0){
       if(withdraw<=total){
       ans=total-withdraw;
       ans= ans-charges;
           System.out.println(ans);
       }
       else
               System.out.println(total);
       }
       else 
            System.out.println(total);
    }
    
}
