public class MaximunInArray {
    static int max(int arr[],int n){
        int m= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;

    
    }
    public static void main(String[] args) {
        int arr[]={11,9,4,9,10,15};
        int n = arr.length;
        int max = max(arr, n);
        System.out.println(max);
    }
}
