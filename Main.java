public class Main {
    public static void main(String[] args) {
        int arr[] = {14, 77, 35, 68, 22, 93, 49};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = tmp;
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}