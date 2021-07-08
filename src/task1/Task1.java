package task1;

import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Programs LIst\n1.Index FInder\n2.Sum of values in array\n3.Remove an element\n4.Insert element\n5.Contains value\n6.Maximum and minimum\n7.Common Elements\n"
                + "8.Remove duplicates\n9.EvenOdd numbers\n10.Average except Maximum and minimum\n11.Sum of Two values to find the target value\n12.Reverse an array\n13.Seperate Even and Odd numbers"
                + "\n14.Sorting\n Enter your choice");
        int n = sc.nextInt();
        switch(n){
            case 1:{
        IndexFinder obj1=new IndexFinder();
        break;
            }
            case 2:{
        SumValues obj2=new SumValues();
        break;
        }
            case 3:{
                removelement obj3 = new removelement();
                break;
            }
            case 4:{
                insertelement obj4 = new insertelement();
                break;
            }
             case 5:{
                ContainsValue obj5 = new ContainsValue();
                break;
            }
             case 6:{
                 minimax obj6 = new minimax();
                 break;
              }
             case 7:{
                 int ch;
                 System.out.println("1.Common in String\n2.Common in integer");
                 ch = sc.nextInt();
                 switch(ch){
                     case 1:{
                         Commonchar obj7 = new Commonchar();
                         break;
                     }
                     case 2:{
                         CommonInt obj8 = new CommonInt();
                         break;
                     }
                 }
                 
                 break;
             }
             case 8:{
                 RemoveDuplicates obj9 = new RemoveDuplicates();
                 break;
             }
             case 9:{
                 EvenOdd obj10 = new EvenOdd();
                 break;
             }
             case 10:{
                 Average obj11 = new Average();
                 break;
             }
              case 11:{
                 SumTwo obj12 = new SumTwo();
                 break;
             }
              case 12:{
                 Reverse obj13 = new Reverse();
                 break;
             }
              case 13:{
                 SeperateEvenOdd obj14 = new SeperateEvenOdd();
                 break;
             }
              case 14:{
                 Sorting obj15 = new Sorting();
                 break;
             }
             
        }
    }
    
}
