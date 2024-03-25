public class SecondMaximum {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public int secondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 8, 4, 3, 5, 2, 1};
        SecondMaximum sm = new SecondMaximum();
        sm.printArray(arr);
        System.out.println(sm.secondMaximum(arr));
    }
}
