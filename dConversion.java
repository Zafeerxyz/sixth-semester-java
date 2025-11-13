import java.util.Scanner;
public class dConversion{
    static String toBinary(int num){
        String bin = " " ;
        while(num>0){
            int rem = num%2 ;
            bin = rem + bin ;
            num = num/2 ;   

        }return bin;
    }
    static String toOctal(int num){
        String oct = " " ;
        while(num>0){
            int rem = num % 8;
            oct = rem + oct ;
            num = num/8 ;

        }return oct;
    }
    static String toHex(int num){
        String hex = " " ;
        char hexDigits[] = {'0','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0){
            int rem = num % 16 ;
            hex = hexDigits[rem]+hex ;
            num = num/16 ;
        }return hex;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = SC.nextInt();
        System.out.println("Binary :" + toBinary(number));
        System.out.println("Octal :" + toOctal(number));
        System.out.println("Hexa Decimal :" + toHex(number));
    SC.close();

    }
}