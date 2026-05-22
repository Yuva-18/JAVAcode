package dsa.Sorting;
import java.util.*;

class MergeSortSolution{
    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left <= mid){
            temp.add(arr[left++]);
        }

        while(right <= high){
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);

    }
    public void mergesort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int mid = low + (high - low) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
}



public class MergeSort {
    public static void main(String[] args){
        int[] arr = {30,20,90,40,60,50,70};
        MergeSortSolution sol = new MergeSortSolution();
        sol.mergesort(arr,0,arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

    }
}
