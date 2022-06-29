import java.util.HashMap;

public class SubArrayWith0Sum {


    public static boolean subArrayWith0Sum(int arr[], int n){
        //get a map to store the sums
        HashMap<Integer, Boolean> map = new HashMap<>();
        int sum = 0;

        //get the sum by adding the consecutive elements
        for(int i=0; i<n; i++){
            sum += arr[i];

            //if sum itself becomes 0 then return true
            if(sum==0){
                return true;
            }
            //or if map contains another sum of same count which means
            // sum (......) sum; dotted area's sum is zero
            //and return true;
            if(map.containsKey(sum)){
                return true;
            }
            //else just put the sum in the map
            map.put(sum, true);

        }return false;
    }



    public static void main(String[] args) {

    }
}
