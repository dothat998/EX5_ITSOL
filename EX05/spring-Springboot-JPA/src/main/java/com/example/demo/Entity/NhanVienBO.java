package com.example.demo.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

    @Entity
    @Table(name = "nhanvien")
    public class NhanVienBO {
        @Id
        @Column(name = "MANHANVIEN")
        private String maNhanVien;
        @Column(name = "HO")
        private String ho;
        @Column(name = "TEN")
        private String ten;
        @Column(name = "NGAYSINH")
        private Date ngaySinh;
        @Column(name = "NGAYLAMVIEC")
        private Date ngayLamViec;
        @Column(name = "DIACHI")
        private String diaChi;
        @Column(name = "DIENTHOAI")
        private String dienThoai;
        @Column(name = "LUONGCOBAN")
        private BigDecimal luongCoBan;
        @Column(name = "PHUCAP")
        private BigDecimal phuCap;

        public NhanVienBO() {
        }

        public String getMaNhanVien() {
            return maNhanVien;
        }

        public void setMaNhanVien(String maNhanVien) {
            this.maNhanVien = maNhanVien;
        }

        public String getHo() {
            return ho;
        }

        public void setHo(String ho) {
            this.ho = ho;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public Date getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(Date ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public Date getNgayLamViec() {
            return ngayLamViec;
        }

        public void setNgayLamViec(Date ngayLamViec) {
            this.ngayLamViec = ngayLamViec;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public String getDienThoai() {
            return dienThoai;
        }

        public void setDienThoai(String dienThoai) {
            this.dienThoai = dienThoai;
        }

        public BigDecimal getLuongCoBan() {
            return luongCoBan;
        }

        public void setLuongCoBan(BigDecimal luongCoBan) {
            this.luongCoBan = luongCoBan;
        }

        public BigDecimal getPhuCap() {
            return phuCap;
        }

        public void setPhuCap(BigDecimal phuCap) {
            this.phuCap = phuCap;
        }
    }
