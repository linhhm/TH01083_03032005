package com.example.th01083_03032025;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float gia;
    private int soLuong;
    private String danhMuc;
}
