import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.print("Enter Array Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
    
        System.out.print("Enter Key:");
        int key=scanner.nextInt();
        for(int i=1;i<size;i++){
            if(arr[i]==key){
                System.out.print("Index is:"+i);
                break;
            }
        }
        scanner.close();
    }
}
