import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        System.out.print("Enter Array Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            int max2=0;
            for(int i=0;i<size;i++){
                if(arr[i]>max2&&arr[i]!=max){
                    max2=arr[i];
                }

           
        }
        System.out.print("2nd Max:"+max2);
        scanner.close();

    }
}
