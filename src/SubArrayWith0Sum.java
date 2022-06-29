import java.util.HashMap;

public class SubArrayWith0Sum {


    public static boolean subArrayWith0Sum(int arr[], int n){
        HashMap<Integer, Boolean> map = new HashMap<>();

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum==0){
                return true;
            }
            if(map.containsKey(sum)){
                return true;
            }
            map.put(sum, true);

        }return false;
    }



    public static void main(String[] args) {

    }
}
