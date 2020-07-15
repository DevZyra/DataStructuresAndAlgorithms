package sorting_algorithms;

public class MergeSort {
    public static void main(String[] args) {

        int[] intArray = {11,31,-5,0,-7,12 ,39 };


    }


 public static void mergeSort(int[] input, int startIdx, int endIdx){
        //base case
     if(endIdx-startIdx <2) return;


     int midIdx = (startIdx + endIdx)/2;
     mergeSort(input,startIdx,midIdx);
     mergeSort(input,midIdx,endIdx);
     merge(input,startIdx,midIdx,endIdx);
 }
 public static void merge(int[] input, int startIdx,int midIdx,int endIdx){

                        // >=  for desc. order
        if(input[midIdx-1] <= input[midIdx]) return;

        int i = startIdx;
        int j = midIdx;

        int tempIdx=0;
        int[] temp = new int[endIdx-startIdx];
        while(i<midIdx && j<endIdx){
                                    // >= for desc. order
            temp[tempIdx++] = input[i] <= input[j] ? input[i++] : input[j++];

        }
        System.arraycopy(input,i,input,startIdx+tempIdx,midIdx-i);
        System.arraycopy(temp,0,input,startIdx,tempIdx);
 }
}
