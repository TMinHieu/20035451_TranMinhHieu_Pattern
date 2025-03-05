package org.example.Entity;

import org.example.State;

public class TienSi implements State {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 800000; // Phụ cấp Trưởng Phòng
    }
}

