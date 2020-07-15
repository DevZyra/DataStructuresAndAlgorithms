package sorting_algorithms;

public class CountingSort {
    public static void main(String[] args) {

        int[] array = {2,5,9,8,2,8,7,10,4,3};



    }
// This implementation is NOT-stable
    public static void countingSort(int[] input, int min,int max){

        int[] countArr = new int[(max - min) +1];

        for(int i=0;i<input.length;i++){
            countArr[input[i]- min]++;
        }

        int j = 0;
        for (int i = min; i <max ; i++) {
           while (countArr[i-min]>0){
               input[j++] = i;
               countArr[i-min]--;
           }

        }

    }
}
