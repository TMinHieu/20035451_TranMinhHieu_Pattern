package org.example.Decorator;

public class PhuCapToTruong extends NhanVienDecorator {
    public PhuCapToTruong(NhanVienComponent nhanVien) {
        super(nhanVien);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 300; // Thêm 3 triệu
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " + Phụ cấp Tổ trưởng";
    }
}
