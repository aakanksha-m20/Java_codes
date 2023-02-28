import java.util.Scanner;

public class CheckVowel 
{
   
    public static void main(String[] args)
    {
      Scanner sobj = new Scanner(System.in);
      boolean vowel_Low;
      boolean vowel_Upp;

      System.out.print("Enter Character: ");     
      char c = sobj.next().charAt(0);

      vowel_Low = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
      vowel_Upp = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

      if(vowel_Low || vowel_Upp)
      {
        System.out.println(c + " is vowel.");
      }
      else
      {
        System.out.println(c + " is consonant.");
      }
    }
}
