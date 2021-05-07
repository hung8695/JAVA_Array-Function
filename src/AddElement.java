import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần thêm: ");
        int x= sc.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int k = sc.nextInt();
        System.out.println("Nhập độ dài mảng : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Trước khi thêm: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) Math.round(Math.random()*99);
            System.out.print(arr[i]+ " ");
        }

    }
//    static int[] push(int x, int  k, int[] arr){
//        int temp;
//        for (int i = k; i < arr.length; i++) {
//            temp=arr[k];
//            arr[k]=x;
//            arr[k+1]=temp;
//        }
//        return arr;
//    }
}
