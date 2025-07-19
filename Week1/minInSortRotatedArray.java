
package Week1;
import java.util.*;

public class minInSortRotatedArray {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int N= sc.nextInt();
       int[] arr =new int[N];
       for(int i =0; i<N; i++){
        arr[i]=sc.nextInt();

       }
       sc.close();
       System.out.println(findMinBinarySearch(arr));
    
    }
    public static int findMinBinarySearch(int[] arr){
        int low=0;
        int high= arr.length -1;
        while(low< high){
            int mid= low + (high-low)/2;
            if(arr[mid]> arr[high]){
                low=mid+1;
            }
            else{
                high= mid;
            }
        }
        return arr[low];
    }
    
}
