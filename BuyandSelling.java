/**
 * BuyandSelling
 */
public class BuyandSelling {
    static int maxProfit(int arr[]){
        int maxProfit=0;
        int minsofar=arr[0];
        for(int i=0;i<arr.length;i++){
            minsofar=Math.min(minsofar, arr[i]);
            int profit = arr[i]-minsofar;
            maxProfit=Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={3,1,4,8,7,2,5};
        
        System.err.println(maxProfit(arr));
    }
}