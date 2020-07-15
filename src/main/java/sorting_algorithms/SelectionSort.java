package sorting_algorithms;

public class SelectionSort {
    public static void main(String[] args) {


        int[] intArr = {-39,99,-7,22,50,0,-7,-17};


// assumption that arr[0] = largest
// arr[largest] == arr[0] at the begining
// check if arr[i] > arr[largest]
// if so: arr[i-> largest]
// repeat

// Worst case  Time:  O(n^2)  | Space  O(1) in-place alg | UNstable
for(int lastUnsorted=intArr.length-1;lastUnsorted>0;lastUnsorted--){
    int largest = 0;
        for(int i=0;i<=lastUnsorted;i++){
            if(intArr[i] > intArr[largest]){
                largest=i;
            }


        }
    // swap
     int temp = intArr[lastUnsorted];
     intArr[lastUnsorted] = intArr[largest];
     intArr[largest] = temp;
}

for(int i : intArr){
    System.out.println(i);
}

    }
    public static void swap(int[] arr, int i , int j){
        if(i==j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
