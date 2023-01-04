// area = 0.5*base*height
import java.util.Scanner;
class value{
    void numb(){
        float base,height;
        double area;

        System.out.println("enter base");
        Scanner sc = new Scanner(System.in);
        base = Float.parseFloat(sc.nextLine());

        System.out.println("enter Height");
        height = Float.parseFloat(sc.nextLine());

        area = 0.5 * base *height;
        System.out.println("area of triangle is " + area);
        sc.close();

    }
}

public class area_tri {
    public static void main(String[] args) {
        value obj = new value();
        obj.numb();
    }
}
