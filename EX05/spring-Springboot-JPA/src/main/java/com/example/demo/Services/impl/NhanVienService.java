package com.example.demo.Services.impl;

import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Repository.NhanVienRepository;
import com.example.demo.mapper.NhanVienMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    public List<NhanVienBO> bos = nhanVienRepository.findAll();
}
