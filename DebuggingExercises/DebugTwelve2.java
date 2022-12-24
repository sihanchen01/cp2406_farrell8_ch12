// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
public class DebugTwelve2 {
   public static void main(String[] args) throws ArithmeticException {
      byte num1 = 120, num2 = 120, result;
      final byte HIGH_BYTE = 127;
      try {
         byte allowed = (byte)(HIGH_BYTE - num1);
         if(num2 > allowed || num1 > allowed) {
            throw(new ArithmeticException());
         }
         result = (byte)(num1 + num2);
         if (result > HIGH_BYTE) {
            throw(new ArithmeticException());
         }
         System.out.println("Result is " + result);
      } catch(ArithmeticException error) {
         System.out.println("Byte can't hold value higher than " + HIGH_BYTE);
      }
   }
}