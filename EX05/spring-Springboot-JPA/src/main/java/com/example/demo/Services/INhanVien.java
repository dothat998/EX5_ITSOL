package com.example.demo.Services;

import com.example.demo.Entity.MatHangBO;
import com.example.demo.Entity.NhanVienBO;

import java.util.List;

public interface INhanVien {
    List<NhanVienBO> getList();
    NhanVienBO getOneNhanVien(String tennv);
    NhanVienBO save(NhanVienBO nhanVien);
    void delete(String manv);

}
