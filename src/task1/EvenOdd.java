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
public class EvenOdd {
    EvenOdd(){
        int even=0,odd=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of Even and Odd\nEnter the number of elements you want to enter");
    try{
        int n = sc.nextInt();
         System.out.println("Enter the values");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even="+even+"Odd="+odd);
        
    }
     catch(Exception e){
             System.out.println("Enter the valid input");
         }
}
}