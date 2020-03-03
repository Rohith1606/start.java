package basicelementsofjava_lms;

import java.util.Scanner;

public class Shopkeeper {

      public static void main(String[] args) {
         byte productCode;
         byte productNo;
         float retailPrice;
         int reply,quantitySold;
         float totalRetailValue;
         Scanner sc=new Scanner(System.in);
   
         for(int i=0;i<3;i++)
         {
            System.out.println("Enter product");
            System.out.println("press 1 for number or press 2 for code");
            reply=sc.nextInt();
            if(reply==1)
            {
            for(int counter=0;counter<3;counter++)
            {
             System.out.println("number");
             productNo=sc.nextByte();
             System.out.println("Enter quantity sold");
             quantitySold=sc.nextInt();
             switch(productNo)
             {
             case 1: totalRetailValue=22.50f*quantitySold;
                     System.out.println("Total retail value:"+totalRetailValue);
                     break;
             case 2: totalRetailValue=44.50f*quantitySold;
                     System.out.println("Total retail value:"+totalRetailValue);
                     break;
             case 3: totalRetailValue=9.98f*quantitySold;
                     System.out.println("Total retail value:"+totalRetailValue);
                     break;
              }
            }
            } else if(reply==2)
            {
              
             System.out.print("code");
             productCode=sc.nextByte();
             System.out.println("Enter quantity sold:");
             quantitySold=sc.nextInt();
             switch(productCode)
             {
             case 'A': totalRetailValue=22.50f*quantitySold;
                       System.out.println("Total retail value:"+totalRetailValue);
                       break;
             case 'B': totalRetailValue=44.50f*quantitySold;
                       System.out.println("Total retail value:"+totalRetailValue);
                       break;
             case 'C': totalRetailValue=9.98f*quantitySold;
                       System.out.println("Total retail value:"+totalRetailValue);
                       break;
                }
            }
        }
     }
}

