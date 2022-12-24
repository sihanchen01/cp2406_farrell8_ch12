// This class determines the logarithm of a number
public class DebugTwelve1 {
  public static void main(String[] args) throws ArithmeticException {
     double num = Math.random() - 0.5, result;
     try {
        if(num <= 0) {
           throw(new ArithmeticException());
        }
        result = Math.log(num);
        System.out.println("Result is " + result);
     } catch (ArithmeticException e) {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}