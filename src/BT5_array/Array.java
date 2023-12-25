package BT5_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//- Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
//- Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
public class Array {
    public void ham1 (){
        Map<String, String> hashMap= new HashMap<>();
        hashMap.put("LinhLT", "29 age");
        System.out.println("Thong tin nhan vien" + hashMap);

    }
    public static void main(String[] args) {
        Array BT = new Array();
        BT.ham1();


    }
}
