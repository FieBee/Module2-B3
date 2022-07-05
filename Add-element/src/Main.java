import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,0,0};
        System.out.println("Nhgap so can chen");
        int x = input.nextInt();
        System.out.println("Nhap vi tri can chen vao trong mang");
        int index = input.nextInt();
        if (index <= -1 || index >= arr.length-1){
            System.out.println("Ko chen dc");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i==index){
                for (int j = 0; j < arr.length-index ; j++) {
                    arr[arr.length-j-1] = arr[arr.length-j-2];
                }
                arr[index] =x;
            }
        }
        for (int element: arr){
            System.out.println(element);
        }
    }
}
