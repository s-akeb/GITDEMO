//Average of numbers
//Description
//Take n integers as input and print their average. 
//The input will be in the following format:
//The first line will contain n which is the number of integers to be taken average of.
//The next n lines will contain n integers.
//Average of n numbers= Sum of numbers/n 

import java.util.*;
public class ForLoop8 {

   public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       int sum=0,number;
       for (int i=0;i<n;i++){
           number=input.nextInt();
           sum=sum+number;
       }
       int average=sum/n;
       System.out.print(average);
   }
}


