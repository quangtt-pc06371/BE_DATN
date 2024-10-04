package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ShopEntity;

@Repository
public interface ShopJPA extends JpaRepository<ShopHieuEntity, Integer>{

}
