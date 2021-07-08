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
public class Commonchar {
    Commonchar(){
        Scanner sc = new Scanner(System.in);
        try{
        String a,b;
        
        
        System.out.println("Common characters in String\nEnter the First string");
       
        a=sc.nextLine();
        System.out.println("Enter the second string");
        b=sc.nextLine();
        int alen = a.length();
        int blen = b.length();
         System.out.println("The common characters are");
        for(int i=0;i<alen;i++){
            for(int j=0;j<blen;j++){
                if(a.charAt(i)==b.charAt(j)){
                    System.out.println(a.charAt(i));
                    break;
                }
            }
        }
       
        
      
    }
        
       catch(Exception e){
             System.out.println("Enter the valid input");
         } 
        
    }
}
