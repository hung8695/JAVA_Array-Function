import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng 1: ");
        int n1= sc.nextInt();
        System.out.println("Nhập số phần tử mảng 2: ");
        int n2= sc.nextInt();
        int n3=n2+n1;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        int[] arr3=new int[n3];
        System.out.println("Các phần tử trong mảng 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i]=(int) Math.round(Math.random()*99);
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        System.out.println("Các phần tử trong mảng 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i]=(int) Math.round(Math.random()*99);
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("Các phần tử của mảng 1+mảng 2: ");
        for (int i = 0 ; i < n1; i++) {
            arr3[i]=arr1[i];
            System.out.print(arr3[i]+" ");
        }
        for (int i = n1 ; i<n3; i++) {
            arr3[i]=arr2[(n2-1)-(i-n1)];
            System.out.print(arr3[i]+" ");
        }

    }
}
