package easyproblems;

public class Whileloop {
    public static void main(Stringval[] args){
        int n = 1;
        while(n <= 50){
            int num = n;
            if(num % 2 == 0){
                System.out.println(num);
            }
            n++;
        }
    }
}
