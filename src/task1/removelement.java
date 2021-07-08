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
public class removelement {
     Scanner sc = new Scanner(System.in);
     removelement(){
         int flag=0;
          System.out.println("Remove Element\nEnter the number of elements you want to enter");
          try{
          int n = sc.nextInt();
          System.out.println("Enter the values");
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        System.out.println("Enter the value to remove");
        int val = sc.nextInt();
        for(int i=0;i<n;i++){
            if(val==a[i]){
                flag=1;
                for(int j=i;j<n-1;j++){
                    a[j]=a[j+1];
                }
                n--;
                break;
            }
        }
        if(flag!=0){
        System.out.println("After the element is remove");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        }
        else{
            System.out.println("Element is not found");
        }
     }
          catch(Exception e){
              System.out.println("Enter the valid input");
          }
}
}