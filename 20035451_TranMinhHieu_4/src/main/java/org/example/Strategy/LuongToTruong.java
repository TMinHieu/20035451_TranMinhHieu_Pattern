package org.example.Strategy;

public class LuongToTruong implements TinhLuongStrategy {
    @Override
    public double tinhLuong(double luongCoBan) {
        return luongCoBan + 300000;
    }
}
