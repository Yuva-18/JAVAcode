package easyproblems;

class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+ name + "Age: "+age);
    }
    public static void main(String[] args) {
        Person obj = new Person("Yuva",19);
        obj.display();

    }

}
