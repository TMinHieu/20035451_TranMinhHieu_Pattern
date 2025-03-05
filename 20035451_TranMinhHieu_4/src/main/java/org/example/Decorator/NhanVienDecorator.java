package org.example.Decorator;

public abstract class NhanVienDecorator implements NhanVienComponent {
    protected NhanVienComponent nhanVien;

    public NhanVienDecorator(NhanVienComponent nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public double tinhLuong() {
        return nhanVien.tinhLuong();
    }

    @Override
    public String getMoTa() {
        return nhanVien.getMoTa();
    }
}
