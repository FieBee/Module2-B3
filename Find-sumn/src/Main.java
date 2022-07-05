import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang 2 chieu muon tao (arr[x][]");
        int x = input.nextInt();
        System.out.println("Nhap kich thuoc mang 2 chieu muon tao (arr[][y]");
        int y = input.nextInt();

        double[][] array = new double[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu vi tri "+i +" "+j+" cua mang");
                array[i][j] = input.nextDouble();
            }
        }
        int sum = 0;
        int i = 0;
        System.out.println("Nhap cot i muon tinh tong: ");
        do {

            i = input.nextInt();
            if (i <0 || i>= array.length){
                System.out.println("Nhap lai cot i ");
            }
            else {
                for (int j = 0; j < array.length; j++) sum += array[j][i];
            }
        }while (i <0 || i>= array.length);
        System.out.println("Tong cot "+i+" cua mang la: "+sum);

    }

}
