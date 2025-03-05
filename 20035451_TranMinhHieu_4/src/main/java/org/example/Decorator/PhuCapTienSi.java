package org.example.Decorator;

public class PhuCapTienSi extends NhanVienDecorator {
    public PhuCapTienSi(NhanVienComponent nhanVien) {
        super(nhanVien);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 500; // Thêm 5 triệu
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " + Phụ cấp Tiến sĩ";
    }
}
