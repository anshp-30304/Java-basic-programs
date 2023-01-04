
import java.util.Scanner;

class arr {
    void numbs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Total for above elements is :- " + sum);
    }
}

public class sum_of_array {
    public static void main(String[] args) {
        arr obj = new arr();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int size = sc.nextInt();
        System.out.println("Enter number for array");
        int[] array = new int[size];
        for (int i = 0; i <= size-1; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        obj.numbs(array);
    }
}
