import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[]  = new int[3];
        int arr2[]  = new int[3];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("Nhap phan tu thu "+i+" cua mang arr1");
            arr1[i] = input.nextInt();
        }
        for (int j = 0; j <arr2.length ; j++) {
            System.out.println("Nhap phan tu thu "+j+" cua mang arr1");
            arr2[j]  = input.nextInt();
        }
        int arr3[] = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        for ( int element: arr3){
            System.out.println(element);
        }
    }
}
