import java.util.*;
class greater_of_3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter first number :- ");
    int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("enter second number :- ");
    int n2 = Integer.parseInt(sc.nextLine());
        System.out.print("enter third number :- ");
    int n3 = Integer.parseInt(sc.nextLine());
    sc.close();
    if(n1>n2 & n1>n3){
      System.out.print(n1 + "is greater"); 
    }
    else if(n2>n1 & n2 > n3){
      System.out.print(n2 + "is greater");
    }
    else{
      System.out.print(n3 + "is greater");
    }
  }
}