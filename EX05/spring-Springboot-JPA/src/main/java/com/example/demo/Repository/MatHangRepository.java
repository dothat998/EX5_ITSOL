package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.MatHangBO;
@Repository
public interface MatHangRepository extends JpaRepository<MatHangBO, String>{

}
