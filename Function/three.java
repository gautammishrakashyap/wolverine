// reverse an Array

import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        

    }
}
