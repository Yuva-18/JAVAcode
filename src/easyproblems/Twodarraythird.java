package easyproblems;

import java.util.Scanner;

public class Twodarraythird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r][c];
        int a =10;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == j){
                    arr[i][j] = a;
                    a+=10;
                }
            }
        }
        System.out.println("Matrix");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i != j){
                    arr[i][j] = a;
                    a+=10;
                }
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose Matrix");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
