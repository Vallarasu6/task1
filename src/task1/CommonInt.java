/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class CommonInt {
    CommonInt(){
         Scanner sc = new Scanner(System.in);
         try{
             int n,m;
             
             System.out.println("Common Integer in an Array\nEnter the number of elements in first array");
             n=sc.nextInt();
             int a[] = new int[n];
             
             
             System.out.println("Enter the values of first array");
             for(int i=0;i<n;i++){
                 a[i]=sc.nextInt();
             }
             System.out.println("Enter the number of elements in second array");
             m=sc.nextInt();
             int b[] = new int[m];
              System.out.println("Enter the values of second array");
             for(int i=0;i<m;i++){
                 b[i]=sc.nextInt();
             }
             System.out.println("The final result is");
             for(int i=0;i<n;i++){
                 for(int j=0;j<m;j++){
                     if(a[i]==b[j]){
                         System.out.println(a[i]);
                         break;
                     }
                 }
             }
             
             
             
         }
         catch(Exception e){
             System.out.println("Enter the valid input");
         }
    }
}
