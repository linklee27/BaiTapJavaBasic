package BT3_if_else;
//"- Tạo hàm truyền tham số int ""n"" và Dùng câu lệnh IF Else để đặt điều kiện cho tham số n truyền vào đó:
//        + TH1:  = n
//        + TH2:  > n
//        + TH3:  < n"
//        - Gọi lại hàm này xuống main để truyền giá trị vào hàm kiểm tra

public class BTifelse {
    //Tạo hàm, truyền vao 1 số, so sánh với 20, rồi in ra kết quả so sánh
    //1. tạo hàm truyền tham số n
    //2. so sánh với 20
    //3. trả về giá trị sau khi so sánh là string
    public String diemso(int n) {
        String bien = "";
        if (n < 20) {
            bien = "hang c";
        } else if (n > 20) {
            bien = "hang b";
        } else if (n == 20) {
            bien = "hang a";
        }
        return bien;
    }

    public static void main(String[] args) {
        BTifelse BT = new BTifelse();
        String indiem = BT.diemso(2);
        System.out.println(indiem);
    }

    //tính tích 2 số, trong đó 1 số là tong của 1 hàm, số còn lại = 10

//    public int tong(int a, int b){
//        return a+b;
//    }
//
//  public static void main(String[] args) {
//      BTifelse BT = new BTifelse();
//      int tich = BT.tong(10, 20) * 10;
//      System.out.println(tich);
//}

}




