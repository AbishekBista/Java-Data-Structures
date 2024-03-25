public class ResizeArray {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];// making old array reference point to the new array

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ResizeArray re = new ResizeArray();
        re.printArray(array);
        array = re.resizeArray(array, array.length *2);
        re.printArray(array);
        System.out.println(array.length);
    }
}
