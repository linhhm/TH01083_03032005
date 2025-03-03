package com.example.th01083_03032025;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> list = new ArrayList<>();

    public String update(SanPham sp,String ma, String ten, int namBaoHanh, float gia, int soL, String danhMuc){
        if (sp.getMa().equalsIgnoreCase(ma)){
            sp.setTen(ten);
            sp.setNamBaoHanh(namBaoHanh);
            sp.setGia(gia);
            sp.setSoLuong(soL);
            sp.setDanhMuc(danhMuc);
            return "ma da ton tai, update thanh cong";
        }
        throw new IllegalArgumentException("chua co ma, hay them sp mới");
    }
}
