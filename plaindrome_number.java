import java.util.Scanner;
public class plaindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int copy = n;
        int rev=0;
        sc.close();
        n= Math.abs(n);
        while(n!=0){
            rev = rev*10 + n % 10;
            n = n/10;
        }
        if(copy == rev){
            System.out.println(copy + " is palindrome");
        }
        else{
            System.out.println(copy + " is not palindrome");
        }
    }
}
