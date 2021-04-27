package com.example.demo.Controller;

import com.example.demo.Entity.KhachHangBO;
import com.example.demo.Services.IKhachHangService;
import com.example.demo.dto.KhachHangDTO;
import com.example.demo.mapper.KhachHangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/kh")
public class KhachHangController {
    @Autowired
    IKhachHangService iKhachHangService;
    @Autowired
    KhachHangMapper khachHangMapper;

    @GetMapping("")
    public ResponseEntity<List<KhachHangBO>> getListKH(){
        List<KhachHangBO> listKH = iKhachHangService.getList();
        return  ResponseEntity.status(HttpStatus.OK).body(listKH);
    }

    @PostMapping("")
    public ResponseEntity saveOrUpdate(@RequestBody KhachHangDTO dto){
        if (dto != null) {
            KhachHangBO bo = khachHangMapper.toEntity(dto);
            iKhachHangService.save(bo);
            return ResponseEntity.status(HttpStatus.OK).body(khachHangMapper.toDto(bo));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @DeleteMapping("/delete-kh/{maKhachHang}")
    public ResponseEntity<String> deleteKh(@PathVariable String maKhachHang) {
        iKhachHangService.delete(maKhachHang);
        return ResponseEntity.ok("Thanh cong");
    }

}
