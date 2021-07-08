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
public class ContainsValue {
    ContainsValue(){
        int flag =0;
        Scanner sc = new Scanner(System.in);
         System.out.println("Contains value \nEnter the number of elements you want to enter");
         try{
              int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number You want to find");
        
        int f = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(a[i]==f){
                flag=1;
                System.out.println("Element found");
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
         }
         catch(Exception e){
             System.out.println("Enter the valid input");
         }
    }
}
