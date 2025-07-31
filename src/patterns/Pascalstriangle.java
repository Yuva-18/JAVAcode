package patterns;

public class Pascalstriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0; row <= n*2; row++){
            int no_of_cols = row > n ? 2*n - row : row;
            for(int col = 0; col < no_of_cols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
