import java.util.*;

class numb{
    void number(){
        System.err.println("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        sc.close();

        if (x % 2 != 0){
            System.out.println("odd nnumber");
        }
        else{
            System.out.println("even number");
        }
    }
}

public class odd_even {
  public static void main(String[] args) {
    numb obj = new numb();
    obj.number();
     }  
}
