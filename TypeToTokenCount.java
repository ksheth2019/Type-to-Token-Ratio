//breaks each line into tokens by whitespace
//counts the frequencies of the tokens
//counts the amount of unique words (type) 
//prints out token frequency
//prints out type frequency
//prints out Type to Token Ratio 
import java.util.*;

public class TypeToTokenCount {

   public static void main(String[] args) {
      //put your input in the quotation marks
      //this works best if you concatenate your cells in excel 
      String input = "input"; 
      double tokens = tokens(input);
      double type = type(input);
      typeToTokenRatio(tokens, type); 
   }
   
   //count the number of words (tokens) 
   public static double tokens(String input) {
      int count = 0; 
      String[] result = input.split("\\s");
      for (String s: result) {
         count++; 
      }
      System.out.println("token = " + count); 
      return count; 
   }
   
   //count the number of unique words (type) 
   public static double type(String input) {
      Map<String, Integer> counts = new TreeMap<>();
      int number = 0; 
      String[] result = input.split("\\s"); 
      for (String s : result) {
         if (!counts.containsKey(s)) {
            counts.put(s, 0);
         }
         counts.put(s, counts.get(s) + 1); 
      }
      for (String w : counts.keySet()) {
         number++;
      } 
      System.out.println("type = " + number); 
      return number; 
   }
   
   //calculates the type to token ratio
   public static void typeToTokenRatio(double token, double type) {
      double ttr = type / token; 
      System.out.println(ttr); 
   }
}
