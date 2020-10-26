import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
     public PerformOperation isOdd()
   {
       return (x) -> !(x%2==0);
   }

   public PerformOperation isPrime()
   {
       return (x) -> {
           boolean flag=true;
           for(int i=2;i<x;i++)
           {
               if((x%i)==0)
                {
                    flag=false;
                    break;
                }
           }
           return flag;
           
       };
   }

public PerformOperation isPalindrome()
   {
       return (x) -> {
           return palindrome(""+x);
       };
   }

public static boolean palindrome(String input)
    {
        int upperlimit=(input.length()/2)+1;
        boolean iseven;

        if((input.length()%2)==0)
            iseven=true;
        else
            iseven=false;

        if(!iseven)
        {
            upperlimit-=1;
        }

        for(int i=0;i<upperlimit;i++)
        {
            //left character
            char left=input.charAt(i);

            //getting the right character
            char right=input.charAt(input.length()-i-1);

            if(left!=right)
                return false;
        }
        return true;
    }}
