package org.example.Entity;

import org.example.State;

public class ToTruong implements State {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 300000; // Phụ cấp Tổ Trưởng
    }
}
