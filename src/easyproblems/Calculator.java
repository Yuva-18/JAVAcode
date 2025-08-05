package easyproblems;

public class Calculator {
    int add(int a, int b){
       return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(3,4));
        System.out.println(obj.sub(3,4));
    }
}
