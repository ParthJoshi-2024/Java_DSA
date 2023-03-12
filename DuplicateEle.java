import java.util.Scanner;

public class DuplicateEle {
    public static void main(String[] args) {
        System.out.print("Size:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int c=-1;
                for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                 c=arr[j];
                }
                else{
                    break;
                }
                
            }
        }
        System.out.println("Duplicate in Array:"+c);
        scanner.close();
    }
}
