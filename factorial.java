import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("enter a number :- ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}