package org.example.Entity;

import org.example.State;

public class TruongPhong implements State {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 700000; // Phụ cấp Trưởng Phòng
    }
}
