import java.util.Scanner;
class eMerge{
    static int[] arr1 ;
    static int[] arr2 ;
    static int[] merged ;
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Size of first array : ");
        int n1 = SC.nextInt();
        arr1= new int[n1];
        System.out.println("Enter element of first array : ");
        for(int i=0 ; i<n1 ; i++){
            arr1[i]= SC.nextInt();
        }
        System.out.println("Enter size of second array :  ");
        int n2= SC.nextInt();
        arr2 = new int[n2];
        System.out.println("Enter elements of second array");
        for(int i =0 ; i<n2 ; i++){
            arr2[i]= SC.nextInt();
        }
        merged = new int [n1+n2];
        for(int i=0;i<n1;i++){
            merged[i]=arr1[i];
        }
        for (int i=0;i<n2;i++){
            merged[n1+i]= arr2[i];
        }
        System.out.println("Merged Array : ");
        for(int i=0 ;i<merged.length;i++){
            System.out.println(merged[i]+" ");
        }
        SC.close();
    }

}