package BTOOP;

public class Information extends Persion {
    public Information(String name, int age, String gender, String address, String phone) {
        super(name, age, gender, address, phone);
    }

    public static void main(String[] args) {
        Information BT = new Information("Viet", 29, "nam", "ha noi", "0999992");
        System.out.println(BT.getName());

        BT.setName("linh1");
        System.out.println(BT.getName());
    }
}
