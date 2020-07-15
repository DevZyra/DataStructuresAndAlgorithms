package data_structures;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] intArr = {-22,-15,1,7,20,35,55};


        System.out.println(iterBinarySearch(intArr,1));

        System.out.print("Arrays.binarySearch result ->");
       System.out.print(Arrays.binarySearch(intArr, 55));
    }

public static int iterBinarySearch(int[] input , int val){
        int start = 0;
        int end = input.length;

        while (start<end){
            int midpoint = (start+end) /2;
            if(input[midpoint] == val){
                return midpoint;
            }else if(input[midpoint]<val){
                start = midpoint +1;
            }else if(input[midpoint]>val){
                end = midpoint;
            }

        }
  return -1;}
}
