class FilterEvenElements {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public int[] filterEventElements(int[] arr) {
        int n = arr.length;
        int oddCount = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int oddIndex = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                result[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FilterEvenElements fe = new FilterEvenElements();
        fe.printArray(new int[] {1, 2, 3, 4, 5});
        int[] r = fe.filterEventElements(new int[] {1, 2, 3, 4, 5});
        fe.printArray(r);
    }
}