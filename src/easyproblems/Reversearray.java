package easyproblems;

public class Reversearray {
    public static void main(Stringval[] args) {
        int[] arr = {10,100,1000,10000};
        int i = 0 , j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);

    }

}
