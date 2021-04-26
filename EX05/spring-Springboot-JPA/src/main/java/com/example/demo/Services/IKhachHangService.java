package com.example.demo.Services;

import com.example.demo.Entity.KhachHangBO;


import java.util.List;

public interface IKhachHangService {
    List<KhachHangBO> getList();
    KhachHangBO getOneKhachHang(String tenKh);
    KhachHangBO save(KhachHangBO bo);
    void delete(String maKH);
}
