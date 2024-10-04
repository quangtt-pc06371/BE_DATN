package com.example.demo.jpa;

import com.example.demo.entity.TuyChonThuocTinhSkuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuyChonThuocTinhSkuJPA extends JpaRepository<TuyChonThuocTinhSkuEntity, Integer> {
    // Bạn có thể thêm các phương thức truy vấn tùy chỉnh ở đây nếu cần
}
