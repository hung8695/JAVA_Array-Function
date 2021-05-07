import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();
        System.out.println("Nhập cột cần tính tổng: ");
        int sumCol = scanner.nextInt();
        int index = 0;
        int[][] arr = new int[rows][cols];
        int sum=0;
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 99);
                System.out.print(arr[i][j] + " ");
            }
        }
        for (int i = 0; i < rows; i++) {

                sum+=arr[i][sumCol-1];

        }
        System.out.println();
        System.out.println("Tổng của cột "+sumCol+" là: "+sum);
    }
}