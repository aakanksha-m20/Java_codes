import java.util.*;
import java.text.DecimalFormat;

class FloatNo_Multiplication
{
   private static final DecimalFormat df = new DecimalFormat("0.00");
   public static void main(String[] args)
   { 
     Scanner sobj = new Scanner(System.in);

     System.out.print("Enter to floating-point number: ");  
     float a = sobj.nextFloat();
     float b = sobj.nextFloat();

     float multi = a * b;

     System.out.format("Multiplication of two number is: "+ df.format(multi));
   }

}