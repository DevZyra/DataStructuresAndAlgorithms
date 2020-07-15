package sorting_algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = {11,31,-5,0,-7,12 ,39 };


// Worst case  Time:  O(n^2)  | Space  O(1) in-place alg | Stable
for(int firstUnsortedIdx = 1; firstUnsortedIdx<intArray.length;firstUnsortedIdx++ ){
// Outerloop with assumption that first element is sorted

    // holder for checked value if correct position, if > then arr[i-1] leave it be
    int newElement = intArray[firstUnsortedIdx];
    // for iteration purpose so can be decremented for checking if arr[i-1] > current element
    int i;
        for(i=firstUnsortedIdx; i>0 && intArray[i-1]>newElement;i--){
            intArray[i] = intArray[i-1];
        }
    // at the end we assign the checked value
    intArray[i] = newElement;

}


        for(int i : intArray){
            System.out.println(i);
        }



    }
 // Insertion sort with recursion
    public static void insertionSort(int[] input, int numItems){
        if(numItems<2) return;

            insertionSort(input,numItems-1);

        int newElement = input[numItems-1];

        int i;
        for(i=numItems-1; i>0 && input[i-1]>newElement;i--){
            input[i] = input[i-1];
        }

        input[i] = newElement;
    }
}
