package com.example.demo.mapper;

import com.example.demo.Entity.KhachHangBO;
import com.example.demo.dto.KhachHangDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KhachHangMapper extends EntityMapper<KhachHangDTO, KhachHangBO>{
}
