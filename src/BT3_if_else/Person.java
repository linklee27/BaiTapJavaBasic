package BT3_if_else;

public class Person {
    public String ten;
    public int tuoi;

    public Person(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

//    public void setName(String name){
//        this.ten = name;
//    }
//    public void setAge(int age){
//        this.tuoi = age;
//    }

    public void result() {
        System.out.println(ten);
        System.out.println(tuoi);
    }
}