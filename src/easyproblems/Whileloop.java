package easyproblems;

public class Whileloop {
    public static void main(String[] args){
        int a = 1;
        while(a <= 50){
            int num = a;
            if(num % 2 == 0){
                System.out.println(num);
            }
            a++;
        }
    }
}
