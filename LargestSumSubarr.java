public class LargestSumSubarr {
    // Kadanes Algorithm
    static int maxSubArraySum(int arr[]){
        int currSum=0;
        int maxSum =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum+arr[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, -1, -5, -3 };
        System.out.println("Maximum contiguous sum is "
                           + maxSubArraySum(a));

    }
}
