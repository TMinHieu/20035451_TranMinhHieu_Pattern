package org.example.Strategy;

public class LuongTruongPhong implements TinhLuongStrategy {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 700000;
    }
}
