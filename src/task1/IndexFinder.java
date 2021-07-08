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
public class IndexFinder {
    Scanner sc = new Scanner(System.in);
   IndexFinder(){
        int flag = 0;
        System.out.println("Index FInder\nEnter the number of elements you want to enter");
        try{
        int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number You want to find that index");
        
        int f = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(f==a[i]){
                 System.out.println("The index of"+ f + "is" +i);
                 flag=1;
            }
        }
        if(flag==0){
            System.out.println("The element is not found in that array");
        }
        }
        catch(Exception e){
            System.out.println("Please enter the number");
        }
        
        
        
    }
    
    
}
