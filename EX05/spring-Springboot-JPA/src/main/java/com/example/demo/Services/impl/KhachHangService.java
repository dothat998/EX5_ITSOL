package com.example.demo.Services.impl;

import com.example.demo.Entity.KhachHangBO;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Repository.KhachHangRepository;
import com.example.demo.Services.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService implements IKhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHangBO> getList() {
        List<KhachHangBO> list;
        list = khachHangRepository.findAll();
        return list;


    }

    @Override
    public KhachHangBO getOneKhachHang(String tenKh) {
        return null;
    }

    @Override
    public KhachHangBO save(KhachHangBO bo) {
        return khachHangRepository.save(bo);
    }

    @Override
    public void delete(String maKH) {

    }
}
