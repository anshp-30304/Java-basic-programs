import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your string");
        str = sc.next();
        int len = str.length();
        String rev = "";
        sc.close();
        for(int i =len-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        } 
        if(str.equals(rev)){
            System.out.println("string is plaindrome");
        }
        else{
            System.out.println("it is not plaindorme");
        }
    }
}
