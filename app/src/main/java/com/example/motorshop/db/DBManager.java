package com.example.motorshop.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBManager extends SQLiteOpenHelper {

    public DBManager(Context context) {
        super(context, "dbMOTORSTORE.db", null, 1);
        Log.d("DBManager","1. Create DB");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        ArrayList<String> createTables = new ArrayList<>();
        createTables.add("CREATE TABLE IF NOT EXISTS BOPHAN (MABP text PRIMARY KEY, TENBP text not null)");
        createTables.add("CREATE TABLE IF NOT EXISTS NHANVIEN(MANV text PRIMARY KEY, HOTEN text not null, SDT text not null, MABP text not null, CONSTRAINT FK_NHANVIEN_BOPHAN FOREIGN KEY (MABP) REFERENCES BOPHAN(MABP))");
        createTables.add("CREATE TABLE IF NOT EXISTS KHACHHANG (SDTKH text PRIMARY KEY, TENKH text not null, DIACHI text not null)");
        createTables.add("CREATE TABLE IF NOT EXISTS NHACUNGCAP (MANCC text PRIMARY KEY, TENNCC text not null, DIACHI text not null, SDT text not null, EMAIL text null)");
        createTables.add("CREATE TABLE IF NOT EXISTS XE (MAXE text PRIMARY KEY, TENXE text not null, SOLUONG int not null, DONGIA int not null, HANBAOHANH int not null, IMAGENAME text null, MANCC text not null, CONSTRAINT FK_XE_NHACUNGCAP FOREIGN KEY (MANCC) REFERENCES NHACUNGCAP(MANCC))");
        createTables.add("CREATE TABLE IF NOT EXISTS PHUTUNG (MAPT text PRIMARY KEY, TENPT text not null, SOLUONG int not null, DONGIA int not null, HANBAOHANH int not null, IMAGENAME text null, MANCC text not null, CONSTRAINT FK_PHUTUNG_NHACUNGCAP FOREIGN KEY (MANCC) REFERENCES NHACUNGCAP(MANCC))");
        createTables.add("CREATE TABLE IF NOT EXISTS THONGSOXE (MATS int PRIMARY KEY, TENTS text not null)");
        createTables.add("CREATE TABLE IF NOT EXISTS CHITIETTHONGSOXE (MAXE text not null, MATS int not null, NOIDUNGTS text not null, CONSTRAINT FK_CHITIETTHONGSOXE_XE FOREIGN KEY (MAXE) REFERENCES XE(MAXE), CONSTRAINT FK_CHITIETTHONGSOXE_THONGSOXE FOREIGN KEY (MATS) REFERENCES THONGSOXE(MATS), PRIMARY KEY (MAXE, MATS))");
        createTables.add("CREATE TABLE IF NOT EXISTS THONGSOPHUTUNG (MAPT text, MAXE text, DONGIA int not null, CONSTRAINT FK_THONGSOPHUTUNG_PHUTUNG FOREIGN KEY (MAPT) REFERENCES PHUTUNG(MAPT), CONSTRAINT FK_THONGSOPHUTUNG_XE FOREIGN KEY (MAXE) REFERENCES XE(MAXE), PRIMARY KEY (MAPT, MAXE))");
        createTables.add("CREATE TABLE IF NOT EXISTS DONDATHANG (MADH text primary key, NGAYDAT text not null, SDTKH text not null, MANV text not null, CONSTRAINT FK_DONDATHANG_KHACHHANG FOREIGN KEY (SDTKH) REFERENCES KHACHHANG(SDTKH), CONSTRAINT FK_DONDATHANG_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV))");
        createTables.add("CREATE TABLE IF NOT EXISTS CHITIETDONDATXE (MADH text not null, MAXE text not null, SOLUONG int not null, DONGIABAN int null, CONSTRAINT FK_CHITIETDONDATXE_DONDATHANG FOREIGN KEY (MADH) REFERENCES DONDATHANG(MADH), CONSTRAINT FK_CHITIETDONDATXE_XE FOREIGN KEY (MAXE) REFERENCES XE(MAXE), PRIMARY KEY (MADH, MAXE))");
        createTables.add("CREATE TABLE IF NOT EXISTS CHITIETDONDATPHUTUNG (MADH text not null, MAPT text not null, SOLUONG int not null, DONGIABAN int null, CONSTRAINT FK_CHITIETDONDATPHUTUNG_DONDATHANG FOREIGN KEY (MADH) REFERENCES DONDATHANG(MADH), CONSTRAINT FK_CHITIETDONDATPHUTUNG_PHUTUNG FOREIGN KEY (MAPT) REFERENCES PHUTUNG(MAPT), PRIMARY KEY (MADH, MAPT))");
        createTables.add("CREATE TABLE IF NOT EXISTS BAOHANH (MABH text primary key, MADH text not null, NGAYBH text not null, CONSTRAINT FK_BAOHANH_DONDATHANG FOREIGN KEY (MADH) REFERENCES DONDATHANG(MADH))");
        createTables.add("CREATE TABLE IF NOT EXISTS CHITIETBAOHANHXE (MABH text not null, MAXE text not null, NOIDUNGBH text not null, PHIBH int null, MANV text not null, CONSTRAINT FK_CHITIETBAOHANHXE_BAOHANH FOREIGN KEY (MABH) REFERENCES BAOHANH(MABH), CONSTRAINT FK_CHITIETBAOHANHXE_XE FOREIGN KEY (MAXE) REFERENCES XE(MAXE), CONSTRAINT FK_CHITIETBAOHANHXE_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV), PRIMARY KEY (MABH, MAXE, NOIDUNGBH))");
        createTables.add("CREATE TABLE IF NOT EXISTS CHITIETBAOHANHPHUTUNG (MABH text not null, MAPT text not null, NOIDUNGBH text not null, PHIBH int null, MANV text not null, CONSTRAINT FK_CHITIETBAOHANHPHUTUNG_BAOHANH FOREIGN KEY (MABH) REFERENCES BAOHANH(MABH), CONSTRAINT FK_CHITIETBAOHANHPHUTUNG_PHUTUNG FOREIGN KEY (MAPT) REFERENCES PHUTUNG(MAPT), CONSTRAINT FK_CHITIETBAOHANHPHUTUNG_NHANVIEN FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV), PRIMARY KEY (MABH, MAPT, NOIDUNGBH))");

        for(String str : createTables){
            db.execSQL(str);
            Log.d("DBManager","2. onCreate: " + str);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("DBManager","3. onUpgrade");
    }


//BO PHAN
    public void insertBP() { }
    public void updateBP() { }
    public void loadBP() { }
    public void deleteBP() { }


//NHAN VIEN
    public void insertNV() { }
    public void updateNV() { }
    public void loadNV() { }
    public void deleteNV() { }


//KHACH HANG
    public void insertKH() { }
    public void updateKH() { }
    public void loadKH() { }
    public void deleteKH() { }


//NHA CUNG CAP
    public void insertNCC() { }
    public void updateNCC() { }
    public void loadNCC() { }
    public void deleteNCC() { }


//XE
    public void insertXe() { }
    public void updateXe() { }
    public void loadXe() { }
    public void deleteXe() { }


//PHU TUNG
    public void insertPT() { }
    public void updatePT() { }
    public void loadPT() { }
    public void deletePT() { }


//THONG SO XE
    public void insertTSX() { }
    public void updateTSX() { }
    public void loadTSX() { }
    public void deleteTSX() { }


//CHI TIET THONG SO XE
    public void insertCTTSX() { }
    public void updateCTTSX() { }
    public void loadCTTSX() { }
    public void deleteCTTSX() { }


//THONG SO PHU TUNG
    public void insertTSPT() { }
    public void updateTSPT() { }
    public void loadTSPT() { }
    public void deleteTSPT() { }


//DON HANG & CHI TIET DON HANG
    //public void insertDH() { }      ->        public void insertCTDH() { }
    public void loadDH() { }


//CAC PHAN CON LAI TUONG TU
}



