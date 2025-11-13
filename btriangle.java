
import java.util.Scanner;

class btriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Side 1 :");
        double a = SC.nextDouble();
        System.out.println("Enter Side 2 :");
        double b = SC.nextDouble();
        System.out.println("Enter Side 3 :");
        double c = SC.nextDouble();
            if(a+b>c && a+c>b && b+c>a)
            {
                if(a==b && b==c ){
                    System.out.println("It is equilateral");
                }
                else if (a==b || b==c || c==a)
                {
                    System.out.println("It is isoscles");
                }
                else 
                {
                    System.out.println("It is scalene");
                }
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle :" + area);
            }
            else{
                System.out.println("It is not a triangle");
            }
            SC.close();
    }
}