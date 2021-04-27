package com.example.demo.Controller;

import com.example.demo.Entity.KhachHangBO;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.Services.INhanVien;
import com.example.demo.Services.impl.NhanVienService;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.mapper.NhanVienMapper;
import lombok.experimental.Delegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nv")
public class NhanVienController {
    @Autowired
    INhanVien iNhanVien;

    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    NhanVienMapper nhanVienMapper;

    @GetMapping("/eml-not")
    public ResponseEntity<List<NhanVienDTO>> getListResponseEntity(){
        List<NhanVienDTO> dataRpNV= nhanVienService.getEmpNotSales();
        return ResponseEntity.ok(dataRpNV);
    }

    @GetMapping("")
    public ResponseEntity<List<NhanVienBO>> getList(){
        List<NhanVienBO> list = iNhanVien.getList();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PostMapping("")
    public ResponseEntity saveOfUpdate(@RequestBody NhanVienDTO nhanVienDTO){

        NhanVienBO bo = nhanVienMapper.toEntity(nhanVienDTO);
        iNhanVien.save(bo);
        return ResponseEntity.status(HttpStatus.OK).body(nhanVienMapper.toDto(bo));
    }

    @DeleteMapping("/{maNV}")
    public  ResponseEntity<String> delete(@PathVariable String maNV){
        iNhanVien.delete(maNV);
        return ResponseEntity.ok("Xoa Thanh cong");
    }

}
