package com.example.motorshop.datasrc;

public class DonDatHang {
    private String maDH;
    private String ngayDat;
    private String sdtKH;
    private String tenNV;

    public DonDatHang() { }

    public DonDatHang(String maDH, String ngayDat, String sdtKH, String tenNV) {
        this.maDH = maDH;
        this.ngayDat = ngayDat;
        this.sdtKH = sdtKH;
        this.tenNV = tenNV;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
}
