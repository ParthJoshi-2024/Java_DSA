import java.util.Scanner;

public class FrequencyEle {
    public static void main(String[] args) {
        System.out.print("Size:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int c=0;
        int ans[]=new int[8];
        int i=0;
       
        while(i<n){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                }
                else{
                    break;
                }
            }
            ans[c]=count;
            c++;
            i=i+count;
        }
       
        for(int a=0;a<c;a++){
           
            System.out.print(ans[a]+" ");
        }
        boolean b=true;
        for(int k=0;k<c;k++){
            for(int l=k+1;l<c;l++){
                if(ans[k]==ans[l]){
                    b=false;
                }
            }
        }
        if(b==false){
            System.out.print("Not Unique Occ");
        }
        else{
            System.out.print("Unique Occurence:");
        }
        scanner.close();
    }

}
