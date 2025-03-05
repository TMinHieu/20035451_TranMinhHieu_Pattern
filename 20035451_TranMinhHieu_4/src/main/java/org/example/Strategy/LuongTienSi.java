package org.example.Strategy;

public class LuongTienSi implements TinhLuongStrategy {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 500000;
    }
}
