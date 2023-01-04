import java.util.Scanner;
class numbers{
    void addition(int x , int y ){
        int c = x + y;
        System.out.println("a + b=" + c);
    }
    void subtraction(int x , int y ){
        int c = x - y;
        System.out.println("a - b=" + c);
    }
    void divide(int x , int y ){
        int c = x / y;
        System.out.println("a / b=" + c);
    }
    void multiplication(int x , int y ){
        int c = x * y;
        System.out.println("a * b=" + c);
    }
}

class calc{
    public static void main(String[] args) {
        numbers obj = new numbers();
         int a , b,value;
         System.out.println("Enter one number :-");
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());

        System.out.println("Enter second number :-");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for addition");
        System.out.println("Enter 3 for addition");
        System.out.println("Enter 4 for addition");

        System.out.println("Enter value number :-");
        value = Integer.parseInt(sc.nextLine());
        sc.close();

        if(value == 1){
            obj.addition(a,b);
        }
        else if( value == 2){
            obj.subtraction(a,b);
        }
        else if( value == 3){
            obj.multiplication(a,b);
        }
        else if( value == 4){
            obj.divide(a,b);
        }
        else{
        System.out.println("Enter proper value");;
        }
    }
}