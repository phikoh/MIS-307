import java.util.Random;

/**
   A tester class for the recursive maximum.
*/
public class DataSetDemo
{
   public static void main(String[] args)
   {
      int[] values = { 1, 10, 100, -1, -10, -100, 100, 0 };
      DataSet d = new DataSet(values, 0, values.length - 1);
      System.out.println("Maximum: " + d.getMaximum());
      System.out.println("Expected: 100");
      
      
      // I'm just putting this in to see if github works
   }
}
