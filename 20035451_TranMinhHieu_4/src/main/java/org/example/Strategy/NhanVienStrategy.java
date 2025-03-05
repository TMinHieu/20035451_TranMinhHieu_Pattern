package org.example.Strategy;

import org.example.Strategy.TinhLuongStrategy;

public class NhanVienStrategy {
    private String ten;
    private double luongCoBan;
    private TinhLuongStrategy luongStrategy; // Chiến lược tính lương

    public NhanVienStrategy(String ten, double luongCoBan, TinhLuongStrategy luongStrategy) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.luongStrategy = luongStrategy;
    }

    public void setLuongStrategy(TinhLuongStrategy luongStrategy) {
        this.luongStrategy = luongStrategy;
    }

    public void hienThiLuong() {
        System.out.println("Nhan vien: " + ten);
        System.out.println("Luong nhan duoc: " + luongStrategy.tinhLuong(luongCoBan) + " VND");
    }
}
