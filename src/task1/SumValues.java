/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class SumValues {
    Scanner sc = new Scanner(System.in);
     SumValues(){
        int sum=0;
        System.out.println("Sum Values\nEnter the number of elements you want to enter");
        try{
         int n = sc.nextInt();
          System.out.println("Enter the values");
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum Values"+ sum);
    }
        catch(Exception e){
             System.out.println("Enter the valid input");
          
            
        }
    }
    
    
}
