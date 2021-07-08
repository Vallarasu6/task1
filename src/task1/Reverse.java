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
public class Reverse {
            Reverse(){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Reverse an array \nEnter the number of elements you want to enter");
        try{
            int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        System.out.println("The reverse array is");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
            }
        }
        catch(Exception e){
            System.out.println("Please enter the valid input");
        }
            }
}
