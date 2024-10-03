package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poly.entity.ShopEntity;
import com.poly.service.ShopService;

@RestController
@RequestMapping("/api/Shops")
public class ShopController {
    @Autowired
    private ShopService ShopService;

    @GetMapping
    public List<ShopEntity> getAllShopEntitys() {
        return ShopService.getAllShopEntitys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopEntity> getShopEntityById(@PathVariable int id) {
        ShopEntity ShopEntity = ShopService.getShopEntityById(id);
        if (ShopEntity != null) {
            return new ResponseEntity<>(ShopEntity, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    //Thêm shop mới
    @PostMapping
    public ResponseEntity<ShopEntity> addShopEntity(@RequestBody ShopEntity ShopEntity) {
        ShopEntity newShopEntity = ShopService.addShopEntity(ShopEntity);
        return new ResponseEntity<>(newShopEntity, HttpStatus.CREATED);
    }
    //Update Shop
    @PutMapping("/{id}")
    public ResponseEntity<ShopEntity> updateShopEntity(@PathVariable int id, @RequestBody ShopEntity ShopEntityDetails) {
        ShopEntity updatedShopEntity = ShopService.updateShopEntity(id, ShopEntityDetails);
        if (updatedShopEntity != null) {
            return new ResponseEntity<>(updatedShopEntity, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    //Xóa Shop
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShopEntity(@PathVariable int id) {
        ShopService.deleteShopEntity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
