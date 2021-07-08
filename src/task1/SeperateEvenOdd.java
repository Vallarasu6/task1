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
public class SeperateEvenOdd {
    SeperateEvenOdd(){
        int count=0;
         Scanner sc = new Scanner(System.in);
                 System.out.println("Reverse an array \nEnter the number of elements you want to enter");
        try{
            int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        System.out.println("The result array is");
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
                for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        }
         catch(Exception e){
            System.out.println("Please enter the valid input");
        }
    }
}
