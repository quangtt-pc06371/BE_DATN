package com.poly.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SHOP")
public class ShopHieuEntity implements Serializable {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID_SHOP")
	    private Integer idShop;

	    @Column(name = "SHOP_NAME")
	    private String shopName;

	    @Column(name = "SHOP_DESCRIPTION")
	    private String shopDescription;

	    @Column(name = "SHOP_RATING")
	    private String shopRating;

	    @Column(name = "CREATE_AT")
	    private Date createAt;

	    @Column(name = "UPDATE_AT")
	    private Date updateAt;
	    
	    @OneToMany(mappedBy = "shop")
	    @JsonBackReference
	    private List<SanPhamEntity> sanPham;

	    @OneToMany(mappedBy = "shop")
	    @JsonBackReference(value = "khuyenMai")
	    private List<KhuyenMaiEntity> khuyenMai;


}
