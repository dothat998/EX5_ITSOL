package com.example.demo.Repository;

import com.example.demo.Entity.NhanVienBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  NhanVienRepository extends JpaRepository<NhanVienBO, String> {
//Lưu ý: <NhanVienBO, String>: sẽ có ý nghĩa lần lượt là
//NhanVienBO: Class BO entity
//String: Kiểu dữ liệu của trường đã khai báo annotation @Id
}
