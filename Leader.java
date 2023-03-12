public class Leader {
    static void findLeader(int arr[],int n){
        int m =0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>m){
                System.out.println(arr[i]);
                m=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={14,20,3,6,5};
        findLeader(arr,5);
    }
}
