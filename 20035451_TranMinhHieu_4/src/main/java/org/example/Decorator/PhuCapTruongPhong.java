package org.example.Decorator;

public class PhuCapTruongPhong extends NhanVienDecorator {
    public PhuCapTruongPhong(NhanVienComponent nhanVien) {
        super(nhanVien);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 700; // Thêm 7 triệu
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " + Phụ cấp Trưởng phòng";
    }
}
