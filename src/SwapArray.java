import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng: ");
        int n= sc.nextInt();
        int[] array=new int[n];
        int i=0;
        while (i<array.length){
            System.out.println("Nhập phần tử thứ "+(i+1)+": ");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Mảng đã nhập: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        swapArray(array);
        System.out.printf("%-20s%s", "Mảng sau khi đảo: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
    public static int[]  swapArray(int[] arr){
        for (int i = 0; i < arr.length / 2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}

