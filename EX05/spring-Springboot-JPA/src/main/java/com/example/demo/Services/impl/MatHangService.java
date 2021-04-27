package com.example.demo.Services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MatHangBO;
import com.example.demo.Repository.MatHangRepository;
import com.example.demo.Services.IMatHangService;

@Service
public class MatHangService implements IMatHangService{
	@Autowired
	MatHangRepository repository;
	@Override
	public List<MatHangBO> getList() {
		List<MatHangBO> list;
		list = repository.findAll();
		return list;
	}
	@Override
	public MatHangBO getOneMatHang(String maHang) {
		return repository.findById(maHang).orElse(new MatHangBO());
	}
	@Override
	public MatHangBO save(MatHangBO matHangBO) {
		return repository.save(matHangBO);
	}
	@Override
	public void delete(String maHang) {
		repository.deleteById(maHang);
		
	}

}
