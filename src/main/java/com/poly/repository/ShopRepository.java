package com.poly.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.entity.ShopEntity;

@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {
	
	 	List<ShopEntity> findAll();

	    Optional<ShopEntity> findById(Integer id);
}

