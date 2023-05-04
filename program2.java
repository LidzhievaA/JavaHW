// 2. Задать одномерный массив и найти в нем минимальный и максимальный элементы 

import java.util.Arrays;

public class program2 {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 111, 3, 5, 8, 4};
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minVal){
                minVal = arr[i];
            }
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println(minVal+" "+maxVal);
    
    } 
}

// int[] array = {5, 4, 1, 89, 8, 147};
// System.out.println(Arrays.stream(array).min());
// System.out.println(Arrays.stream(array).max());
