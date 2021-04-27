package com.example.demo.Services;

import java.util.List;


import com.example.demo.Entity.MatHangBO;


public interface IMatHangService {
	List<MatHangBO> getList();
	MatHangBO getOneMatHang(String maHang);
	MatHangBO save(MatHangBO matHangBO);
	void delete(String maHang);
}
