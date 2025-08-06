package dsa;

import java.util.HashMap;

public class Twosum {
    public static int[] twosum(int[] arr,int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            int num = arr[i];
            int needednum = target - arr[i];
            if(map.containsKey(needednum)){
                ans[0] = map.get(needednum);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] result = twosum(arr,target);
        for(int res:result){
            System.out.print(res+" ");
        }
    }
}
