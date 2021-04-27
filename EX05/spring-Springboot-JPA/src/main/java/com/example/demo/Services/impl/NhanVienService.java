package com.example.demo.Services.impl;

import com.example.demo.Entity.MatHangBO;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Repository.NhanVienRepository;
import com.example.demo.Services.INhanVien;
import com.example.demo.dao.NhanVienDAO;
import com.example.demo.dto.NhanVienDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService implements INhanVien {
    @Autowired
    NhanVienRepository nhanVienRepository;

    @Autowired
    private NhanVienDAO nhanVienDAO;
    public List<NhanVienDTO> getEmpNotSales(){
        return nhanVienDAO.getEmployeeNotSales();
    }

    @Override
    public List<NhanVienBO> getList() {
        List<NhanVienBO> list;
        list = nhanVienRepository.findAll();
        return list;
    }

    @Override
    public NhanVienBO getOneNhanVien(String tennv) {
        return null;
    }

    @Override
    public NhanVienBO save(NhanVienBO nhanVien) {

        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(String manv) {
        nhanVienRepository.deleteById(manv);
    }
}
