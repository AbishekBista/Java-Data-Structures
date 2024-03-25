public class MissingNumber {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public int findMissingNumber(int[] arr) {
        int upperRange = arr.length + 1;
        int actualSum = (upperRange * (upperRange + 1)) / 2;

        for(int i = 0; i < arr.length; i++) {
            actualSum -= arr[i];
        }
        
        return actualSum; 
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 1, 8, 6, 3, 7, 5};
        MissingNumber mn = new MissingNumber();
        mn.printArray(numbers);

        int missingNumber = mn.findMissingNumber(numbers);
        System.out.println(missingNumber);

    }
}
