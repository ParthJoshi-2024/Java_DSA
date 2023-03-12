import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        System.out.print("Enter Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int temp=0;
        for(int i=0;i<size;i++){
            if(i+1<size){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;

            }
        }
        System.out.println("After Swaping:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }
        scanner.close();
    }
}
