package com.example.motorshop.datasrc;

public class ChiTietDonDat extends DonDatHang{
    private String tenSP;
    private String soLuong;
    private int donGiaBan;

    public ChiTietDonDat() {
        super();
    }

    public ChiTietDonDat(String maDH, String ngayDat, String sdtKH, String tenNV, String tenSP, String soLuong, int donGiaBan) {
        super(maDH, ngayDat, sdtKH, tenNV);
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGiaBan = donGiaBan;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(int donGiaBan) {
        this.donGiaBan = donGiaBan;
    }
}
