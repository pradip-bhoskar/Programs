/*
    https://github.com/pradip-bhoskar
    
    Write a program to print first n numbers of fibonacci series.
*/

import java.util.*;

public class Fibonacci_Series{
    
    public static void main(String args[]){
        
        int n1=0,n2=1,n,temp,sum;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the number:");
        n= sc.nextInt();
        
        
        if(n>0){
            System.out.print(n1+" ");
        }
        if(n>1){
            System.out.print(n2+" ");
        }
        
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }
    }
}
