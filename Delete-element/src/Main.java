import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr = {1,2,3,4,4,5,6,8,9,55,11,44,22};

        System.out.println("Nhap phan tu can xoa");
        int x = scanner.nextInt();
        int indexDel =1;
        for (int i = 0; i<arr.length; i++,indexDel++){
            if (arr[i] == x){
                arr[i] = 0;
                System.out.println(" Vi tri phan tu xoa la: " + indexDel);

            }
        }
        for (int element : arr){
            System.out.println(element);
        }
    }


}
