package com.example.demo.jpa;

import com.example.demo.entity.SanPhamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamJPA extends JpaRepository<SanPhamEntity, Integer> {
    // Bạn có thể thêm các phương thức truy vấn tùy chỉnh ở đây nếu cần
}
