package com.example.demo.Repository;

import com.example.demo.Entity.NhanVienBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  NhanVienRepository extends JpaRepository<NhanVienBO, String> {
}
