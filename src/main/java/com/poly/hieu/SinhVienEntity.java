package com.poly.hieu;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SINHVIEN")
public class SinhVienEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MASV")
	private int maSV;
	
	@Column(name = "TENSV")
	private String tenSV;
	
	@Column(name = "SDT")
	private String sdt;
	
	@Column(name = "DIACHI")
	private String diaChi;
	
	@Column(name = "DIEM")
	private int diem;
	
	
}
