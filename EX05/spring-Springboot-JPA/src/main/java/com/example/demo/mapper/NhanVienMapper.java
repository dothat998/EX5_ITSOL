package com.example.demo.mapper;
import com.example.demo.Entity.NhanVienBO;
import com.example.demo.dto.NhanVienDTO;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface NhanVienMapper extends EntityMapper<NhanVienDTO, NhanVienBO>{
}
