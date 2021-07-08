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
public class Average {
    Average(){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Average value Except Maximum and minimum \nEnter the number of elements you want to enter");
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
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=1;i<n-1;i++){
            
            sum+=a[i];
            
        }
            System.out.println("The aaverage value is = "+sum/(n-2));
            
         }
         catch(Exception e){
             System.out.println("Enter the valid input");
             
         }
    }
}
