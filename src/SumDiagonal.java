import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng (rows x cols) : ");
        int rows = scanner.nextInt();
        int[][] arr = new int[rows][rows];
        int sum=0;
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < rows; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 99);
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][rows-1-i];
//            for (int j = 0; j < cols; j++) {
//
//            }
        }
        sum=sum1+sum2;
        System.out.println("Tổng của 2 đường chéo chính là: " + sum);
    }
}
