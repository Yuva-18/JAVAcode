package patterns;

public class Pascalstriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i <= n*2; i++){
            int no_of_cols = i > n ? 2*n - i : i;
            for(int col = 0; col < no_of_cols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
