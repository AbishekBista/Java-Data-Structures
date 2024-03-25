public class MinimumValue {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public int findMinValue(int[] arr) {
        int length = arr.length;
        int minValue = arr[0];

        for(int i = 1; i < length; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        return minValue;
    }
    public static void main(String[] args) {
        int[] array = {5, 76, 8, 3, 6, 2, 1, 7};

        MinimumValue mv = new MinimumValue();

        mv.printArray(array);

        System.out.println(mv.findMinValue(array));

    }
}
