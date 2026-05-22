package dsa.Sorting;

class QuickSortSolution{
    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            int par = partition(arr, low, high);
            quickSort(arr, low, par-1);
            quickSort(arr, par+1, high);
        }
    }
    public int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(i <= high - 1 && arr[i] <= pivot){
                i++;
            }

            while( j >= low + 1 && arr[j] >= pivot) {
                j--;
            }

            if(i < j){
                swap(arr, i, j);
            }
        }
        if(i > j){
            swap(arr, j, low);
        }

        return j;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {4,6,2,5,7,9,1,3};
        QuickSortSolution sol = new QuickSortSolution();
        sol.quickSort(arr,0,arr.length-1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
