package BT2_ham_phuongthuc;

//Bài tập: Tại class Calculator:
//        - Tạo hàm tính tổng 2 số nguyên
//        - Tạo hàm tính tích 2 số thực
//        *** Gọi lại 2 hàm trên và truyền tham số vào dưới hàm main để chạy
//b2. tính tích 2 số, trong đó 1 số là tong của 1 hàm, số còn lại = 10
public class Calculator {
    public int conghaiso(int a, int b){ //khai báo hàm tính tổng (k có static)
        return  a + b;
    }
    public float tichhaiso (float c, float d){ //khai báo hàm tính tích
        return c*d;
    }

    public static void main(String[] args) {
        Calculator CL = new Calculator();
        System.out.println("tổng là" + ":" + CL.conghaiso(3,4)); //gọi hàm tính tổng
        System.out.println("tích là" + ":" + CL.tichhaiso(5/2, 7/2)); //gọi hàm tính tích

    }
}
//cách 2, có thể khai báo hàm có static
//static int sum(int a, int b){
//    return a+b;
//}
//    public static void main(String[] args) {
//        System.out.println(sum(3,4));
//    }


//tính tích 2 số, trong đó 1 số là tong của 1 hàm, số còn lại = 10
//    public int tong(int a, int b){
//        return a+b;
//    }
//  public static void main(String[] args) {
//      BTifelse BT = new BTifelse();
//      int tich = BT.tong(10, 20) * 10;
//      System.out.println(tich);
//}
