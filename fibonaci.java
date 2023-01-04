import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
    //initializing the constants
    int n, t1 = 0, t2 = 1;
System.out.println("enter number:- ");
Scanner sc = new Scanner(System.in);
// System.out.println(sc);
sc.close();
n = Integer.parseInt(sc.nextLine());

    System.out.print("Upto " + n + ": ");
    //while loop to calculate fibonacci series upto n numbers
    for (int i = 0; i <= n; i++){
    System.out.print(t1 + " + ");
    int sum = t1 + t2;
    t1 = t2;
    t2 = sum;
    }
}
}