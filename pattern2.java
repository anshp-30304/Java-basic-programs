
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        System.out.print("enter number of rows");
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       sc.close();
       for(int i=0;i<n;i++){
        for(int j=i;j>=i;j--){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}
