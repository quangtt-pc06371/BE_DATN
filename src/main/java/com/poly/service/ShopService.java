package com.poly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.entity.ShopEntity;
import com.poly.repository.ShopRepository;


@Service
public class ShopService {
	@Autowired
	private ShopRepository ShopRepository;

	public List<ShopEntity> getAllShopEntitys() {
		return ShopRepository.findAll();
	}

	public ShopEntity getShopEntityById(int id) {
		return ShopRepository.findById(id).orElse(null);
	}

	public ShopEntity addShopEntity(ShopEntity ShopEntity) {
		return ShopRepository.save(ShopEntity);
	}

	public ShopEntity updateShopEntity(int id, ShopEntity ShopEntityDetails) {
		ShopEntity ShopEntity = ShopRepository.findById(id).orElse(null);
		if (ShopEntity != null) {
			ShopEntity.setName(ShopEntityDetails.getName());
			ShopEntity.setDescription(ShopEntityDetails.getDescription());
			ShopEntity.setRating(ShopEntityDetails.getRating());
			ShopEntity.setCreatedAt(ShopEntityDetails.getCreatedAt());
			ShopEntity.setUpdatedAt(ShopEntityDetails.getUpdatedAt());
			ShopEntity.setSoLuongFollow(ShopEntityDetails.getSoLuongFollow());
			ShopEntity.setNguoiDung(ShopEntityDetails.getNguoiDung());
			ShopEntity.setKhuyenMai(ShopEntityDetails.getKhuyenMai());
			ShopEntity.setDanhGiaShop(ShopEntityDetails.getDanhGiaShop());
			return ShopRepository.save(ShopEntity);
		}
		return null;
	}

	public void deleteShopEntity(int id) {
		ShopRepository.deleteById(id);
	}
}
