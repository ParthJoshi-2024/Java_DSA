import java.util.Scanner;

public class SumOfEle {
    public static void main(String[] args) {
        System.out.print("Enter Array Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum is:"+sum);
        scanner.close();
    }
}
