
import java.util.ArrayList;
import java.util.List;

class PrintSubsequences{

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        printSubsequences(arr,0, new ArrayList<>());

    }
    public static void printSubsequences(int[] arr, int i, List<Integer> current){

        //Base Case (i.e. When to stop)
        if(i == arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[i]);

        printSubsequences(arr, i + 1, current);

        current.remove(current.size() - 1);

        printSubsequences(arr, i + 1, current);

    }
}