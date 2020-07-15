package sorting_algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {

int[] intArray = {35,20,-15,7,55,1,-22};


// O(n2) most of the time Loop can be considered n

// Worst case  Time:  O(n^2)  | Space  O(1) in-place alg | Stable
for(int lastUnsortedIdx = intArray.length-1; lastUnsortedIdx>0;lastUnsortedIdx--){
    for(int i=0;i<lastUnsortedIdx;i++){
        if(intArray[i] > intArray[i+1]){
            int temp = intArray[i];
            intArray[i] = intArray[i+1];
            intArray[i+1] = temp;

        }

    }
}




//        for(int i : intArray){
//            System.out.println(i);
//        }

        IntStream intStream = Arrays.stream(intArray);
       intStream.forEach(System.out::println);

    }

    public static void swap(int[] arr, int i , int j){
            if(i==j) return;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
