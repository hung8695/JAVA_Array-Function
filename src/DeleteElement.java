import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí cần xóa: ");
        int k= sc.nextInt();
        System.out.println("Nhâp chiều dài của mảng: ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        int j,c;
        for (int i = 0; i < n; i++) {
            arr[i]=(int) Math.round(Math.random()*99);
        }
        System.out.println("Các giá trị trong mảng là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = k; i < n-1; i++) {
           arr[i]=arr[i+1];

        }
        n=n-1;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }

}
