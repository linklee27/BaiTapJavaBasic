package BT1_bien;

public class ThongTin {

    String tinhtrang = "da ket hon";

    public ThongTin(String tinhtrang){ //HAM KHOI TAO - k cos void
        this.tinhtrang=tinhtrang;
    }
    public void setTT(String tinhtrang){ //HAM GET, SET
        this.tinhtrang=tinhtrang;
    }
    public void getTT(){
        System.out.println(this.tinhtrang);
    }

    public static void main(String[] args) {

    }
}
