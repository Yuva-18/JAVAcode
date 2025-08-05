package easyproblems;

public class Mergearray {
    public static void main(Stringval[] args) {
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {50,60,70,80};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }
        for(int num : arr3){
            System.out.print(num+ " ");
        }



    }



}
