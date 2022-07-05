import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so phan tu size cua mang muon tao");
        int size = input.nextInt();
        while (size<=0){
            System.out.println("Nhap lai size: ");
            size = input.nextInt();
        }

        int [] arr = new int[size];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhap phan tu: " +i+" cua mang");
            arr[i]= input.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Gia tri nho nhat cua mang la: "+min);
    }
}
