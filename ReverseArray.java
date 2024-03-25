public class ReverseArray {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ReverseArray re = new ReverseArray();
        re.printArray(array);
        re.reverseArray(array, 0, array.length - 1);
        re.printArray(array);
    }
}
