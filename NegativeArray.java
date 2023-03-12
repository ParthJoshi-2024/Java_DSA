import java.util.Scanner;

public class NegativeArray {
    public static void main(String[] args) {
        System.out.print("Enter Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Element in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Negative Elements:");
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
        scanner.close();
    }
}
