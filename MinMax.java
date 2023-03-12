import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.print("Enter Array Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min:"+min);
        System.out.print("Max:"+max);
        scanner.close();
    }
}
