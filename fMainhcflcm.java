import java.util.Scanner;
class HCFLCMCalculator {
    int findHCF(int a,int b){
        while(b!=0){
            int temp = b;
            b= a%b ;
            a= temp;
        }
        return a;
    }
    int findLCM(int a,int b){
        int hcf = findHCF(a, b);
        int lcm = (a*b)/hcf;
        return lcm;
    }
}

    public class fMainhcflcm{
        public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            int num1 = SC.nextInt();
            System.out.println("Enter Seconf Number : ");
            int num2 = SC.nextInt();
            HCFLCMCalculator Obj = new HCFLCMCalculator();
            int hcf = Obj.findHCF(num2, num2);
            int lcm = Obj.findLCM(num1, num2);
            System.out.println("HCF of" + num1 +"and" +num2 +"="+ hcf);
            System.out.println("LCM of" + num1 +"and" +num2 +"="+ lcm);
            


        }
    }