public class multiple_catch {
    public static void main(String[] args) {
        try {
            int arr[] ={1,2,3};
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("array index out of bound");
        }
        catch (ArithmeticException e) {
            System.out.println("divide by zero exception");
         }
    }
}
