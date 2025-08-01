package easyproblems;

public class Amstrongnum {
    public static void main(String[] args){
        int n = 153;
        int original = n, rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = rev + (rem * rem * rem);;
            n = n/10;
        }
        if(original == rev){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }


}
