package easyproblems;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        String s = "Reverse";
        String rev = " ";
        for(int i = s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    }
}

