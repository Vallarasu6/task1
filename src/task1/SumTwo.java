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
public class SumTwo {
    SumTwo(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Sum of two numbers to find a target value \nEnter the number of elements you want to enter");
        try{
             int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        System.out.println("Enter the Target value");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==target){
                 System.out.println("The two values are "+a[i]+" "+a[j]);
            }
        }
        }
        }
         catch(Exception e){
             System.out.println("Enter the valid input");
             
         }
        }
    }

