package com.example.demo.Services.impl;

import com.example.demo.Entity.MatHang;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Repository.NhanVienRepository;
import com.example.demo.Services.INhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService implements INhanVien {
    @Autowired
    NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVienBO> getList() {
        List<NhanVienBO> list;
        list = nhanVienRepository.findAll();
        return list;
    }

    @Override
    public MatHang getOneNhanVien(String tennv) {
        return null;
    }

    @Override
    public MatHang save(INhanVien nhanVien) {
        return null;
    }

    @Override
    public void delete(String manv) {

    }
}
