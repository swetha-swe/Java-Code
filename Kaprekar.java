import java.util.*;

class fun

{
   
	public  boolean isKaprekar(int n)

   {

     int temp = n,count=0;

     while(n>0)

     {

        count++;

        n/=10;

     }

     int sq = temp*temp;

     for(int i = 1;i<=count;i++)

     {

        int base = (int)Math.pow(10,i);

        if(base == temp)

           continue;

        int sum = sq/base + sq%base;

        if (sum == temp)

           return true;

     }
    
  return false;

}

}

public class Kaprekars

{

   public static void main(String args[])

   {

      Scanner sc = new Scanner(System.in);

      fun ob = new fun();

      int input = sc.nextInt();

      for(int i=1;i<=input;i++)

      {

         if(ob.isKaprekar(i))

            System.out.println(i);

      }

   }

}