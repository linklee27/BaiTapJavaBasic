package BT5_array;

import java.util.ArrayList;

//        1. Tìm số lần xuất hiện của một phần tử trong mảng
//        2. Tìm vị trí của một phần tử trong mảng
//        3. Đếm số phần tử lớn hơn một giá trị x trong mảng
//        4. Kiểm tra mảng có phần tử trùng lặp không
//        5. Chia mảng thành hai phần, một chứa các số chẵn và một chứa các số lẻ _ sử dụng arraylist
//        6. chi in mang chan, k dung array list
public class Mang_2 {
    public int bai1() {
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10, 1, 2, 3, 5, 6};
        int bien = 2;
        int dem = 0;
        for (int i : mang) {
            if (i == bien) {
                dem = dem + 1;
            }
        }

        return dem;
    }

    public ArrayList<Integer> bai2() {
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10, 1, 2, 3, 5, 6};
        int bien = 2;

        ArrayList<Integer> vitri = new ArrayList<>();
        for(int i = 0; i < mang.length; i++){
            if (mang[i] == bien){
                vitri.add(i);
            }
        }

        return vitri;
    }

    public int bai3(){
        int mang[] = {1,2,3,4,5,6,7,8,9,10};
        int so = 5;
        int dem = 0;
        for (int i : mang){
            if (i > so){
                dem = dem + 1;
            }
        }
        return dem;

    }

    public boolean bai4(){
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10, 1, 2, 3, 5, 6};
        boolean trunglap = false ;
        for (int i =0; i < mang.length; i ++){
            for (int j = i + 1; j < mang.length; j++){
                if(mang[i] == mang[j]){
                    trunglap = true;
                }
            }
        }
        return trunglap;
    }

    public boolean bai4_2(){
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 10};
        for (int i =0; i < mang.length; i ++){
            for (int j = i + 1; j < mang.length; j++){
                if(mang[i] == mang[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public void bai5() {
        int mang[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 20,41 ,52};
        ArrayList<Integer> mangchan = new ArrayList<>();
        ArrayList<Integer> mangle = new ArrayList<>();
        for(int i : mang){ // dùng for cải tiến
            if (i % 2 ==0){
                mangchan.add(i);
            }
            else mangle.add(i);
        }

        System.out.println("mang chan la:"+mangchan);
        System.out.println("mang le la:"+mangle);
    }

    public void bai6(){  //for1 để lấy ra số lượng số chắn trong mảng; for2 để lấy các số chẵn trong mảng.
        int demsochan = 0;
        int mang[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                demsochan = demsochan + 1;
            }
        }
        int sochan = 0;
        int mangchan[] = new int[demsochan];
        for(int i = 0; i < mang.length; i++){
            if(mang[i] % 2 == 0){
                mangchan[sochan] = mang[i];
                sochan = sochan + 1;
            }
        }

        for (int i: mangchan){
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        Mang_2 BT = new Mang_2();

        int count = BT.bai1();
        System.out.println(count);

        ArrayList<Integer> vitri = BT.bai2();
        System.out.println("vi tri:" + vitri);

        int count3 = BT.bai3();
        System.out.println("so long so > 5 là:" + count3);

        boolean trunglap = BT.bai4();
        if (trunglap == true){
            System.out.println("có trùng");
        }
        else System.out.println("Không trùng");

        boolean trunglap2 = BT.bai4_2();
        if (trunglap2 == true){
            System.out.println("có trùng");
        }
        else System.out.println("Không trùng");

        BT.bai5();

        BT.bai6();








    }

}
