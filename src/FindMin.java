import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n=sc.nextInt();
        System.out.println("Các số trong mảng là: ");
    int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) Math.round(Math.random()*99);
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Số bé nhất trong mảng là:"+findMin(arr));
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }

        }
        return min;
    }
}

