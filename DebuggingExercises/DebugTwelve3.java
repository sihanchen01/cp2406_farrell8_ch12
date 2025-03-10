// Catch exceptions for array index out of bounds
// or dividing by 0 
import javax.swing.*;
public class DebugTwelve3 {
   public static void main(String[] args) {
      String inStr;
      int num, result;
      int[] array = {12, 4, 6, 8};
      inStr = JOptionPane.showInputDialog(null, "Enter a number ");
      num = Integer.parseInt(inStr);
      try {
         for (int i : array) {
            result = i / num;
            JOptionPane.showMessageDialog(null, "Result of division is " + result);
            result = array[num];
            JOptionPane.showMessageDialog(null, "Result accessing array is " + result);
         }
      } catch(ArithmeticException error) {
          JOptionPane.showMessageDialog(null, "Arithmetic error - division by 0");   
      } catch(IndexOutOfBoundsException error) {
         JOptionPane.showMessageDialog(null, "Index error - subscript out of range");
      }
   }
}