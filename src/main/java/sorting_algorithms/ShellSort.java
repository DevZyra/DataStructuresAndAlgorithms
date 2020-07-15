package sorting_algorithms;

public class ShellSort {
    public static void main(String[] args) {

        int[] intArray = {35, 20, -15, 7, 55, 1, -22};

//Worst case O(n^2) / in-place / UNstable
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {

                int element = intArray[i];

                int j = i;
                while (j >= gap && intArray[j - gap] > element) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = element;
            }

        }

        for (int i : intArray) {
            System.out.println(i);
        }


    }
    }
