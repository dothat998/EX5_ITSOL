package com.example.demo.Services;

import com.example.demo.Entity.MatHang;
import com.example.demo.Entity.NhanVienBO;

import java.util.List;

public interface INhanVien {
    List<NhanVienBO> getList();
    MatHang getOneNhanVien(String tennv);
    MatHang save(INhanVien nhanVien);
    void delete(String manv);
}
