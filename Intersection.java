
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        System.out.print("Enter Size1:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter Size2:");
        int m=scanner.nextInt();
        int arr2[]=new int[m];
        System.out.print("Enter Elements:");
        for(int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        int c=0;
        int arr3[]=new int[10];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]==arr2[j]){
                    arr3[c]=arr2[j];
                    c++;

                    arr2[j]=Integer.MAX_VALUE;
                }
            }
        }
      
        for(int i=0;i<c;i++){
            System.out.print(arr3[i]+" ");
        }
        scanner.close();
    }
}
