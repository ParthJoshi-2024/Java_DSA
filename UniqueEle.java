import java.util.Scanner;

public class UniqueEle {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int ans=0;
        for(int i=0;i<size;i++){
            // Bitwise XOR
             ans=arr[i]^ans; 
        }
        System.out.print(ans);
        scanner.close();
    }
}
