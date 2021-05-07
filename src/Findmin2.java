import java.util.Scanner;

public class Findmin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows= scanner.nextInt();
        System.out.println("Enter cols: ");
        int cols= scanner.nextInt();
        int index=0;
        int [][] arr=new int[rows][cols];
        int min=arr[0][0];
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                arr[i][j]=(int) Math.round(Math.random()*99);
                System.out.print(arr[i][j]+" ");
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]<min){
                    min= arr[i][j];
                    index++;
                }
            }
        }
        System.out.println();
        System.out.println("Phần tử bé nhất trong mảng là: "+min+" tại vị trí thứ : "+index);
    }
}
