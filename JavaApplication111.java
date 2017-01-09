/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] votes= new int[10];
        int[] ans= new int[100];
        
        int test= in.nextInt();
        int n=0,k,count=0;
        int[] array = new int[100];
        
        
        for(int i=0;i<test;i++){
            for(int a=0;a<votes.length;a++){
        votes[a]=0;
        }
            n=Integer.parseInt(in.next());
            k=Integer.parseInt(in.next());
            for(int j=0;j<n;j++){
                array[j]=Integer.parseInt(in.next());
                if(array[j]==j+1){
                continue;
                }
                else 
                  ++votes[array[j]-1];
            }
            count=0;
             for(int x=0;x<n;x++){
              if(votes[x]==k){
              ++count;
              }      
        }
             ans[i]=count;
        }
       
    for(int i=0;i<test;i++){
        System.out.println(ans[i]);
    
    }
    }
    
}
