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
public class RemoveDuplicates {
    RemoveDuplicates(){
        int flag=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Remove duplicates\nEnter the number of elements you want to enter");
        try{
        int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
       
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    flag=1;
                    for(int k=j;k<n-1;k++){
                        a[k] = a[k+1];
                    }
                    n--;
                    j--;
                }
                    
                
            }
        }
       System.out.println("The final result is");
        if(flag==1){
        for(int i=0;i<n;i++){
            
             System.out.println(a[i]);
            
        }
            }
        else{
            System.out.println("No duplicates in array");
        }
        }
        catch(Exception e){
             System.out.println("Enter the valid input");
         }
}
}