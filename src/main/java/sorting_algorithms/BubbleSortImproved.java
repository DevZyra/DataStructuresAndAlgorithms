package sorting_algorithms;

public class BubbleSortImproved {
    public static void main(String[] args) {


        int[] intArray = {35,20,-15,7,55,1,-22};

// Worst case  Time:  O(n^2)  | Space  O(1) in-place alg | Stable
        for(int lastUnsortIdx = intArray.length-1; lastUnsortIdx>0;lastUnsortIdx--){
            boolean swapped = false;
            for(int i=0;i<lastUnsortIdx;i++){
                if(intArray[i] > intArray[i+1]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                    swapped = true;
                }

             }
            if(swapped = false){
                break;
        }
        }

        for(int i : intArray){
            System.out.println(i);
        }



        // End of Main
            }
}
