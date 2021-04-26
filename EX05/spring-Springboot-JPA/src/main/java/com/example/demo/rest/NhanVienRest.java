package com.example.demo.rest;

import com.example.demo.Entity.MatHang;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Services.INhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/NhanVien")
public class NhanVienRest {
    @Autowired
    INhanVien iNhanVien;
    @GetMapping("")
    public ResponseEntity<List<NhanVienBO>> getList(){
        List<NhanVienBO> list = iNhanVien.getList();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
