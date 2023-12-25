package BT4_For;

//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//- Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào

public class diemso {
    //lưu so chăn vao 1 mang và in ra mang day
    public static void main(String[] args) {
//        int n = 50;
//        int mang[] = new int[n];
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                mang[i-1] = i;
//            }
//        }
//
//        for (int i : mang) {
//            System.out.println("HELLO" + i);
//        }
//
//    }
    int n = 50;
    int mang[] = new int[50];
        for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            mang[i-1] = i;
        }
    }
        for (int i : mang) {
        System.out.println("HELLO" + i);
    }
}
}
