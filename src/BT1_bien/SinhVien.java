package BT1_bien;
//Tạo project mới dành cho bài tập
//Tạo class: SinhVien, ThongTin
//Class SinhVien: khai báo 3 loại biến (local, instance, static) gọi lại in ra ở 3 hàm trong class sau đó gọi nó ở hàm main
//Class ThongTin: khai báo các biến static để gọi lại ở class SinhVien và in ra thông tin

//GỌI BIẾN, HÀM - SOUT THONG TIN ĐÚNG NHƯ KHAI BÁO
public class SinhVien {
    String name = "LinhLT";          //bien toan cuc
    static int age = 29;            //bien static
    public void Ham(){             //ham
        String Quan = "Thanh trì";
        System.out.println(Quan);
    }

    public static void main(String[] args) {
        String diachi = "Ha Noi";     //bien cuc bo
        System.out.println(diachi);

        SinhVien SV = new SinhVien();  //khoi tao bien thong qua class
        System.out.println(SV.name); //goi bien toan cuc
        System.out.println(age);     //goi bien static
        SV.Ham();                   //goi ham
    }
}

//SOUT THONG TIN TÙY Ý, KHÔNG GIỐNG KHAI BÁO BẰNG CÁCH TẠO HÀM XAY DUNG, TRUYỀN VÀO GIÁ TRỊ
//public class SinhVien {
//    String name = "LinhLT";
//    int age = 29;

//    public SinhVien (String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public static void main(String[] args) {
//        SinhVien SV = new SinhVien("Lê Thị Linh", 29);
//        System.out.println(SV.name);
//        System.out.println(SV.age);
//    }
//}

//SOUT THONG TIN TÙY Ý, KHÔNG GIỐNG KHAI BÁO BẰNG CÁCH TẠO HÀM SET, GET
//public class SinhVien {
//    String name = "LinhLT";

//    public void setName(String name){
//        this.name = name;
//    }
//    public void getName(){
//        System.out.println(this.name);
//    }
//    public static void main(String[] args) {
//        SinhVien SV = new SinhVien();
//        SV.setName("Lê Thị Linh");
//        SV.getName();
//    }
//}
//GỌI CLASS KHÁC, SOUT THÔNG TIN VỚI GIÁ TRỊ ĐÃ KHAI BÁO
//public class SinhVien {
//
//    public static void main(String[] args) {
//        ThongTin TT = new ThongTin();
//        System.out.println(TT.tinhtrang);
//
//    }
//}
//GỌI CLASS KHÁC, SOUT THÔNG TIN TÙY Ý KHÔNG GIỐNG KHAI BÁO BẰNG CÁCH TẠO HÀM XAY DUNG, TRUYỀN VÀO GIÁ TRỊ PHÍA CLASS KHÁC
//public class SinhVien {
//    public static void main(String[] args) {
//        ThongTin TT = new ThongTin("chua kh");
//        System.out.println(TT.tinhtrang);
//    }
//}
//GỌI CLASS KHÁC, SOUT THÔNG TIN TÙY Ý KHÔNG GIỐNG KHAI BÁO BẰNG CÁCH TẠO HÀM SET, GET PHÍA CLASS KHÁC
//public class SinhVien {
//    public static void main(String[] args) {
//        ThongTin TT = new ThongTin();
//        TT.setTT("Chuaw kh1");
//        TT.getTT();
//    }
//}