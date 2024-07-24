import java.util.*;
import java.io.*;
class quadraticroots
{
  public static void main(String args[])
  {
    int a=3,b=9,c=0;
    double D=Math.pow(b,2)-(4*a*c);
    float R1=((-b)+(float)Math.sqrt(D))/(2*a);
    float R2=((-b)-(float)Math.sqrt(D))/(2*a);
    System.out.println("discriminant is:"+D);
    System.out.println("Root is:"+R1);
    System.out.println("Root is:"+R2);
    if(D>0)
    {
    System.out.println("Roots are real and distinct");
    }
   else if(D==0)
   {
     System.out.println("Roots are real and equal");
   }
   else
   {
     System.out.println("Roots are imaginary");
   }
  }
}
    
  
