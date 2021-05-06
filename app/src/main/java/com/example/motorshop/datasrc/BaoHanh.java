package com.example.motorshop.datasrc;

public class BaoHanh {
    private String maBH;
    private String maDH;
    private String ngayBH;

    public BaoHanh() { }

    public BaoHanh(String maBH, String maDH, String ngayBH) {
        this.maBH = maBH;
        this.maDH = maDH;
        this.ngayBH = ngayBH;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getNgayBH() {
        return ngayBH;
    }

    public void setNgayBH(String ngayBH) {
        this.ngayBH = ngayBH;
    }
}
