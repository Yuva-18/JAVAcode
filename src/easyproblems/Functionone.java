package easyproblems;

public class Functionone {
    public static int add(int[][] arr) {
        int a = 10, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = a;
                b += a;
                a += 10
                ;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};
        Functionone obj = new Functionone();
        System.out.println(obj.add(arr));
    }

}
