/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication114;

import java.util.Scanner;

/**
 *
 * @author Osama Khalid
 */
public class JavaApplication114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      int[][] array= new int [4][4];
      int max=0,colnum=0,rownum=0,count=0,a=0,b=0;
      int[] ansr= new int [16];
      int[] ansc= new int [16];
      boolean spoint=false,ans=false;
      for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
      array[i][j]=Integer.parseInt(in.next());
      }
      }
       for(int i=0;i<4;i++){
           max=array[i][0];
      for(int j=0;j<4;j++){
      if(max<=array[i][j]){
      max=array[i][j];
      colnum=j;
      rownum=i;
      }
      }
      for(int k=0;k<4;k++){
      if(array[k][colnum]>=max)
      {
      spoint = true;
      }
      else{
          spoint = false;
          break;
      }
      }
      if(spoint==true){
          ans=true;
          count++;
      ansr[a]=rownum;
      ansc[b]=colnum;
      ++a;
      ++b;
      }
      }
        System.out.println(count);
        if(count>0){
       for(int i=0;i<count;i++){
           System.out.println(ansr[i]+" "+ansc[i]);
       
       }
        }
      else
            System.out.println("No Saddle Points.");
    }
    
}
