package easyproblems;

import java.util.Scanner;

public class Twodarraysec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int a = 10;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r;i++){
            for(int j = 0; j < c;j++){
                if(i == j){
                    arr[i][j] = a;
                    a+=10;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < r;i++){
            for(int j = 0; j < c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
