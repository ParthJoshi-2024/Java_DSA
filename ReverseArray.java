
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("Enter Array Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int m=size-1;
        int temp=0;
        for(int i=0;i<size/2;i++){
            temp=arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
            m--;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
