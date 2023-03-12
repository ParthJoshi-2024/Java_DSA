import java.util.ArrayList;

/**
 * Count01
 */
public class Count01 {
    static ArrayList<Integer> count(int arr[],int n){
        int c0=0;
        int c1=0;
        int c2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }

        }
          
        ArrayList<Integer> a= new ArrayList<>();
        while(c0>0){
            a.add(0);
            c0--;
        }
        while(c1>0){
            a.add(1);
            c1--;
        }while(c2>0){
            a.add(2);
            c2--;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        System.out.println(count(arr, n));
    }
}
