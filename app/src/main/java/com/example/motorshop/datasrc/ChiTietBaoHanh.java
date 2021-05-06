package com.example.motorshop.datasrc;

import java.util.ArrayList;

public class ChiTietBaoHanh extends BaoHanh{
    private ArrayList<ThongTinBH_DDH> danhSachBH;

    public ChiTietBaoHanh() {
        super();
    }

    public ChiTietBaoHanh(String maBH, String maDH, String ngayBH, ArrayList<ThongTinBH_DDH> danhSachBH) {
        super(maBH, maDH, ngayBH);
        this.danhSachBH = danhSachBH;
    }

    public ArrayList<ThongTinBH_DDH> getDanhSachBH() {
        return danhSachBH;
    }

    public void setDanhSachBH(ArrayList<ThongTinBH_DDH> danhSachBH) {
        this.danhSachBH = danhSachBH;
    }

}


class ThongTinBH_DDH{                   //Thon tin bao hanh cua 1 Don Dat Hang bat ky
    private String maSP;
    private String noiDungBH;
    private int phiBH;
    private String maNV;

    public ThongTinBH_DDH() { }

    public ThongTinBH_DDH(String maSP, String noiDungBH, int phiBH, String maNV) {
        this.maSP = maSP;
        this.noiDungBH = noiDungBH;
        this.phiBH = phiBH;
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNoiDungBH() {
        return noiDungBH;
    }

    public void setNoiDungBH(String noiDungBH) {
        this.noiDungBH = noiDungBH;
    }

    public int getPhiBH() {
        return phiBH;
    }

    public void setPhiBH(int phiBH) {
        this.phiBH = phiBH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
}
