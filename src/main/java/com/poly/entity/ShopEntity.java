package com.poly.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SHOP")
public class ShopEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SHOP")
    private int id;

    @Column(name = "SHOP_NAME", nullable = false)
    private String name;

    @Column(name = "SHOP_DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "SHOP_RATING", nullable = false)
    private String rating;

    @Column(name = "CREATE_AT", nullable = false)
    private String createdAt;

    @Column(name = "UPDATE_AT", nullable = false)
    private String updatedAt;

    @Column(name = "SOLUONGFOLLOW", nullable = false)
    private int soLuongFollow;

    @ManyToOne
    @JoinColumn(name = "ID_NGUOIDUNG", nullable = false)
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "ID_KHUYENMAI", nullable = false)
    private KhuyenMai khuyenMai;

    @OneToOne
    @JoinColumn(name = "SAO_DANH_GIA", nullable = false)
    private DanhGiaShop danhGiaShop;

}

