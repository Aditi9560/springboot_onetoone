package com.mypack.model;

import org.springframework.data.annotation.Reference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
    private float price;
	@OneToOne(cascade = CascadeType.ALL)
	
	@JoinTable(name="product_details",
	joinColumns = {@JoinColumn(name="product_id",referencedColumnName = "id")},
	inverseJoinColumns={@JoinColumn(name="detail_id",referencedColumnName = "id")}
	)
	
	private ProductDetail detail;
	
	public Product() {
		
	}
	public Product(Integer id, String name, float price, ProductDetail detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public ProductDetail getDetail() {
		return detail;
	}
	public void setDetail(ProductDetail detail) {
		this.detail = detail;
	}
	
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
}
