public class MoveZeroes {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public void moveZeroes(int[] arr, int n) {
        // j is used to point towards 0 elements
        // i is used to point towards non-0 elements
        int j = 0;

        for(int i = 0; i < n; i++) {
            // if i points to non-zero elements and
            // j points to zero elements
            // swap them
            if(arr[i] != 0 && arr[j] ==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            // if j points to non-zero elements which it is not supposed to do
            // move j to next location
            if(arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 12};
        MoveZeroes mv = new MoveZeroes();
        mv.printArray(arr);

        mv.moveZeroes(arr, arr.length);
        mv.printArray(arr);
        
    }
}
