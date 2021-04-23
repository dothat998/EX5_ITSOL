package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mathang")

public class MatHang{
	
	@Id
	@Column( name = "mahang", length = 10)
	private String maHang;
	@Column( name = "tenhang", length =50)
	private String tenHang;
	@Column( name = "macongty", length = 10)
	private String maCongTy;
	@Column( name = "maloaihang")
	private int maLoaiHang;
	@Column( name = "soluong")
	private int soLuong;
	@Column( name = "donvitinh")
	private String donViTinh;
	@Column( name = "giahang")
	private double giaHang;
public MatHang(){}
	public MatHang(String maHang, String tenHang, String maCongTy, int maLoaiHang, int soLuong, String donViTinh, double giaHang) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.maCongTy = maCongTy;
		this.maLoaiHang = maLoaiHang;
		this.soLuong = soLuong;
		this.donViTinh = donViTinh;
		this.giaHang = giaHang;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getMaCongTy() {
		return maCongTy;
	}

	public void setMaCongTy(String maCongTy) {
		this.maCongTy = maCongTy;
	}

	public int getMaLoaiHang() {
		return maLoaiHang;
	}

	public void setMaLoaiHang(int maLoaiHang) {
		this.maLoaiHang = maLoaiHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public double getGiaHang() {
		return giaHang;
	}

	public void setGiaHang(double giaHang) {
		this.giaHang = giaHang;
	}
}
