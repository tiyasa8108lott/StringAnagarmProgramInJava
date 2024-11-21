//two strings are anagram or not
import java.util.*;

public class Test1{
      
      // user defined function to check strings are anagram or not
      public static boolean anagram(String s1, String s2)
       
      {
          // sorting the both strings
          char[] s=s1.toCharArray();
          char[] t=s2.toCharArray();
          
          Arrays.sort(s);
          Arrays.sort(t);

        //comparing the strings 
        return Arrays.equals(s,t);
      }
 
    // main method
    public static void main(String[] args)
 
     {
           String a="listen";
           String b= "silent";
           System.out.println(anagram(a,b));
      }
}