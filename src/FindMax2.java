import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter cols: ");
        int cols= sc.nextInt();
        int [][] arr=new int[rows][cols];
        int max=arr[0][0];
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                arr[i][j]=(int) Math.round(Math.random()*99);
                System.out.print(arr[i][j]+" ");
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              if(arr[i][j]>max){
                 max= arr[i][j];
              }
            }
        }
        System.out.println();
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
    }
}
