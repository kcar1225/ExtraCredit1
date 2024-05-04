


public class Problem2 {
    public static void mergedArrays(int[] A, int x, int[] B, int y) {
        //last index of arrays and merged array
        int indexA = x - 1;
        int indexB = y - 1;
        int mergedIndex = x + y - 1;

        // merge arrays from the end
        while (indexA >= 0 && indexB >= 0) {
            if (A[indexA] > B[indexB]) {
                A[mergedIndex--] = A[indexA--];
            } else {
                A[mergedIndex--] = B[indexB--];
            }
        }

        //add remaining elements in B and merge to arrayA
        while (indexB >= 0) {
            A[mergedIndex--] = B[indexB--];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10]; //array A element
        A[0] = 4;
        A[1] = 6;
        A[2] = 8;

        int[] B = {5, 7, 9};  //array B elements
        mergedArrays(A, 3, B, 3);

        for (int num : A) {
            System.out.print(num + " "); //print
        }

    }
}

//Time complexity of this code is O(n) becasue it iterates the number of element in the arrays



