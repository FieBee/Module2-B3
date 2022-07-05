import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang 2 chieu muon tao (arr[x][]");
        int x = input.nextInt();
        System.out.println("Nhap kich thuoc mang 2 chieu muon tao (arr[][y]");
        int y = input.nextInt();

        int[][] array = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu vi tri "+i +" "+j+" cua mang");
                array[i][j] = input.nextInt();
            }
        }

        int index1 = 0;
        int index2 = 0;
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: "+max+ " vi tri "+index1+" "+index2);

    }
}
