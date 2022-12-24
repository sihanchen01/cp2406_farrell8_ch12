// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
import javax.swing.*;
public class DebugTwelve4 {
   public static void main(String[] args) throws DebugEmployeeIDException{
      String inStr;
      StringBuilder result = new StringBuilder();
      final int MAX = 999;
      int[] empIDs = new int[4];
      for(int x = 0; x < empIDs.length; ++x) {
         inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");  
         try {
            empIDs[x] = Integer.parseInt(inStr);
            if(empIDs[x] > MAX)
            {
               throw(new DebugEmployeeIDException("Number too high " + empIDs[x]));
            }
         } catch(NumberFormatException error) {
            --x;
            JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
         } catch(DebugEmployeeIDException error) {
           --x;
           JOptionPane.showMessageDialog(null, error.getMessage());
         }
      }
      for (int digit : empIDs) {
         result.append(digit).append(" ");
      }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + result);
   }
}