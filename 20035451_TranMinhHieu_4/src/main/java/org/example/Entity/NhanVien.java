package org.example.Entity;

import org.example.State;

public class NhanVien {
    private String ten;
    private double luongCoBan;
    private State chucVu; // Sử dụng đúng kiểu dữ liệu

    public NhanVien(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.chucVu = new NhanVienThuong();
    }

    public void setChucVu(State chucVu) { // Dùng interface State, không dùng ToTruong
        this.chucVu = chucVu;
    }

    public void hienThiLuong() {
        System.out.println("Nhân viên: " + ten);
        System.out.println("Lương nhận được: " + chucVu.tinhLuong(luongCoBan) + " VNĐ");
    }
}
