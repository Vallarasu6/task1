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
public class Sorting {
    Sorting(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Sorting\nEnter the number of values ");
        try{
            int temp;
              int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
         System.out.println("The sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
            }
        }
        catch(Exception e){
             System.out.println("Reverse an array ");
        }
    }
}
