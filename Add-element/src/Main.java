import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhgap so can chen");
        int x = input.nextInt();
        System.out.println("Nhap vi tri can chen vao trong mang");
        int index = input.nextInt();
        if (index <= -1 || index >= arr.length-1){
            System.out.println("Ko chen dc");
        }
        arr[index] = x;

        for (int element: arr){
            System.out.println(element);
        }
    }
}
