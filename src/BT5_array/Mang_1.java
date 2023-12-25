package BT5_array;
//        1. Viết một chương trình tính tổng của các phần tử trong một mảng số nguyên.
//        2. Viết chương trình tìm giá trị lớn nhất trong một mảng số nguyên.
//        3. Viết một chương trình Lặp số từ 0 đến 50. Lưu những giá trị chẵn vào 1 mảng mới. Sau đó hiển thị mảng mới đó ra - dùng arraylist
//        4. Kiểm tra một số có tồn tại trong mảng cho trước hay không
//        5. Viết chương trình để tìm số chẵn đầu tiên trong một mảng số nguyên.
//        6. Viết chương trình kiểm tra xem một mảng số nguyên có được sắp xếp tăng dần không
//        7. Viết chương trình để tìm tất cả các cặp số trong một mảng số nguyên có tổng bằng một số cho trước.
//        8. Viết chương trình để sắp xếp một mảng số nguyên theo thứ tự tăng dần mà không sử dụng phương thức Array.sort().
//        9. Viết chương trình để tìm số lớn thứ hai trong một mảng số nguyên.
//        10. Viết chương trình để lấy ra số nguyên tố trong mảng cho trước.

import java.util.ArrayList;

public class Mang_1 {

    public int bai1() {
        int sum = Integer.MIN_VALUE;
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= mang.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int bai2() {
        int max = 0;
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= mang.length; i++) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public void bai3() {    //cách 2 làm ở bài 6, class Mang_2
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> mangchan = new ArrayList<>();
        for (int i : mang) {
            if (i % 2 == 0) {
                mangchan.add(i);
            }
        }
        System.out.println("Mang chan la:" + mangchan);
    }

    public boolean bai4() {
        int number = 10;
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10, 1, 2, 3, 5, 6};
        //boolean tontai = false ;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int bai5() {
        int sochan = Integer.MIN_VALUE;
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < mang.length; i++) {
            if (i % 2 == 0) {
                sochan = i;
                break;
            }
        }
        return sochan;
    }

    //bài 6 chưa chạy đúng kết quả
//    public boolean bai6(){
//        int mang[] = {1, 2, 3, 4, 5, 8, 7, 10};
//        for (int i =0; i <= mang.length; i ++){
//            if(mang[i+1] >= mang[i]){
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean bai6() {
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10};
        for (int i = 0; i <= mang.length; i++) {
            if (mang[i + 1] >= mang[i]) {
                return true;
            }
        }
        return false;
    }

    //    //bài 7 chua chay duoc
    public void bai7() {
        int sum = 10;
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        //int mangarr[] = new int[n];
        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] + mang[j] == sum) {
                    System.out.println("Tong cua " + mang[i] + " va " + mang[j] + " la: " + sum);
                }
            }
        }
    }

//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//            if(arr[i] + arr[j] == tongCanTim){
//                System.out.println("Tong cua " + arr[i] + " va " + arr[j] + " la: " + tongCanTim);
//            }
//        }
//    }


    public void bai8() {
        int mang[] = {1, 2, 3, 5, 4, 6, 7, 9, 8, 10};
        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {    //nếu đổi dấu < thì là sắp xếp giảm dần.
                    int temp = mang[j];
                    mang[j] = mang[i];
                    mang[i] = temp;
                }
            }
        }
        System.out.println("mang sau sắp xếp là");
        for (int value : mang) {
            System.out.println(value);
        }
    }

//    static void bai9() {                  //cách 2 làm như bai8, sắp xếp giảm dần rồi lấy ra vị trí thứ 2
//        int mang[] = {1,2,3,4,5,6,7,8,10,23};
//        int max = Integer.MIN_VALUE;
//        int maxso2 = Integer.MIN_VALUE;
//        for (int i : mang) {
//            if (mang[i] > max) {
//                max = mang[i];
//                maxso2 = max;
//            } else if (mang[i] > maxso2) {
//                maxso2 = mang[i];
//            }
//        }
//        System.out.println("so max thu 2 la" + maxso2);
//    }

//    public void soNguyenTo() {
//        int mang[] = {1, 2, 5, 6, 5, 3};
//        ArrayList<Integer> soNguyenTo = new ArrayList<>();
//        for(int i : mang){
//            //if(mang[i]){
//                soNguyenTo.add(i);
//            }
//        }
//        System.out.println("so nguyen to trong mang" + soNguyenTo);
//
//    }


    public static void main(String[] args) {
        Mang_1 BT = new Mang_1();

        int tong = BT.bai1();
        System.out.println("Tong mang la:" + tong);

        int max = BT.bai2();
        System.out.println("gia tri max la:" + max);

        BT.bai3();

        boolean kttontai = BT.bai4();
        if (kttontai == true) {
            System.out.println("có ton tai");
        } else System.out.println("Không ton tai");

        int sochan = BT.bai5();
        System.out.println("So chan dau tien la:" + sochan);

        boolean ktdaytang = BT.bai6();
        if (ktdaytang == true) {
            System.out.println("day có tang");
        } else {
            System.out.println("day khong tang");
        }

        BT.bai7();

        BT.bai8();




    }

}

