/*
    https://github.com/pradip-bhoskar
    
    Write a program to print first n prime numbers.
    
*/

import java.util.*;

public class N_Prime{
    
    public static void main(String args[]){
    
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int count=2;
        boolean flag =true;
        
        while(n>0){
            flag=true;
           for(int i=2;i<count;i++){
               if(count%i==0){
                   flag=false;
                   break;
               }
           }
           
           if(flag){
               System.out.print(count+" ");
                n--; 
           }
           count++;
        }
        
    }
}
