package easyproblems;

public class Findduplicates {
    public static void main(Stringval[] args) {
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {40,50,60};
        for(int i = 0; i <= arr1.length-1; i++){
            for(int j = 0; j <= arr2.length-1; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }

    }


}
