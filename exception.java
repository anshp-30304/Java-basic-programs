
public class exception {
    public static void main(String[] args) {
     try {
        int c=1/0;
      System.out.println(c);
     } catch (ArithmeticException e) {
        System.out.println("cannot divide by zero");
     }
    }
}
