package org.example;

import org.example.Decorator.*;
import org.example.Entity.*;
import org.example.Strategy.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhap ten nhan vien: ");
//        String ten = scanner.nextLine();
//
//        System.out.print("Nhap luong co ban: ");
//        double luongCoBan = scanner.nextDouble();
//        scanner.nextLine(); // Xóa bộ nhớ đệm
//
//        NhanVien nv = new NhanVien(ten, luongCoBan);
//
//        System.out.println("Chon chuc vu:");
//        System.out.println("1. Tien Si");
//        System.out.println("2. Truong Phong");
//        System.out.println("3. To Truong");
//        System.out.println("4. Nhan Vien Thuong");
//        System.out.print("Nhap Lua Chon: ");
//        int chon = scanner.nextInt();
//
//        switch (chon) {
//            case 1:
//                nv.setChucVu(new TienSi());
//                break;
//            case 2:
//                nv.setChucVu(new TruongPhong());
//                break;
//            case 3:
//                nv.setChucVu(new ToTruong());
//                break;
//            default:
//                nv.setChucVu(new NhanVienThuong());
//                break;
//        }
//        //Decorator
//        //Nhân viên cơ bản
//        NhanVienComponent nv = new NhanVienCoBan("Nguyễn Văn A", 100000);
//        System.out.println(nv.getMoTa() + " - Luong: " + nv.tinhLuong() + " VNĐ");
//
//        // Nhân viên có phụ cấp Tiến sĩ
//        nv = new PhuCapTienSi(nv);
//        System.out.println(nv.getMoTa() + " - Luong: " + nv.tinhLuong() + " VNĐ");
//
//        // Nhân viên có thêm phụ cấp Tổ trưởng
//        nv = new PhuCapToTruong(nv);
//        System.out.println(nv.getMoTa() + " - Luong: " + nv.tinhLuong() + " VNĐ");
//
//        // Nhân viên có thêm phụ cấp Trưởng phòng
//        nv = new PhuCapTruongPhong(nv);
//        System.out.println(nv.getMoTa() + " - Luong: " + nv.tinhLuong() + " VNĐ");

        // Strategy Pattern
        // Nhân viên thường
        NhanVienStrategy nv = new NhanVienStrategy("Nguyen Van A", 100000, new LuongNhanVienThuong());
        nv.hienThiLuong();

        // Đổi sang Nhân viên có phụ cấp Tổ trưởng
        nv.setLuongStrategy(new LuongToTruong());
        nv.hienThiLuong();

        // Đổi sang Nhân viên có phụ cấp Trưởng phòng
        nv.setLuongStrategy(new LuongTruongPhong());
        nv.hienThiLuong();

        // Đổi sang Nhân viên có bằng Tiến sĩ
        nv.setLuongStrategy(new LuongTienSi());
        nv.hienThiLuong();
    }
}